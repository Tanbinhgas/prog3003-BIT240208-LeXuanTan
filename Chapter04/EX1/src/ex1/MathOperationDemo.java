/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author tanbinhgas
 */
@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}

public class MathOperationDemo {
    public static void main(String[] args) {

        MathOperation cong = (a, b) -> a + b;

        MathOperation tru = (a, b) -> a - b;

        MathOperation nhan = (a, b) -> a * b;

        MathOperation chia = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Khong chia duoc cho 0");
            }
            return a / b;
        };

        int x = 20;
        int y = 5;

        System.out.println(x + " + " + y + " = " + cong.compute(x, y));
        System.out.println(x + " - " + y + " = " + tru.compute(x, y));
        System.out.println(x + " * " + y + " = " + nhan.compute(x, y));
        System.out.println(x + " / " + y + " = " + chia.compute(x, y));
    }
}
