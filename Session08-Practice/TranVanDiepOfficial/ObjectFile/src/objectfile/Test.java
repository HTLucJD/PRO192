
package objectfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tan Luc
 */
public class Test {
    public static void main(String[] args) {
        saveFile();
    }
    
    public static void saveFile() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("A", "Ha Noi"));
        studentList.add(new Student("B", "Binh Dinh"));
        studentList.add(new Student("C", "Gia Lai"));
        
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("student.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
