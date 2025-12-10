class Receptionist extends Staff {
    Receptionist(String name, int age) {
        super(name, age, "Receptionist");
    }

    @Override
    void performDuties() {
        System.out.println("Receptionist " + name + " is scheduling appointments and answering phones.");
    }
}