package Entities;

import java.util.ArrayList;
import java.util.List;

public class Information {
    private List<SchoolClass> schoolClasses;

    public Information() {
        this.schoolClasses = new ArrayList<>();
    }

    public List<SchoolClass> getSchoolClasses() {
        return schoolClasses;
    }

    public void setSchoolClasses(List<SchoolClass> schoolClasses) {
        this.schoolClasses = schoolClasses;
    }

    public void addSchoolClasses(SchoolClass schoolClasse) {
        schoolClasses.add(schoolClasse);
    }

    @Override
    public String toString() {
        return "Information{" +
                "schoolClasses=" + schoolClasses +
                '}';
    }
}
