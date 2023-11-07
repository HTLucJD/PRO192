/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author Tan Luc
 */
public class BufferReader {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        File f = new File("E:\\PRO192\\Session08-Practice\\TITV\\BufferReader\\BufferReader\\File.txt");
//        try {  
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while (true) {                
//                line = br.readLine();
//                if (line == null)
//                    break;
//                else 
//                    System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
            for (String line : allText) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
