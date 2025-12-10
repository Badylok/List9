// Defining the Doctor subclass which adds specific medical methods
class Doctor extends Staff {
    private String specialty;

    Doctor(String name, int age, String specialty) {
        super(name, age, "Doctor");
        this.specialty = specialty;
    }

    @Override
    void performDuties() {
        System.out.println("Dr. " + name + " is diagnosing patients in " + specialty + ".");
    }

    void prescribeMedicine(String medicine) {
        System.out.println("Dr. " + name + " prescribes " + medicine + ".");
    }
}