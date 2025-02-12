package DesignVotingSystem;
import Day2.DesignVotingSystem.VotingMachine;
import Day2.DesignVotingSystem.VoteManager;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class VotingSystemTest {

    @Test
    void testVoteCasting() {
        VotingMachine machine = new VotingMachine();
        machine.castVote("Alice");
        machine.castVote("Bob");
        machine.castVote("Alice");

        Map<String, Integer> results = machine.getResults();
        assertEquals(2, results.get("Alice"));
        assertEquals(1, results.get("Bob"));
    }

    @Test
    void testVoteOrdering() {
        VotingMachine machine = new VotingMachine();
        VoteManager manager = new VoteManager(machine);

        manager.registerVote("Alice");
        manager.registerVote("Bob");
        manager.registerVote("Alice");

        Map<String, Integer> voteOrder = manager.getVoteOrder();
        assertEquals(2, voteOrder.get("Alice"));
        assertEquals(1, voteOrder.get("Bob"));
    }

    @Test
    void testSortedResults() {
        VotingMachine machine = new VotingMachine();
        VoteManager manager = new VoteManager(machine);

        manager.registerVote("Charlie");
        manager.registerVote("Alice");
        manager.registerVote("Bob");
        manager.registerVote("Alice");

        Map<String, Integer> sortedResults = manager.getSortedResults();
        List<String> sortedKeys = new ArrayList<>(sortedResults.keySet());

        assertEquals("Alice", sortedKeys.get(0));
        assertEquals("Bob", sortedKeys.get(1));
        assertEquals("Charlie", sortedKeys.get(2));
    }
}

