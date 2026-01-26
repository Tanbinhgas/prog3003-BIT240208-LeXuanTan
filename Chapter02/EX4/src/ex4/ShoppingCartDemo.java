/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

/**
 *
 * @author tanbinhgas
 */
interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Thanh toan " + amount + " VND bang Credit Card");
        System.out.println("So the: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Thanh toan thanh cong!");
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;
    
    public PayPalPayment(String email) {
        this.email = email;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println("Thanh toan " + amount + " VND bang PayPal");
        System.out.println("Tai khoan: " + email);
        System.out.println("Thanh toan thanh cong!");
    }
}

class ShoppingCart {
    
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        System.out.println("Da thay doi phuong thuc thanh toan.");
    }
    
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Loi: Chua chon phuong thuc thanh toan!");
            return;
        }
        
        System.out.println("\n=== Bat dau thanh toan gio hang ===");
        System.out.println("Tong tien: " + amount + " VND");
        
        paymentStrategy.pay(amount);
    }
}

public class ShoppingCartDemo {
    
    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart();
        
        int totalAmount = 2500000;
        
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456");
        cart.setPaymentStrategy(creditCard);
        cart.checkout(totalAmount);
        
        PaymentStrategy payPal = new PayPalPayment("aido?@example.com");
        cart.setPaymentStrategy(payPal);
        cart.checkout(totalAmount);
        
        cart.setPaymentStrategy(null);
        cart.checkout(100000);
    }
}
