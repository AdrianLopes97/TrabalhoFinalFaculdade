package Entities;

import java.util.List;
import java.util.Scanner;

public class Teacher extends Person {
    public Teacher() {
        super("", 0, "", "");
    }
    public static Teacher registerTeacher(Scanner scanner){
        Teacher teacher = new Teacher();
        System.out.print("\nInformacoes do professor:\n");
        System.out.print("Nome do professor: ");
        teacher.setName(scanner.next());
        System.out.print("Idade do professor: ");
        teacher.setAge(scanner.nextInt());
        System.out.print("Endereco do professor: ");
        teacher.setAddres(scanner.next());
        System.out.print("Telefone do professor: ");
        teacher.setPhoneNumber(scanner.next());

        return teacher;
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
                ", Address='" + Address + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
