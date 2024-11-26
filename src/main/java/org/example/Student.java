package org.example;

public class Student {
    private String name;
    private String Phone;

    public Student(String name, String phone) {
        this.name = name;
        Phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
