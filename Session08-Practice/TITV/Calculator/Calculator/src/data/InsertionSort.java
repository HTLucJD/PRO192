/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author ACER
 */
public class InsertionSort implements Sorting {

    @Override
    public void SortingAscending(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > tmp) {
                arr[j+1] = arr[j]; 
                j--;
            }
            arr[j+1] = tmp;
        }
    }

    @Override
    public void SortingDescending(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double tmp = arr[i];
            int j = i -1;
            while (j >=0 && arr[j] < tmp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = tmp;    
        }
    }

}
