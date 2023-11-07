/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dictionary;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author ACER
 */
public class Dictionary {

    private Map<String, String> data = new TreeMap<String, String>();    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        int choice = 0;
        do {
            System.out.println("=======================================");
            System.out.println("MENU:");
            System.out.println("Search dictionary English - VietNam\n"
            + "1. Add word(Key word, Meaning)\n"
            + "2. Delete word\n"
            + "3. Search meaning of keyword\n"
            + "4. Print list words\n"
            + "5. Print the number of words\n"
            + "6. Delete all words\n"
            + "0. Quit\n");
            System.out.println("Input your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            
            switch (choice) {
                case 1:
                    System.out.println("Input the keyword: ");
                    String keyWord = sc.nextLine();
                    System.out.println("Input the meaning: ");
                    String meaning = sc.nextLine();
                    dictionary.addWord(keyWord, meaning);
                    break;
                case 2:
                    System.out.println("Input the keyword: ");
                    keyWord = sc.nextLine();
                    dictionary.removeWord(keyWord);
                    break;
                case 3:
                    System.out.println("Input the keyword: ");
                    keyWord = sc.nextLine();
                    System.out.println("The meaning of "+ keyWord+" : "+dictionary.searchWord(keyWord)); 
                    break;
                case 4:
                    dictionary.printWord();
                    break;
                case 5:
                    System.out.println("The number of word: "+ dictionary.sizeSet());
                    break;
                case 6:
                    dictionary.removeAllWord();
                    break;
                case 0:
                    System.out.println("Bye bye!!!");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 0);
    }
    
    public String addWord(String word, String meaning) {
        return this.data.put(word, meaning);
    }
    
    public String removeWord(String word) {
        return this.data.remove(word);
    }
     
    public String searchWord(String word) {
        return this.data.get(word);
    }
    
    public void printWord() {
        Set<String> wordSet = this.data.keySet();
        System.out.println(Arrays.toString(wordSet.toArray()));
    }
    
    public int sizeSet() {
        return this.data.size();
    }
    
    public void removeAllWord() {
        this.data.clear();
    }
}
