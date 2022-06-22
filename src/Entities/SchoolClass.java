package Entities;

import java.util.List;

public class SchoolClass {
    private String ClassName;
    private Teacher Teacher;
    private List<Student> Students;

    public SchoolClass() {
    }

    public SchoolClass(String className, Entities.Teacher teacher, List<Student> students) {
        ClassName = className;
        Teacher = teacher;
        Students = students;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public Teacher getTeacher() {
        return Teacher;
    }

    public void setTeacher(Teacher teacher) {
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
                "ClassName='" + ClassName + '\'' +
                ", Teacher=" + Teacher +
                ", Students=" + Students +
                '}';
    }
}
