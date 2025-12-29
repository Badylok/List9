import java.util.ArrayList;
import java.util.List;

// here patient class extends Person and implements the Treatable interface
class Patient extends Person implements Treatable {
    private String condition;
    private List<Prescription> prescriptions;
    private List<Appointment> appointments; // New list

    Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
        this.prescriptions = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    String getCondition() { return condition; }

    void addPrescription(Prescription p) { prescriptions.add(p); }
    List<Prescription> getPrescriptions() { return prescriptions; }

    void addAppointment(Appointment a) { appointments.add(a); }
    List<Appointment> getAppointments() { return appointments; }

    @Override
    void introduce() {
        System.out.println("Hi, I am " + name + ", a patient suffering from " + condition);
    }

    @Override
    public void receiveTreatment() {
        System.out.println("Patient " + name + " is receiving treatment for " + condition);
    }
}