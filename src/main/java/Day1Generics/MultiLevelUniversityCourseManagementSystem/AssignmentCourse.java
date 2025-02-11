package Day1Generics.MultiLevelUniversityCourseManagementSystem;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationMethod() {
        return "Evaluation: Assignments & Projects";
    }
}
