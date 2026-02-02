/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author tanbinhgas
 */
class WorkerThread extends Thread {
    
    @Override
    public void run() {
        System.out.println("Thread dang chay: " + Thread.currentThread().getName());
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread-A: Lan " + i + " dang lam viec");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread-A bi gian đoan");
            }
        }

        System.out.println("Thread-A hoan thanh!");
    }
}

class WorkerRunnable implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Runnable dang chay: " + Thread.currentThread().getName());
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread-B: Lan " + i + " dang lam viec");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Thread-B bi gian đoan");
            }
        }

        System.out.println("Thread-B hoan thanh!");
    }
}

public class DaLuongDemo {
    public static void main(String[] args) {
    
        System.out.println("Bat dau tao WorkerThread");
        WorkerThread t1 = new WorkerThread();
        t1.setName("Thread-A");
        t1.start();

        System.out.println("Bat dau tao WorkerRunnable");
        WorkerRunnable r1 = new WorkerRunnable();
        Thread t2 = new Thread(r1);
        t2.setName("Thread-B");
        t2.start();

        System.out.println("Main thread da khoi dong");
        
        try {
            t1.join();
            t2.join();
            System.out.println("Main thread: Da hoan thanh!");
        } catch (InterruptedException e) {
            System.out.println("Main thread bi gian đoan khi cho");
        }

        System.out.println("Main thread ket thuc.");
    }
}
