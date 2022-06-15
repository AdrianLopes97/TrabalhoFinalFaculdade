package Entities;

import java.util.List;

public class SchoolClass {
    private Teacher Teacher;
    private List<Student> Students;

    public SchoolClass(Entities.Teacher teacher, List<Student> students) {
        Teacher = teacher;
        Students = students;
    }

    public Entities.Teacher getTeacher() {
        return Teacher;
    }

    public void setTeacher(Entities.Teacher teacher) {
        Teacher = teacher;
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> students) {
        Students = students;
    }

    public void addStudent(Student student) {
        Students.add(student);
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "Teacher=" + Teacher +
                ", Students=" + Students +
                '}';
    }
}
