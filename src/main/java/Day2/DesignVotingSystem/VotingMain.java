package Day2.DesignVotingSystem;

import java.util.Map;

public class VotingMain {
    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine();
        VoteManager voteManager = new VoteManager(votingMachine);

        // Cast votes
        voteManager.registerVote("Alice");
        voteManager.registerVote("Bob");
        voteManager.registerVote("Alice");
        voteManager.registerVote("Charlie");
        voteManager.registerVote("Bob");
        voteManager.registerVote("Alice");

        // Display voting results
        System.out.println("Vote Order: " + voteManager.getVoteOrder());
        System.out.println("Sorted Results: " + voteManager.getSortedResults());
    }
}

