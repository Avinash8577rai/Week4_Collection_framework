package Day1Generics.AIDrivenResumeScreeningSystem;

import java.util.Arrays;
import java.util.List;

    public class Main {
        public static void main(String[] args) {
            Resume<SoftwareEngineer> seResume = new Resume<>("Alice Johnson", "Java, Spring Boot, Algorithms, Data Structures", new SoftwareEngineer());
            Resume<DataScientist> dsResume = new Resume<>("Bob Smith", "Python, Deep Learning, SQL, Data Science", new DataScientist());
            Resume<ProductManager> pmResume = new Resume<>("Charlie Brown", "Business Strategy, Market Analysis, Agile", new ProductManager());

            List<Resume<? extends JobRole>> resumeList = Arrays.asList(seResume, dsResume, pmResume);

            ResumeScreening.screenResumes(resumeList);
        }
    }

