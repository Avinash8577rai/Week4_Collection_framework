package Day2.DesignVotingSystem;

import java.util.*;

public class VoteManager {
    private LinkedHashMap<String, Integer> voteOrder;
    private VotingMachine votingMachine;

    public VoteManager(VotingMachine votingMachine) {
        this.votingMachine = votingMachine;
        this.voteOrder = new LinkedHashMap<>();
    }

    public void registerVote(String candidate) {
        votingMachine.castVote(candidate);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
    }

    public Map<String, Integer> getSortedResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(votingMachine.getResults());
        return sortedResults;
    }

    public Map<String, Integer> getVoteOrder() {
        return voteOrder;
    }
}
