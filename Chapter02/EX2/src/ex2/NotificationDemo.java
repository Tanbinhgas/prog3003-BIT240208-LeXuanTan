/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author tanbinhgas
 */
interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gui thong bao qua SMS: Tin nhan da duoc gui den so dien thoai cua ban");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gui thong bao qua Email: Email da duoc gui den hop thu cua ban");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gui thong bao Push: Thong bao da xuat hien tren thiet bi cua ban");
    }
}

class NotificationFactory {
    
    public static Notification createNotification(String channel) {
        if (channel == null || channel.trim().isEmpty()) {
            throw new IllegalArgumentException("Channel khong duocc de trong!");
        }
        
        String channelUpper = channel.toUpperCase().trim();
        
        switch (channelUpper) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Khong ho tro kenh thong bao: " + channel);
        }
    }
}

public class NotificationDemo {
    
    public static void main(String[] args) {
        
        try {
            Notification sms = NotificationFactory.createNotification("SMS");
            sms.notifyUser();
            
            Notification email = NotificationFactory.createNotification("email");
            email.notifyUser();
            
            Notification push = NotificationFactory.createNotification("PUSH");
            push.notifyUser();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
