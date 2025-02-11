package Day1Generics.AIDrivenResumeScreeningSystem;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

    public class ResumeTest {

        @Test
        public void testEligibility() {
            Resume<SoftwareEngineer> seResume = new Resume<>("Alice Johnson", "Java, Spring Boot, Algorithms, Data Structures", new SoftwareEngineer());
            assertTrue(seResume.isEligible());

            Resume<DataScientist> dsResume = new Resume<>("Bob Smith", "Python, Deep Learning", new DataScientist());
            assertFalse(dsResume.isEligible()); // Missing SQL
        }

        @Test
        public void testScreeningProcess() {
            Resume<ProductManager> pmResume = new Resume<>("Charlie Brown", "Business Strategy, Market Analysis, Agile", new ProductManager());

            List<Resume<? extends JobRole>> resumes = Arrays.asList(pmResume);
            assertDoesNotThrow(() -> ResumeScreening.screenResumes(resumes));
        }
    }


