/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author tanbinhgas
 */
// File: Test.java
public class Test<T> {
    
    private T value;
    
    public void set(T t) {
        this.value = t;
    }
    
    public T get() {
        return this.value;
    }
    
    public static void main(String[] args) {
        
        Test<Integer> testInt = new Test<>();
        
        testInt.set(2025);
        System.out.println("Gia tri Integer: " + testInt.get());
        
        Test<String> testStr = new Test<>();
        
        testStr.set("Xin chao Java Generic");
        System.out.println("Gia tri String: " + testStr.get());
        
        Test<Double> testDouble = new Test<>();
        testDouble.set(3.14159);
        System.out.println("Gia tri Double: " + testDouble.get());
    }
}
