class Student extends Person {
    public String nim;
    public Course course;

    public Student(String id, String nama, int age, String nim) {
        super(id, nama, age);
        this.nim = nim;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String getDetails() {
        return "Student: " + nama + ", Age: " + age + ", NIM: " + nim;
    }
}
