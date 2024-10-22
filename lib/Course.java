class Course {
    public String code;
    public String name;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String update(String name) {
        this.name = name;
        return this.name;
    }
}
