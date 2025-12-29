import java.util.ArrayList;
import java.util.List;

class Prescription {
    private Doctor doctor;
    private Patient patient;
    private List<Treatment> treatments;

    Prescription(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        this.treatments = new ArrayList<>();
    }

    void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    List<Treatment> getTreatments() {
        return treatments;
    }

    Doctor getDoctor() {
        return doctor;
    }

    Patient getPatient() {
        return patient;
    }

    @Override
    public String toString() {
        return "Rx [Dr. " + doctor.name + "]: " + treatments;
    }
}