/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author tanbinhgas
 */
public class DatabaseConnection {
    
    private static final DatabaseConnection instance = new DatabaseConnection();
    
    private DatabaseConnection() {
        System.out.println("Khoi tao ket noi database");
    }
    
    public static DatabaseConnection getInstance() {
        return instance;
    }
    
    public void connect() {
        System.out.println("Dang ket noi den database");
    }
    
    public void disconnect() {
        System.out.println("Ngat ket noi database.");
    }
    
    public static void main(String[] args) {
        
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        conn1.connect();
        
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        conn2.connect();
        
        System.out.println("conn1 == conn2 ? " + (conn1 == conn2));
        
    }
}
