package Entities;

import java.util.List;

public abstract class Person {
    protected String Name;
    protected int Age;
    protected String Address;
    protected String PhoneNumber;

    public Person(String name, int age, String address, String phoneNumber) {
        Name = name;
        Age = age;
        Address = address;
        PhoneNumber = phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddres(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    protected abstract int gradeAverage(List<Integer> values);
}
