import java.time.LocalDateTime;

class Appointment {
    private LocalDateTime dateTime;
    private Patient patient;
    private Doctor doctor;

    Appointment(LocalDateTime dateTime, Patient patient, Doctor doctor) {
        this.dateTime = dateTime;
        this.patient = patient;
        this.doctor = doctor;
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }

    Patient getPatient() {
        return patient;
    }

    Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Appointment: " + dateTime + " | Dr. " + doctor.name + " <-> " + patient.name;
    }
}