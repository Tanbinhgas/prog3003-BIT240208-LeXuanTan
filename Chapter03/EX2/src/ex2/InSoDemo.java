/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author tanbinhgas
 */
class InSoTask implements Runnable {
    
    private String threadName;
    
    public InSoTask(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + " dang in: " + i);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(threadName + " bi gian doan!");
            }
        }
        
        System.out.println(threadName + " da hoan thanh!");
    }
}

public class InSoDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Main thread bat dau tao thread");
        
        Thread t1 = new Thread(new InSoTask("Thread-1"));
        Thread t2 = new Thread(new InSoTask("Thread-2"));
        Thread t3 = new Thread(new InSoTask("Thread-3"));
        Thread t4 = new Thread(new InSoTask("Thread-4"));
        Thread t5 = new Thread(new InSoTask("Thread-5"));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        System.out.println("Main thread da khoi dong xong thread");
        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            System.out.println("Da chay xong thread");
        } catch (InterruptedException e) {
            System.out.println("Main bi gian doan khi cho");
        }
    }
}
