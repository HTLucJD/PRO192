/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sort;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Tan Luc
 */
public class InsertionSort {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product C", 10.99));
        products.add(new Product("Product A", 5.99));
        products.add(new Product("Product B", 7.99));

        // Sort the list of products by price in ascending order
        insertionSort(products, Comparator.comparingDouble(product -> product.price));

        // Print the sorted list of products
        for (Product product : products) {
            System.out.println(product.name + ": " + product.price);
        }
    }

    public static <T> void insertionSort(List<T> list, Comparator<? super T> comparator) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            T key = list.get(i);
            int j = i - 1;

            // Move elements of list[0..i-1] that are greater than the key's value
            while (j >= 0 && comparator.compare(list.get(j), key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
