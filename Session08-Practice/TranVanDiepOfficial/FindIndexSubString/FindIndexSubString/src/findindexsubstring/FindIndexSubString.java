/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findindexsubstring;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tan Luc
 */
public class FindIndexSubString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sourceStr;
        String searchingStr;
        System.out.println("Nhap chuoi nguon: ");
        sourceStr = scan.nextLine();
        System.out.println("Nhap chuoi tim kiem: ");
        searchingStr = scan.nextLine();
        //tim ra so lan xuat hien searchingStr trong sourceStr & index
        //indexOf >= 0 -> index xuat hien cua searchingStr trong source
//        int index = sourceStr.indexOf(searchingStr);
//        System.out.println("index: " + index);
        //Cach 1: ko toi uu => for tu dau toi cuoi
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sourceStr.length(); i++) {
            int index = sourceStr.indexOf(searchingStr, i);
            if(index >= 0 && !list.contains(index)) {
                count++;
                list.add(index);
                System.out.println("index: " + index);
            }
        }
        System.out.println("Count: " + count);
        //Cach 2 : Toi uu source & performent
        System.out.println("======= Cach 2 ============");
        count = 0;
        for (int i = 0; i < sourceStr.length();) {
            int index = sourceStr.indexOf(searchingStr, i);
            if(index >= 0) {
                count++;
                i = index + 1;
                System.out.println("index: " + index);
            } else {
                break;
            }
        }
        System.out.println("Count: " + count);
    }
}
