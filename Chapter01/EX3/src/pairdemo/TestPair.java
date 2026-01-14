/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pairdemo;

/**
 *
 * @author tanbinhgas
 */
interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    
    private K key;
    private V value;
    
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public K getKey() {
        return this.key;
    }
    
    @Override
    public V getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return "Pair[" + getKey() + " = " + getValue() + "]";
    }
}

public class TestPair {
    
    public static void main(String[] args) {
        
        Pair<String, Integer> pair1 = new OrderedPair<>("MSSV", 10170);
        
        System.out.println("Cap 1:");
        System.out.println("Key   : " + pair1.getKey());
        System.out.println("Value : " + pair1.getValue());
        System.out.println("toString: " + pair1);
        
        System.out.println("\n---\n");
        
        Pair<String, String> pair2 = new OrderedPair<>("HoTen", "Nguyen Thi Hoa");
        
        System.out.println("Cap 2:");
        System.out.println("Key   : " + pair2.getKey());
        System.out.println("Value : " + pair2.getValue());
        System.out.println("toString: " + pair2);
        
        System.out.println("\n---\n");
        Pair<Integer, Double> pair3 = new OrderedPair<>(1, 9.8);
        System.out.println("Cap thu nghiem: " + pair3);
    }
}
