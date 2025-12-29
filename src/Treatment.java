class Treatment {
    protected String description;

    Treatment(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}