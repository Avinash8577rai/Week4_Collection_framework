package Day1Generics.MultiLevelUniversityCourseManagementSystem;

    public class ResearchCourse extends CourseType {
        public ResearchCourse(String courseName) {
            super(courseName);
        }

        @Override
        public String getEvaluationMethod() {
            return "Evaluation: Research Paper Submission";
        }
    }

