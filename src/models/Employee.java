package models;

public class Employee {

    private String name;
    private String position;
    private String email;
    private long phone;
    private int age;

    public Employee(String name, String position, String email, long phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name is " + name + '\'' +
                ", position is " + position + '\'' +
                ", email: " + email + '\'' +
                ", phone: " + phone +
                ", age is " + age +
                '}';
    }
}
