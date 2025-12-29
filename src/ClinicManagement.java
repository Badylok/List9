// 4. I design the interface to support the required operations
interface ClinicManagement {
    void addAppointment(Appointment appointment);
    void printPatientAppointments(Patient patient);
    void printDoctorSchedule(Doctor doctor);
    void addPrescription(Prescription prescription);
    void printPatientPrescriptions(Patient patient);
    void printPatientsByMedicine(String medicineName);
}