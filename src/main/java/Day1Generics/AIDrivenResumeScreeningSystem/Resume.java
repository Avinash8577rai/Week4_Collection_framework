package Day1Generics.AIDrivenResumeScreeningSystem;

public class Resume<T extends JobRole> {
    private String candidateName;
    private String candidateSkills;
    private T jobRole;

    public Resume(String candidateName, String candidateSkills, T jobRole) {
        this.candidateName = candidateName;
        this.candidateSkills = candidateSkills;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getCandidateSkills() {
        return candidateSkills;
    }

    public T getJobRole() {
        return jobRole;
    }

    public boolean isEligible() {
        for (String skill : jobRole.getRequiredSkills().split(", ")) {
            if (!candidateSkills.contains(skill)) {
                return false; // Candidate does not have all required skills
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return candidateName + " applying for " + jobRole.getRoleName() +
                "\nSkills: " + candidateSkills +
                "\nRequired: " + jobRole.getRequiredSkills() +
                "\nEligibility: " + (isEligible() ? "Eligible ✅" : "Not Eligible ❌");
    }
}
