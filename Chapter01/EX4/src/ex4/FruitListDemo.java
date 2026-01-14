/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

/**
 *
 * @author tanbinhgas
 */
import java.util.ArrayList;

public class FruitListDemo {

    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("Danh sach ban dau:          " + fruits);
        
        fruits.add(1, "Mango");
        System.out.println("Sau khi them Mango: " + fruits);
        
        int indexBanana = fruits.indexOf("Banana");
        if (indexBanana != -1) {
            fruits.set(indexBanana, "Grapes");
        }
        System.out.println("Sau khi thay Banana bang Grapes: " + fruits);
        
        boolean coApple = fruits.contains("Apple");
        System.out.println("Co chua \"Apple\" trong danh sach khong? " + coApple);
        
        if (coApple) {
            System.out.println("\"Apple\" van ton tai trong danh sach.");
        } else {
            System.out.println("\"Apple\" khong con trong danh sach.");
        }
    }
}
