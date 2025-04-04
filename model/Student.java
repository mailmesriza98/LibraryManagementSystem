package model;

public class Student {
    String name;
    String id;
    String department;
    int rollno;

    public Student(String name, String id, String department, int rollno) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public int getRollno() {
        return rollno;
    }
}
