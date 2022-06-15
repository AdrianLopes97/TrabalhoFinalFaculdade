package Entities;

import java.util.List;

public class Teacher extends Person {


    public Teacher(String name, int age, String addres, String phoneNumber) {
        super(name, age, addres, phoneNumber);
    }

    @Override
    protected int gradeAverage(List<Integer> values) {
        return values.stream().mapToInt(i -> i).sum() / values.size();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Addres='" + Addres + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
