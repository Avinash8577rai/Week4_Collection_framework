package Day1Generics.AIDrivenResumeScreeningSystem;

import java.util.List;

    public class ResumeScreening {
        public static void screenResumes(List<? extends Resume<? extends JobRole>> resumes) {
            System.out.println("AI Screening Results:");
            for (Resume<? extends JobRole> resume : resumes) {
                System.out.println("---------------------------------");
                System.out.println(resume);
            }
        }
    }

