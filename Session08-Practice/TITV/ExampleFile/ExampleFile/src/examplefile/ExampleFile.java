/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examplefile;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class ExampleFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File folder1 = new File("E:\\PRO192\\Session08-Practice\\ExampleFile");
        
        System.out.println("Check folder 1 exists or not: "+ folder1.exists());
    
        //Tạo thư mục
        //Phương thức mkdir
        File d1 = new File("E:\\PRO192\\Session08-Practice\\ExampleFile\\Directory1");
        d1.mkdir();
        File d2 = new File("E:\\PRO192\\Session08-Practice\\ExampleFile\\Directory1\\Directory2\\Directory3");
        d2.mkdirs();
        
        //Tạo tập tin (có phần mở rộng: .exe, .txt, .doc ...)
        File file1 = new File("E:\\PRO192\\Session08-Practice\\ExampleFile\\Directory1\\Example1.txt");
        try {
            file1.createNewFile();
        } catch (IOException ex) {
            //Không có quyền tạo tập tin
            //Ổ cứng bị đầy
            //Đường dẫn sai
            Logger.getLogger(ExampleFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
