package Day1Generics.MultiLevelUniversityCourseManagementSystem;

    public class Course<T extends CourseType> {
        private String courseCode;
        private int credits;
        private T courseType;

        public Course(String courseCode, int credits, T courseType) {
            this.courseCode = courseCode;
            this.credits = credits;
            this.courseType = courseType;
        }

        public String getCourseCode() { return courseCode; }
        public int getCredits() { return credits; }
        public T getCourseType() { return courseType; }

        @Override
        public String toString() {
            return "Course Code: " + courseCode + " | " +
                    "Credits: " + credits + " | " +
                    "Course: " + courseType.getCourseName() + " | " +
                    courseType.getEvaluationMethod();
        }
    }

