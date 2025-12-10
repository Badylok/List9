// I am creating an abstract class Staff that extends person and adds a role field
abstract class Staff extends Person {
    protected String role;

    Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    abstract void performDuties();

    @Override
    void introduce() {
        System.out.println("I am " + name + ", working as a " + role + ".");
    }
}