import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

// setting up the ClinicTest class
class ClinicTest {
    static void main(String[] args) {
        System.out.println("Clinic System Initializing \n");

        ClinicManager system = new ClinicManager();

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
        // Doctor specific action (Legacy)
        doctor.prescribeMedicine("Tamiflu");

        // Nurse specific action
        nurse.checkVitals(patient1);
        nurse.checkVitals(patient2);

        //new List10 functionality

        System.out.println("\nScheduling Appointments");

        // Receptionist books Jan Kowalski
        LocalDateTime time1 = LocalDateTime.of(2023, Month.OCTOBER, 10, 9, 0);
        receptionist.createAppointment(patient1, doctor, time1, system);

        // Nurse books Artur Nowak
        LocalDateTime time2 = LocalDateTime.of(2023, Month.OCTOBER, 10, 10, 0);
        nurse.createAppointment(patient2, doctor, time2, system);

        System.out.println("Testing Overlap Restriction:");
        // Trying to book Jan Kowalski into an already taken slot
        receptionist.createAppointment(patient1, doctor, time2, system);

        System.out.println("\nWriting Prescriptions");

        // Prescribing for Jan Kowalski
        List<Treatment> treatList1 = new ArrayList<>();
        treatList1.add(new Medicine("Tamiflu"));
        treatList1.add(new Treatment("Bed Rest"));
        doctor.createPrescription(patient1, treatList1, system);

        // Prescribing for Artur Nowak
        List<Treatment> treatList2 = new ArrayList<>();
        treatList2.add(new Medicine("Ibuprofen"));
        treatList2.add(new Medicine("Tamiflu"));
        doctor.createPrescription(patient2, treatList2, system);

        System.out.println("\nSystem Queries");

        system.printDoctorSchedule(doctor);
        System.out.println();

        system.printPatientAppointments(patient1);
        System.out.println();

        system.printPatientPrescriptions(patient1);
        System.out.println();

        // Check who is taking Tamiflu
        system.printPatientsByMedicine("Tamiflu");
    }
}