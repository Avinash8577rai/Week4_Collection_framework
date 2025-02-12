package Day2.QueueInterface.HospitalTriageSystem;

public class Patient {
        String name;
        public int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }
