package Entities;

import java.util.List;

public class Student extends Person {

    private List<Integer> Grades;

    public Student(String name, int age, String addres, String phoneNumber, List<Integer> grades) {
        super(name, age, addres, phoneNumber);
        Grades = grades;
    }

    public List<Integer> getGrades() {
        return Grades;
    }
    public void setGrades(List<Integer> grades) {
        Grades = grades;
    }
    public void addGrade(int grade) {
        Grades.add(grade);
    }
    @Override
    protected int gradeAverage(List<Integer> values) {
        return values.stream().mapToInt(i -> i).sum() / values.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "Grades=" + Grades +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Addres='" + Addres + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
