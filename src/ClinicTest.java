import java.util.ArrayList;
import java.util.List;

// setting up the ClinicTest class
class ClinicTest {
    static void main(String[] args) {
        System.out.println("Clinic System Initializing \n");

        // Instantiating the objects for our simulation
        Doctor doctor = new Doctor("Grzegorz Wiśnia", 50, "Diagnostic Medicine");
        Nurse nurse = new Nurse("Jakub Krupa", 35);
        Receptionist receptionist = new Receptionist("Anna Bąk", 28);
        Patient patient1 = new Patient("Jan Kowalski", 40, "Flu");
        Patient patient2 = new Patient("Artur Nowak", 25, "Broken Arm");

        // I group all people into a single list
        List<Person> people = new ArrayList<>();
        people.add(doctor);
        people.add(nurse);
        people.add(receptionist);
        people.add(patient1);
        people.add(patient2);

        // 1. Introducing everyone in the list
        System.out.println("Introductions");
        for (Person p : people) {
            p.introduce();
        }

        // 2. Staff members perform their assigned duties
        System.out.println("\n Staff Duties");
        List<Staff> staffMembers = new ArrayList<>();
        staffMembers.add(doctor);
        staffMembers.add(nurse);
        staffMembers.add(receptionist);

        for (Staff s : staffMembers) {
            s.performDuties();
        }

        // 3. I am treating the patients now
        System.out.println("\n Patient Treatment");
        patient1.receiveTreatment();
        patient2.receiveTreatment();

        // 4. Demonstrates unique methods specific to subclasses
        System.out.println("\n Specific Actions");
        // Doctor specific action
        doctor.prescribeMedicine("Tamiflu");

        // Nurse specific action
        nurse.checkVitals(patient1);
        nurse.checkVitals(patient2);
    }
}