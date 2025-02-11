package Day1Generics.AIDrivenResumeScreeningSystem;


    public class DataScientist extends JobRole {
        public DataScientist() {
            super("Python, Machine Learning, Deep Learning, SQL");
        }

        @Override
        public String getRoleName() {
            return "Data Scientist";
        }
    }


