import java.util.ArrayList;
import java.util.List;

// I implement the ClinicManagement logic here
class ClinicManager implements ClinicManagement {
    private List<Appointment> allAppointments = new ArrayList<>();
    private List<Prescription> allPrescriptions = new ArrayList<>();

    @Override
    public void addAppointment(Appointment newAppt) {
        // I am checking for overlapping appointments for the doctor
        for (Appointment existing : allAppointments) {
            if (existing.getDoctor().equals(newAppt.getDoctor())) {
                if (existing.getDateTime().equals(newAppt.getDateTime())) {
                    System.out.println("Dr. " + newAppt.getDoctor().name + " is busy at " + newAppt.getDateTime());
                    return;
                }
            }
        }

        // I add the appointment if the slot is free
        allAppointments.add(newAppt);

        if (!newAppt.getPatient().getAppointments().contains(newAppt)) {
            newAppt.getPatient().addAppointment(newAppt);
        }
        if (!newAppt.getDoctor().getAppointments().contains(newAppt)) {
            newAppt.getDoctor().addAppointment(newAppt);
        }
        System.out.println("Appointment scheduled for " + newAppt.getPatient().name);
    }

    @Override
    public void printPatientAppointments(Patient patient) {
        System.out.println("Appointments for " + patient.name);
        for (Appointment a : patient.getAppointments()) {
            System.out.println(a);
        }
    }

    @Override
    public void printDoctorSchedule(Doctor doctor) {
        System.out.println("Schedule for Dr. " + doctor.name);
        for (Appointment a : doctor.getAppointments()) {
            System.out.println(a);
        }
    }

    @Override
    public void addPrescription(Prescription prescription) {
        allPrescriptions.add(prescription);
        if (!prescription.getPatient().getPrescriptions().contains(prescription)) {
            prescription.getPatient().addPrescription(prescription);
        }
        System.out.println("Prescription recorded for " + prescription.getPatient().name);
    }

    @Override
    public void printPatientPrescriptions(Patient patient) {
        System.out.println("Prescriptions for " + patient.name);
        for (Prescription p : patient.getPrescriptions()) {
            System.out.println(p);
        }
    }

    @Override
    public void printPatientsByMedicine(String medicineName) {
        System.out.println("Patients on " + medicineName);
        for (Prescription p : allPrescriptions) {
            for (Treatment t : p.getTreatments()) {
                if (t instanceof Medicine && t.getDescription().equalsIgnoreCase(medicineName)) {
                    System.out.println(p.getPatient().name + " / Prescribed by Dr. " + p.getDoctor().name);
                }
            }
        }
    }
}