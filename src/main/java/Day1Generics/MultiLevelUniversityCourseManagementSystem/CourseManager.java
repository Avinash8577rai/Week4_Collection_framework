package Day1Generics.MultiLevelUniversityCourseManagementSystem;

import java.util.List;

    public class CourseManager {
        public static void displayCourses(List<? extends CourseType> courses) {
            for (CourseType course : courses) {
                System.out.println(course.getCourseName() + " - " + course.getEvaluationMethod());
            }
        }
    }

