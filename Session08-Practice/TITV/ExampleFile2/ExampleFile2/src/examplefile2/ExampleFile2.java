/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examplefile2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ExampleFile2 {

    File file;

    public ExampleFile2(String nameFile) {
        this.file = new File(nameFile);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.print("Input  name file: ");
        String nameFile = sc.nextLine();
        ExampleFile2 exampleFile = new ExampleFile2(nameFile);
        do {            
            System.out.println("=================================");
            System.out.println("              MENU               ");
            System.out.println("1. Chekck the file is executable.");
            System.out.println("2. Check the file is readable.");
            System.out.println("3. Check the file is writable.");
            System.out.println("4. Print path file");
            System.out.println("5. Print file name");
            System.out.println("6. Check the file is directory of file.");
            System.out.println("7. Print list subfolder");
            System.out.println("8. Print folder tree");
            System.out.println("0. Exit program.");
            System.out.print("Please input your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("File can execute: "+exampleFile.isExecute());
                    break;
                case 2:
                    System.out.println("File can read: "+exampleFile.isRead());
                    break;
                case 3:
                    System.out.println("File can write: "+exampleFile.isWrite());
                    break;
                case 4:
                    exampleFile.printPath();
                    break;
                case 5:
                    exampleFile.printName();
                    break;
                case 6:
                    exampleFile.isDirectoryOrFile();
                    break;
                case 7:
                    exampleFile.subFile();
                    break;
                case 8:
                    exampleFile.printFolderTree();
                default:
                    throw new AssertionError();
            }
        } while (choice != 0);
    }
    
    public boolean isExecute() {
        return this.file.canExecute();
    }
    
    public boolean isRead() {
        return this.file.canRead();
    }
    
    public boolean isWrite() {
        return this.file.canWrite();
    }
    
    public void printPath() {
        System.out.println(this.file.getAbsolutePath());
    }
    
    public void printName() {
        System.out.println(this.file.getName());
    }
    
    public void isDirectoryOrFile() {
        if (this.file.isDirectory())
            System.out.println("It's directory");
        else if (this.file.isFile())
            System.out.println("It's file");
   }
   
    public void subFile() {
       if (file.isDirectory()) {
           System.out.println("The subfile/subdirectory are: ");
           File[] sub = file.listFiles();
           for (File i : sub) {
               System.out.println(i.getAbsolutePath());
           }
       }
       else if (file.isFile())
           System.out.println("This is a file with no data inside");      
   }
    public void printFolderTree() {
        printDetailFolderTree(this.file, 1);
    }
    
    public void printDetailFolderTree(File f, int level) {
        for (int i = 0; i < level; i++){
            System.out.print("\t");
        }
            System.out.print("|__");
            System.out.println(f.getName());
            if (f.canRead() && f.isDirectory()) {
            File[] subArr = f.listFiles();
            for (File fx : subArr) {
                printDetailFolderTree(fx, level+1);
            }
        }
    }
}
