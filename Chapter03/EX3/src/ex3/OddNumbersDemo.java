/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
/**
 *
 * @author tanbinhgas
 */
public class OddNumbersDemo {

    public static void main(String[] args) {

        // B1
        CompletableFuture<int[]> future = CompletableFuture.supplyAsync(() -> {
            int[] array = {1, 2, 5, 3, 100};
            System.out.println("B1: Da cung cap mang: " + Arrays.toString(array));
            return array;
        });

        // B2
        CompletableFuture<int[]> processed = future.thenApply(arr -> {
            int[] odds = Arrays.stream(arr)
                               .filter(n -> n % 2 == 1)
                               .sorted()
                               .toArray();

            System.out.println("B2: So le sau khi sap xep: " + Arrays.toString(odds));
            return odds;
        });

        // B3
        CompletableFuture<String> resultString = processed.thenApply(odds -> {
            String str = "Ket qua la: " + Arrays.toString(odds);
            return str;
        });

        // B4
        resultString.thenAccept(finalText -> {
            System.out.println("B4: " + finalText);
        });

        resultString.join();
    }
}
