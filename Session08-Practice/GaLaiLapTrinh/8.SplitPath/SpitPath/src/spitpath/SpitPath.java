/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spitpath;

/**
 *
 * @author ACER
 */
public class SpitPath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "d:/galailaptrinh/music/remix.mp3";
        int lastSlashIndex = path.lastIndexOf("/");
        String fileName = path.substring(lastSlashIndex+1);
        System.out.println("File name: " + fileName);
        int lastDotIndex = fileName.lastIndexOf(".");
        String nameOnly = fileName.substring(lastDotIndex+1);
        System.out.println("Only file name: " + nameOnly);
    }

}
