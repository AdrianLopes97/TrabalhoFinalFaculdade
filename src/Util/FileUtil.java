package Util;


import Entities.Information;
import Entities.SchoolClass;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileUtil {

    // save a string to a file
    public static void saveStringToFile(File file, String content, boolean append) {
        try {
            FileWriter writer = new FileWriter(file, append);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // reads a file and returns a string
    public static String getStringFromFile(File file) {
        String content;
        FileInputStream fis;

        try {
            fis = new FileInputStream(file);
            content = IOUtils.toString(fis);
            fis.close();
        } catch (IOException e) {
            content = "";
            System.out.println("Error: " + e.getMessage());
        }

        return content;
    }
    public static void save(File file, File folder, Information info) {
        createFile(file,folder,info);
        FileUtil.saveStringToFile(file, new Gson().toJson(info), false);
    }

    private static void createFile(File file,File folder,Information info) {
        if (!folder.exists())
            folder.mkdir();

        if (!file.exists()) {
            FileUtil.saveStringToFile(file, new Gson().toJson(info), false);
        }
    }

    public static Information loadFileData(File file,File folder,Information info) {
        createFile(file,folder,info);
        Information aClass = new Gson().fromJson(FileUtil.getStringFromFile(file), Information.class);
        return aClass;
    }
}
