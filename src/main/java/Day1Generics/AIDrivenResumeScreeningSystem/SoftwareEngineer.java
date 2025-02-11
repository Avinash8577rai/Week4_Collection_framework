package Day1Generics.AIDrivenResumeScreeningSystem;

    public class SoftwareEngineer extends JobRole {
        public SoftwareEngineer() {
            super("Java, Data Structures, Algorithms, Spring Boot");
        }

        @Override
        public String getRoleName() {
            return "Software Engineer";
        }
    }

