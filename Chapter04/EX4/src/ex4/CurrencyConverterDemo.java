/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

/**
 *
 * @author tanbinhgas
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CurrencyConverterDemo {
    
    public static void main(String[] args) {
        
        List<String> currencies = Arrays.asList("$10", "$20", "$50");
        
        System.out.println("Danh sach ban dau: " + currencies);
        
        Function<String, Integer> removeDollarAndParse = currency -> {
            String numberStr = currency.substring(1);
            return Integer.parseInt(numberStr);
        };
        
        List<Integer> amounts = currencies.stream()
                                          .map(removeDollarAndParse)
                                          .collect(Collectors.toList());
        
        System.out.println("Danh sach so sau khi chuyen doi: " + amounts);
        
        System.out.println("\nKet qua chi tiet:");
        amounts.forEach(amount -> System.out.println("Gia tri: " + amount));
    }
}
