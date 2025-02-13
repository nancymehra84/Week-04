package common_problem.insurance_policy_management_system_using_map;

import java.util.*;

class Policy {
    String policyNumber;
    String policyholderName;
    Date expiryDate;

    public Policy(String policyNumber, String policyholderName, Date expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Policyholder: " + policyholderName + ", ExpiryDate: " + expiryDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }
}

public class InsurancePolicyManagementSystem {
    private static Map<String, Policy> policyMap = new HashMap<>();
    private static Map<String, Policy> linkedPolicyMap = new LinkedHashMap<>();

    // TreeMap that sorts policies based on expiry date
    private static Map<String, Policy> sortedPolicyMap = new TreeMap<>(Comparator.comparing(policyNumber -> policyMap.get(policyNumber).getExpiryDate()));

    public static void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        linkedPolicyMap.put(policy.policyNumber, policy);
        sortedPolicyMap.put(policy.policyNumber, policy); // Automatically sorted by expiryDate
    }

    public static Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public static List<Policy> listExpiringPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30); // Date after 30 days
        Date thresholdDate = calendar.getTime();

        for (Policy policy : sortedPolicyMap.values()) {
            if (policy.getExpiryDate().before(thresholdDate)) {
                expiringPolicies.add(policy);
            }
        }

        return expiringPolicies;
    }

    public static List<Policy> listPoliciesByPolicyholder(String policyholderName) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : sortedPolicyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    public static void removeExpiredPolicies() {
        Date currentDate = new Date();
        sortedPolicyMap.values().removeIf(policy -> policy.getExpiryDate().before(currentDate));
    }

    public static void printPolicies(Map<String, Policy> policyMap) {
        for (Policy policy : policyMap.values()) {
            System.out.println(policy);
        }
    }

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        addPolicy(new Policy("P01", "Nancy Mehra", calendar.getTime()));

        calendar.add(Calendar.DAY_OF_YEAR, 40);
        addPolicy(new Policy("P02", "Muskan Gupta", calendar.getTime()));

        calendar.add(Calendar.DAY_OF_YEAR, -5);
        addPolicy(new Policy("P03", "Rishika Bisht", calendar.getTime()));

        System.out.println("All Policies (insertion order):");
        printPolicies(linkedPolicyMap);

        System.out.println("\nGet Policy P01:");
        System.out.println(getPolicyByNumber("P01"));

        System.out.println("\nPolicies expiring within 30 days:");
        List<Policy> expiringPolicies = listExpiringPolicies();
        for (Policy policy : expiringPolicies) {
            System.out.println(policy);
        }

        System.out.println("\nPolicies for Muskan Gupta:");
        List<Policy> muskanPolicies = listPoliciesByPolicyholder("Muskan Gupta");
        for (Policy policy : muskanPolicies) {
            System.out.println(policy);
        }

        System.out.println("\nRemoving expired policies...");
        removeExpiredPolicies();

        System.out.println("\nPolicies after removing expired ones:");
        printPolicies(linkedPolicyMap);
    }
}


