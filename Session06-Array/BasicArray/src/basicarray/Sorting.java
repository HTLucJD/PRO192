/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicarray;

//F6 mặc định chạy main đầu tiên
//Mở lên và Shift + F6 chạy main thứ 2
public class Sorting {
    public static void main(String[] args) {
        sortStudentList();
    }
    
    public static void sortStudentList() {
        Student arr[] = new Student[]{new Student("SE9", "CHÍN", 19 ,9),
                                      new Student("SE5", "NĂM", 15 ,5),
                                      new Student("SE7", "BẢY", 17 ,7),
                                      new Student("SE3", "BA", 13 ,3),
                                      new Student("SE8", "TÁM", 18 ,8)
                                      };
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.length-1; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
           
        System.out.println("The student list after sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
    public static void sortPrimitiveArray() {
        int arr[] = new int[] {1000, -1000, 1000, 5, 10, -15, -20};
        System.out.println("Before sorting ascending");
        for (int x : arr) 
            System.out.print(x + " ");
        
        System.out.println("\nAfter sorting ascending");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        
    }   
    
}
