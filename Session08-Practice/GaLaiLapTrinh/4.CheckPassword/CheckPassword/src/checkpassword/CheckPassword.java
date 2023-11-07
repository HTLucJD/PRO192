/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checkpassword;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class CheckPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
        while (true) {
            System.out.println("Password must be at least 6 character, 1 letter and 1 number!");
            System.out.println("Please set a password: ");
            String newPassword = sc.nextLine();
            if (checkPass(newPassword)) {
                password = newPassword;
                System.out.println("Valid password");
                break;
            } else {
                System.out.println("Invalid password");
            }
        }
        String login = "";
        int count = 0;
        while (true) {
            System.out.println("Please input password login: ");
            login = sc.nextLine();
            if (login.equals(password)) {
                System.out.println("Logged in successfully!");
                break;
            } else {
                System.out.println("Invalid password. Please input again!");
                count++;
            }
        if (count == 5){
            System.out.println("You have entered incorrectly 5 times. Login is locked!");
            break;
        }
        }
    }

    //Hàm kiểm tra tính hợp lệ của mật khẩu
    public static boolean checkPass(String password) {
        if (password.length() < 6) {
            return false;
        }
        boolean hasLeter = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLeter = true;
                break;
            }
        }
        if (!hasLeter) {
            return false;
        }
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }
        return true;
    }
}
