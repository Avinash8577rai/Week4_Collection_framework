package Day2.QueueInterface.HospitalTriageSystem;

import java.util.*;

public class HospitalTriage {

        public static void main(String[] args) {

            PriorityQueue<Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> -p.severity));


            triageQueue.add(new Patient("Avinash", 3));
            triageQueue.add(new Patient("Ankit", 5));
            triageQueue.add(new Patient("BAbuRao" , 2));


            System.out.println("Order of Treatment:");
            while (!triageQueue.isEmpty()) {
                System.out.println(triageQueue.poll());
            }
        }
    }
