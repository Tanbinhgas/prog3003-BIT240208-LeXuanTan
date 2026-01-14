/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

/**
 *
 * @author tanbinhgas
 */
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        
        TreeSet<String> names = new TreeSet<>();
        
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");
        
        System.out.println("Danh sach sau khi them:");
        System.out.println(names);
        
        System.out.println("\nDanh sach chi tiet:");
        for (String name : names) {
            System.out.println("- " + name);
        }
        
        if (!names.isEmpty()) {
            String smallest = names.first();
            String largest  = names.last();
            
            System.out.println("\nPhan tu đau tien: " + smallest);
            System.out.println("Phan tu cuoi cung:  " + largest);
        } else {
            System.out.println("TreeSet rỗng!");
        }
    }
}
