package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {

    private List<Integer> Grades;

    public Student() {
        super("", 0, "", "");
        Grades = new ArrayList<>();
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

    public static List<Student> registerStudents(Scanner scanner){
        List<Student> students = new ArrayList<>();
        System.out.print("\n\nQual a quantidade de alunos da turma?");
        int amount = scanner.nextInt();
        for (int i = 0; amount > i; i++){
            Student student = new Student();
            System.out.print("\nInformacoes do aluno: ");
            System.out.print("\nNome do Aluno: ");
            student.setName(scanner.next());
            System.out.print("Idade do Aluno: ");
            student.setAge(scanner.nextInt());
            System.out.print("Endereco do Aluno: ");
            student.setAddres(scanner.next());
            System.out.print("Telefone do Aluno: ");
            student.setPhoneNumber(scanner.next());
            System.out.print("Nota da AP1: ");
            student.addGrade(scanner.nextInt());
            System.out.print("Nota da AP2: ");
            student.addGrade(scanner.nextInt());
            System.out.print("Nota da AS: ");
            student.addGrade(scanner.nextInt());

            students.add(student);
        }
        return students;
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
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
