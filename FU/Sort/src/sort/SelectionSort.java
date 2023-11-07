/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

/**
 *
 * @author Tan Luc
 */
public class SelectionSort {
     public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product C", 10.99);
        products.add(new Product("Product A", 5.99);
        products.add(new Product("Product B", 7.99);

        // Sort the list of products by price in ascending order
        selectionSort(products, Comparator.comparingDouble(product -> product.price));

        // Print the sorted list of products
        for (Product product : products) {
            System.out.println(product.name + ": " + product.price);
        }
    }

    public static <T> void selectionSort(List<T> list, Comparator<? super T> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
