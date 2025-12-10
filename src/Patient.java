// here patient class extends Person and implements the Treatable interface
class Patient extends Person implements Treatable {
    private String condition;

    Patient(String name, int age, String condition) {
        super(name, age);
        this.condition = condition;
    }

    String getCondition() {
        return condition;
    }

    @Override
    void introduce() {
        System.out.println("Hi, I am " + name + ", a patient suffering from " + condition + ".");
    }

    @Override
    public void receiveTreatment() {
        System.out.println("Patient " + name + " is receiving treatment for " + condition + ".");
    }
}