/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IOFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tan Luc
 */
public class OutFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("File.text");
//        if (file.exists())
//            System.out.println("File exist");
//        else {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        
        //Ghi du lieu vao file
        FileOutputStream fos = null;
        Scanner sc = new Scanner(System.in);
        try {
            fos = new FileOutputStream("Test.txt");
//            String line = "Huynh Tan Luc";
//            byte[] b = line.getBytes();
//            fos.write(b);
        for(;;) {
            System.out.println("Insert line into file: ");
            String line = sc.nextLine()+"\n";
            byte[] b = line.getBytes();
            fos.write(b);
            System.out.println("Continue Y/N");
            String choose = sc.nextLine();
            if(choose.equalsIgnoreCase("N"))
                break;
        }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OutFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fos.close();
        }
        
        
    }
    
}
