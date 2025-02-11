package Day1Generics.AIDrivenResumeScreeningSystem;


    public abstract class JobRole {
        protected String requiredSkills;

        public JobRole(String requiredSkills) {
            this.requiredSkills = requiredSkills;
        }

        public abstract String getRoleName();

        public String getRequiredSkills() {
            return requiredSkills;
        }
    }


