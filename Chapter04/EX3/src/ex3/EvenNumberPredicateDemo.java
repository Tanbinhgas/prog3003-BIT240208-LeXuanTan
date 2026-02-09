/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

/**
 *
 * @author tanbinhgas
 */
import java.util.function.Predicate;

public class EvenNumberPredicateDemo {
    
    public static void main(String[] args) {
        
        Predicate<Integer> laSoChan = so -> so % 2 == 0;
        
        System.out.println("Kiem tra so chan bang Predicate:");
        
        kiemTraVaIn(10, laSoChan);
        kiemTraVaIn(7, laSoChan);
        kiemTraVaIn(0, laSoChan);
        kiemTraVaIn(-4, laSoChan);
        kiemTraVaIn(15, laSoChan);
    }
    
    private static void kiemTraVaIn(int so, Predicate<Integer> predicate) {
        String ketQua = predicate.test(so) ? "la so chan" : "la so le";
        System.out.println(so + " = " + ketQua);
    }
}
