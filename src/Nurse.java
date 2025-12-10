// I create the Nurse subclass to handle patient care
class Nurse extends Staff {
    Nurse(String name, int age) {
        super(name, age, "Nurse");
    }

    @Override
    void performDuties() {
        System.out.println("Nurse " + name + " is checking on patients in the ward.");
    }

    void checkVitals(Patient patient) {
        System.out.println("Nurse " + name + " is checking vitals for " + patient.name + ".");
    }
}