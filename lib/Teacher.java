class Teacher extends Person {
    public String fieldType;
    public double salary;

    public Teacher(String id, String nama, int age, String fieldType) {
        super(id, nama, age);
        this.fieldType = fieldType;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getDetails() {
        return "Teacher: " + nama + ", Age: " + age + ", Field: " + fieldType;
    }
}
