package common_problem.insurance_policy_management_system_using_set;

import java.util.*;
import java.text.*;

class Policy {
    String policyNumber;
    String policyholderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Policyholder: " + policyholderName + ", ExpiryDate: " + expiryDate +
                ", CoverageType: " + coverageType + ", PremiumAmount: " + premiumAmount;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public String getCoverageType() {
        return coverageType;
    }
}

public class InsurancePolicyManagementSystem {

    private static Set<Policy> hashSet = new HashSet<>();
    private static Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private static Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));

    public static void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public static Set<Policy> getAllUniquePolicies() {
        return hashSet;
    }

    public static List<Policy> listExpiringSoonPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (Policy policy : treeSet) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringPolicies.add(policy);
            }
        }

        return expiringPolicies;
    }

    public static List<Policy> listPoliciesByCoverageType(String coverageType) {
        List<Policy> policiesByCoverage = new ArrayList<>();
        for (Policy policy : treeSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                policiesByCoverage.add(policy);
            }
        }
        return policiesByCoverage;
    }

    public static Set<Policy> findDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> seenPolicyNumbers = new HashSet<>();
        for (Policy policy : hashSet) {
            if (!seenPolicyNumbers.add(policy.policyNumber)) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    public static void printPolicies(Set<Policy> policySet) {
        for (Policy policy : policySet) {
            System.out.println(policy);
        }
    }

    public static void comparePerformance() {
        int numPolicies = 100000;
        long startTime, endTime;

        // Add policies to HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < numPolicies; i++) {
            addPolicy(new Policy("P" + i, "Policyholder" + i, new Date(), "Health", 1000.00));
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add " + numPolicies + " policies to HashSet: " + (endTime - startTime) + " ns");

        // Add policies to LinkedHashSet
        startTime = System.nanoTime();
        for (int i = 0; i < numPolicies; i++) {
            addPolicy(new Policy("P" + i, "Policyholder" + i, new Date(), "Auto", 1000.00));
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add " + numPolicies + " policies to LinkedHashSet: " + (endTime - startTime) + " ns");

        // Add policies to TreeSet
        startTime = System.nanoTime();
        for (int i = 0; i < numPolicies; i++) {
            addPolicy(new Policy("P" + i, "Policyholder" + i, new Date(), "Home", 1000.00));
        }
        endTime = System.nanoTime();
        System.out.println("Time taken to add " + numPolicies + " policies to TreeSet: " + (endTime - startTime) + " ns");

        // Searching policy in HashSet
        startTime = System.nanoTime();
        hashSet.contains(new Policy("P500", "Policyholder500", new Date(), "Health", 1000.00));
        endTime = System.nanoTime();
        System.out.println("Time taken to search in HashSet: " + (endTime - startTime) + " ns");

        // Searching policy in TreeSet
        startTime = System.nanoTime();
        treeSet.contains(new Policy("P500", "Policyholder500", new Date(), "Health", 1000.00));
        endTime = System.nanoTime();
        System.out.println("Time taken to search in TreeSet: " + (endTime - startTime) + " ns");
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        addPolicy(new Policy("P01", "Muskan Gupta", calendar.getTime(), "Health", 1000.00));

        calendar.add(Calendar.DAY_OF_YEAR, 40);
        addPolicy(new Policy("P02", "Nancy Mehra", calendar.getTime(), "Auto", 1200.00));

        calendar.add(Calendar.DAY_OF_YEAR, -5);
        addPolicy(new Policy("P03", "Rishika Bisht", calendar.getTime(), "Home", 1500.00));

        System.out.println("All Unique Policies:");
        printPolicies(getAllUniquePolicies());

        System.out.println("\nPolicies Expiring Soon (within 30 days):");
        List<Policy> expiringPolicies = listExpiringSoonPolicies();
        for (Policy policy : expiringPolicies) {
            System.out.println(policy);
        }

        System.out.println("\nPolicies with Coverage Type 'Health':");
        List<Policy> healthPolicies = listPoliciesByCoverageType("Health");
        for (Policy policy : healthPolicies) {
            System.out.println(policy);
        }

        System.out.println("\nDuplicate Policies based on Policy Number:");
        Set<Policy> duplicatePolicies = findDuplicatePolicies();
        for (Policy policy : duplicatePolicies) {
            System.out.println(policy);
        }
        System.out.println("\nPerformance Comparison:");
        comparePerformance();
    }
}

