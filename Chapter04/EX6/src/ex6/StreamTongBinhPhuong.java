/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6;

/**
 *
 * @author tanbinhgas
 */
import java.util.Arrays;
import java.util.List;

public class StreamTongBinhPhuong {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        System.out.println("Danh sach ban dau: " + numbers);
        
        int tong = numbers.stream()
                          .filter(n -> n % 2 == 0)
                          .mapToInt(n -> n * n)
                          .sum();
        
        System.out.println("Tong binh phuong cac so chan: " + tong);
        
        System.out.println("So chan: 2, 4, 6");
        System.out.println("Binh phuong: 4, 16, 36");
        System.out.println("Tong: 56");
    }
}
