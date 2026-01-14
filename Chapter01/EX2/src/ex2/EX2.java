/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author tanbinhgas
 */
public class EX2 {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        
        Integer[] numbers = {5, 10, 15, 20, 25};
        
        System.out.println("Cac phan tu trong mang Integer:");
        printArray(numbers);
        
        System.out.println("\n---\n");
        
        String[] words = {"Xin", "chao", "Java", "Generic", "NetBeans"};
        
        System.out.println("Cac phan tu trong mang String:");
        printArray(words);
        
        System.out.println("\n---\n");
        Double[] doubles = {1.5, 2.718, 3.14159};
        System.out.println("Cac phan tu trong mang Double:");
        printArray(doubles);
    }
}
