package queue_interface.hospital_triage_system;
import java.util.*;
public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        // Adding patients
        triageQueue.add(new Patient("Nancy", 3));
        triageQueue.add(new Patient("Muskan", 5));
        triageQueue.add(new Patient("Rishika", 2));

        System.out.println("Treatment Order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}
