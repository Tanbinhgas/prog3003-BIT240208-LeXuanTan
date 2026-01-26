/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

/**
 *
 * @author tanbinhgas
 */
class TV {
    public void on() {
        System.out.println("TV: Bat tivi");
    }
    
    public void off() {
        System.out.println("TV: Tat tivi");
    }
    
    public void setInput(String input) {
        System.out.println("TV: Chuyen dau vao sang " + input);
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Sound System: Bat loa");
    }
    
    public void off() {
        System.out.println("Sound System: Tat loa");
    }
    
    public void setVolume(int level) {
        System.out.println("Sound System: Đat am luong muc " + level);
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("DVD Player: Bat dau DVD");
    }
    
    public void off() {
        System.out.println("DVD Player: Tat dau DVD");
    }
    
    public void play(String movie) {
        System.out.println("DVD Player: Phat phim \"" + movie + "\"");
    }
    
    public void stop() {
        System.out.println("DVD Player: Dung phat");
    }
}

class HomeTheaterFacade {
    
    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;
    
    public HomeTheaterFacade(TV tv, SoundSystem sound, DVDPlayer dvd) {
        this.tv = tv;
        this.sound = sound;
        this.dvd = dvd;
    }
    
    public void watchMovie(String movie) {
        System.out.println("Chuan bi xem phim: " + movie + "...");
        
        tv.on();
        tv.setInput("DVD");
        
        sound.on();
        sound.setVolume(15);
        
        dvd.on();
        dvd.play(movie);
        
        System.out.println("Bat dau xem phim");
    }
    
    public void endMovie() {
        System.out.println("\nKet thuc xem phim");
        
        dvd.stop();
        dvd.off();
        
        sound.off();
        
        tv.off();
        
        System.out.println("He thong da tat");
    }
}

public class HomeTheaterDemo {
    
    public static void main(String[] args) {
        
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        DVDPlayer dvd = new DVDPlayer();
        
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, sound, dvd);
        
        homeTheater.watchMovie("Avengers: Endgame");
        
        System.out.println("\n===Xem phim xong sau 3 tieng===");
        
        homeTheater.endMovie();
    }
}
