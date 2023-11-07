/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IOFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tan Luc
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("E:\\PRO192\\Session08-Practice\\TranVanDiepOfficial\\File\\IOFile\\Test.txt");
            
            StringBuilder builder = new StringBuilder();
            int code;
            while ((code = fis.read()) != -1) {                
                builder.append((char) code); 
            }
            System.out.println(builder.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            fis.close();
        }
    }
}
