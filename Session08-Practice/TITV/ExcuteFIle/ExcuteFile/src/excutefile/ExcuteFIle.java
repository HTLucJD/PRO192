/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excutefile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Tan Luc
 */
public class ExcuteFIle {

    public static void copyAll(File f1, File f2) {
        try {
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (f1.isDirectory()) {
            File[] subFiles = f1.listFiles();
            for (File file : subFiles) {
                File file_new = new File(f2.getAbsoluteFile() + "\\" + file.getName());
                copyAll(file, file_new);
            }
        }
    }

    public static void main(String[] args) {
        File f0 = new File("E:\\PRO192\\Session08-Practice\\TITV\\ExcuteFIle\\ExcuteFile\\File1.txt");
        File f1 = new File("E:\\PRO192\\Session08-Practice\\TITV\\ExcuteFIle\\ExcuteFile\\File2.txt");
        File f2 = new File("E:\\PRO192\\Session08-Practice\\TITV\\ExcuteFIle\\ExcuteFile\\File2xyz.txt");

        //Thay doi ten tap tin thu muc
        f0.renameTo(f1);

        //Su dung Files de doi ten
        try {
            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Di chuyen file
        File f2_new = new File("E:\\PRO192\\Session08-Practice\\TITV\\ExcuteFIle\\ExcuteFile\\F0\\File2xyz.txt");
        try {
            Files.move(f2.toPath(), f2_new.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Copy file
        File f_0 = new File("E:\\PRO192\\Session08-Practice\\TITV\\ExcuteFIle\\ExcuteFile\\F0");
        File f_0copy = new File("E:\\PRO192\\Session08-Practice\\TITV\\ExcuteFIle\\ExcuteFile\\F0_copy");

//        try {
//            Files.copy(f_0.toPath(), f_0copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        ExcuteFIle.copyAll(f_0, f_0copy);
    }

}
