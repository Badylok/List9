import java.util.ArrayList;
import java.util.List;

// Defining the Doctor subclass which adds specific medical methods

class Doctor extends Staff {
    private String specialty;
    private List<Appointment> appointments;

    Doctor(String name, int age, String specialty) {
        super(name, age, "Doctor");
        this.specialty = specialty;
        this.appointments = new ArrayList<>();
    }

    // Updated: Doctor writes prescription via Manager
    void createPrescription(Patient patient, List<Treatment> treatments, ClinicManagement system) {
        Prescription rx = new Prescription(this, patient);
        for (Treatment t : treatments) {
            rx.addTreatment(t);
        }
        system.addPrescription(rx);
    }

    void addAppointment(Appointment a) { appointments.add(a); }
    List<Appointment> getAppointments() { return appointments; }

    @Override
    void performDuties() {
        System.out.println("Dr. " + name + " is diagnosing patients in " + specialty);
    }

    void prescribeMedicine(String medicine) {
        System.out.println("Dr. " + name + " prescribes " + medicine);
    }
}