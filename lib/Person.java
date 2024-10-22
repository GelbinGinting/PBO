abstract class Person {
    public String id;
    public String nama;
    public int age;

    public Person(String id, String nama, int age) {
        this.id = id;
        this.nama = nama;
        this.age = age;
    }

    // Metode abstrak
    public abstract String getDetails();
}