package Day1Generics.MultiLevelUniversityCourseManagementSystem;

import java.util.Arrays;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            // Creating different course objects
            Course<ExamCourse> math = new Course<>("MTH101", 4, new ExamCourse("Mathematics"));
            Course<AssignmentCourse> cs = new Course<>("CS201", 3, new AssignmentCourse("Computer Science"));
            Course<ResearchCourse> physics = new Course<>("PHY301", 5, new ResearchCourse("Quantum Physics"));

            // Displaying individual courses
            System.out.println("Course Details:");
            System.out.println(math);
            System.out.println(cs);
            System.out.println(physics);

            // Managing a list of courses dynamically
            List<CourseType> courseList = Arrays.asList(
                    new ExamCourse("Mathematics"),
                    new AssignmentCourse("Computer Science"),
                    new ResearchCourse("Quantum Physics")
            );

            System.out.println("\nAll Available Courses:");
            CourseManager.displayCourses(courseList);
        }
    }


