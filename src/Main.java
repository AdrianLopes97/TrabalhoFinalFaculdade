import Entities.Information;
import Entities.SchoolClass;
import Entities.Student;
import Entities.Teacher;
import Util.FileUtil;
import com.google.gson.Gson;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Util.FileUtil.*;
import static java.lang.System.exit;

public class Main {
    private static final File folder = new File("./data");
    private static final File file = new File("./data/information.json");
    private static String[] options = {"1- Registrar turma ",
            "2- Consultar Turmas",
            "3- Sair",
    };
    private static Information info = new Information();
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {

        int option = 1;
        while (option != 4){
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option){
                    case 1:
                        RegisterClass();
                        break;
                    case 2:
                        consultClasses();
                        break;
                    case 3:
                        exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Escolha sua opcao: ");
    }
    // Options
    private static void RegisterClass() {
        SchoolClass schoolClass = new SchoolClass();

        System.out.print("Informe o nome da Turma: ");
        schoolClass.setClassName(scanner.next());
        schoolClass.setTeacher(Teacher.registerTeacher(scanner));
        schoolClass.setStudents(Student.registerStudents(scanner));

        info.addSchoolClasses(schoolClass);
        FileUtil.save(file,folder,info);
    }
    private static void consultClasses() {
        System.out.println("Classes cadastradas: \n");
        Information information = FileUtil.loadFileData(file,folder,info);
        System.out.println(information.toString() + "\n");
    }
}