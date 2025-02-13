package common_problem.voting_system;

import java.util.*;

public class VotingSystem {
    private static Map<String, Integer> voteMap = new HashMap<>();
    private static Map<String, Integer> sortedVoteMap = new TreeMap<>(Comparator.comparing(voteMap::get).reversed());
    private static Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();

    public static void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVoteMap.put(candidate, voteMap.get(candidate));
    }

    public static int getVotes(String candidate) {
        return voteMap.getOrDefault(candidate, 0);
    }

    public static void displaySortedResults() {
        sortedVoteMap.clear();
        sortedVoteMap.putAll(voteMap);
        System.out.println("Voting Results (Sorted by Votes):");
        for (Map.Entry<String, Integer> entry : sortedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public static void displayOrderedResults() {
        System.out.println("Voting Results (In Order of Votes Cast):");
        for (Map.Entry<String, Integer> entry : orderedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public static void displayCurrentVotes() {
        System.out.println("Current Vote Counts:");
        for (Map.Entry<String, Integer> entry : voteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public static void main(String[] args) {
        castVote("Muskan");
        castVote("Nancy");
        castVote("Muskan");
        castVote("Pragya");
        castVote("Nancy");
        castVote("Muskan");

        displayCurrentVotes();

        displaySortedResults();

        displayOrderedResults();
    }
}

