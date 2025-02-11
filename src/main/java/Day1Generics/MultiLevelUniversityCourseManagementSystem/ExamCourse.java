package Day1Generics.MultiLevelUniversityCourseManagementSystem;

public class ExamCourse extends CourseType {
        public ExamCourse(String courseName) {
            super(courseName);
        }

        @Override
        public String getEvaluationMethod() {
            return "Evaluation: Written Exam";
        }
    }

