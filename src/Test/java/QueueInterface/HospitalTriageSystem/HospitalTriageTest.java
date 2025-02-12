package QueueInterface.HospitalTriageSystem;

import Day2.QueueInterface.HospitalTriageSystem.HospitalTriage;
import Day2.QueueInterface.HospitalTriageSystem.Patient;
import org.junit.jupiter.api.Test;
import java.util.PriorityQueue;
import java.util.Comparator;
import static org.junit.jupiter.api.Assertions.*;

    public class HospitalTriageTest {

        @Test
        void testTriageOrder() {
            PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> -p.severity));

            triageQueue.add(new Patient("Avinash", 3));
            triageQueue.add(new Patient("Ankit", 5));
            triageQueue.add(new Patient("BAbuRao", 2));

            assertEquals("Avinash (Severity: 3)", triageQueue.poll().toString());
            assertEquals("Ankit (Severity: 5)", triageQueue.poll().toString());
            assertEquals("BAbuRao (Severity: 2)", triageQueue.poll().toString());
        }


    }

