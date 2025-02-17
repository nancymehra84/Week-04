package common_problem_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import common_problem.voting_system.*;
class VotingSystemTest {


    @Test
    void testCastVote() {
        VotingSystem.castVote("Muskan");
        VotingSystem.castVote("Nancy");
        VotingSystem.castVote("Muskan");

        assertEquals(3, VotingSystem.getVotes("Muskan"));
        assertEquals(2, VotingSystem.getVotes("Nancy"));
    }

    @Test
    void testDisplayCurrentVotes() {
        VotingSystem.castVote("Muskan");
        VotingSystem.castVote("Nancy");

        assertEquals(1, VotingSystem.getVotes("Muskan"));
        assertEquals(1, VotingSystem.getVotes("Nancy"));
    }

    @Test
    void testDisplaySortedResults() {
        VotingSystem.castVote("Muskan");
        VotingSystem.castVote("Nancy");
        VotingSystem.castVote("Muskan");
        assertEquals(5, VotingSystem.getVotes("Muskan"));
        assertEquals(3, VotingSystem.getVotes("Nancy"));
    }

    @Test
    void testDisplayOrderedResults() {
        VotingSystem.castVote("Muskan");
        VotingSystem.castVote("Nancy");
        VotingSystem.castVote("Muskan");

        assertEquals(7, VotingSystem.getVotes("Muskan"));
        assertEquals(4, VotingSystem.getVotes("Nancy"));
    }
}

