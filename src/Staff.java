import java.time.LocalDateTime;

abstract class Staff extends Person {
    protected String role;

    Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    void createAppointment(Patient p, Doctor d, LocalDateTime time, ClinicManagement system) {
        Appointment newAppt = new Appointment(time, p, d);
        system.addAppointment(newAppt);
    }

    abstract void performDuties();

    @Override
    void introduce() {
        System.out.println("I am " + name + ", working as a " + role);
    }
}