package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {

    private final static Scanner sc = new Scanner(System.in);
    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");

    public Validation() {
    }

    public static String inputStr(String msg) {
        System.out.print(msg);
        while (true) {            
            String data = sc.nextLine().trim();
            if (data == null || data.length() == 0) {
                System.err.print("Error: Invalid input, please try again: ");
                continue;
            }
            return data;
        }
    }
    
    public static int inputInt(String msg, int min, int max) {
        System.out.print(msg);
        int data = 0;
        while (true) {            
            try {
                data = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.print("Error: Invalid input, please try again: ");
                continue;
            }
            if (data < min || data > max) {
                System.err.print("Error: Invalid input, please try again: ");
            }
            return data;
        }
    }
    
    public static int inputInt(String msg) {
        System.out.print(msg);
        int data = 0;
        while (true) {            
            try {
                data = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.print("Error: Invalid input, please try again: ");
                continue;
            }
            return data;
        }
    }
    
    public static Date inputDate(String msg) {
        System.out.println(msg);
        dateFormat.setLenient(false);
        while (true) {            
            String data = sc.nextLine().trim();
            Date date = null;
            try {
                date = dateFormat.parse(data);
            } catch (ParseException e) {
                System.err.print("Error: Invalid input, please try again: ");
                continue;
            }  
            return date;
        }
    }
    
    public static Date parseDate(String dateString) {
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}