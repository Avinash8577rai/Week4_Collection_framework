package Day1Generics.MultiLevelUniversityCourseManagementSystem;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

    public class CourseTest {

        @Test
        public void testCourseCreation() {
            Course<ExamCourse> math = new Course<>("MTH101", 4, new ExamCourse("Mathematics"));
            assertEquals("Mathematics", math.getCourseType().getCourseName());
            assertEquals(4, math.getCredits());
        }

        @Test
        public void testCourseEvaluationMethod() {
            Course<ResearchCourse> physics = new Course<>("PHY301", 5, new ResearchCourse("Quantum Physics"));
            assertEquals("Evaluation: Research Paper Submission", physics.getCourseType().getEvaluationMethod());
        }

        @Test
        public void testDisplayCourses() {
            List<CourseType> courses = Arrays.asList(
                    new ExamCourse("Math"),
                    new AssignmentCourse("CS"),
                    new ResearchCourse("Physics")
            );
            assertDoesNotThrow(() -> CourseManager.displayCourses(courses));
        }
    }



