/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author tanbinhgas
 */
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortCitiesDemo {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Hanoi", "Ho Chi Minh", "Da Nang", "Hue");
    
        System.out.println("Danh sach ban dau: " + cities);
        
        Collections.sort(cities, (city1, city2) -> {
            return Integer.compare(city1.length(), city2.length());
        });
        
        System.out.println("Sau khi sap xep theo da dai ten: " + cities);
    }
}
