/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deletefile;

import java.io.File;

/**
 *
 * @author Tan Luc
 */
public class DeleteFile {

    public static void deleteFile(File fx) {
        if (fx.isFile()){
            System.out.println("You have been deleted: "+fx.getAbsolutePath());
            fx.delete();
        }
        else if (fx.isDirectory()) {
            File[] subFile = fx.listFiles();
            for (File f : subFile) {
                deleteFile(f);
            }
            System.out.println("You have been deleted: "+fx.getAbsolutePath());
            fx.delete();
        }
    }
    
    public static void main(String[] args) {
        File f0 = new File("E:\\PRO192\\Session08-Practice\\TITV\\DeleteFile\\DeleteFile\\F0");
        File f_test = new File("E:\\PRO192\\Session08-Practice\\TITV\\DeleteFile\\DeleteFile\\test.txt");
        
//        f0.deleteOnExit();
//        f_test.deleteOnExit();
        DeleteFile.deleteFile(f0);
        
    }
    
}
