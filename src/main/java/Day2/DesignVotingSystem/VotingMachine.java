package Day2.DesignVotingSystem;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> voteCounts;

    public VotingMachine() {
        voteCounts = new HashMap<>();
    }

    public void castVote(String candidate) {
        voteCounts.put(candidate, voteCounts.getOrDefault(candidate, 0) + 1);
    }

    public Map<String, Integer> getResults() {
        return voteCounts;
    }
}
