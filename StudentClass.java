

class Student {
    String name;
    int id;
    double cgpa;

    // constructor
    Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", CGPA: " + cgpa);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Rahim", 101, 3.50);
        Student s2 = new Student("Karim", 102, 3.75);
        Student s3 = new Student("Sakib", 103, 3.90);

        s1.display();
        s2.display();
        s3.display();
    }
}
