public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("22202", "Gele", 45, "Matematika");
        teacher.setSalary(5000000);

        Course course = new Course("C001", "Pemrograman Java");
        Student student = new Student("S001", "Ani", 20, "NIM001");
        student.setCourse(course);

        System.out.println(teacher.getDetails());
        System.out.println(student.getDetails());
        System.out.println("Gaji Guru: " + teacher.getSalary());
        System.out.println("Nama Kursus: " + student.getCourse().update("Pemrograman"));
    }
}