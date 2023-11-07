/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filmmanagement;

import data.Manufacturer;
import data.Movie;
import data.Showtime;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MovieManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showtime showtime1 = new Showtime(1, 1, 2024);
        Showtime showtime2 = new Showtime(2, 4, 2025);
        Showtime showtime3 = new Showtime(18, 6, 2026);
        Manufacturer manufacturer1 = new Manufacturer("George Lucas", "USA");
        Manufacturer manufacturer2 = new Manufacturer("Steven Spielberg", "USA");
        Manufacturer manufacturer3 = new Manufacturer("Jerry Bruckheimer", "USA");
        Movie movie1 = new Movie("Star Wars", 2021, manufacturer1, 300, showtime1);
        Movie movie2 = new Movie("Jurassic Park", 1993, manufacturer2, 200, showtime2);
        Movie movie3 = new Movie("Beverly Hills cop", 1880, manufacturer3, 100, showtime3);
    }
    
}
