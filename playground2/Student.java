package playground2;

public class Student {
    String name = "Unknown";
    Student() {}
    Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        Student s2 = new Student("Krishna");
        System.out.println(s2.name);
    }
}
