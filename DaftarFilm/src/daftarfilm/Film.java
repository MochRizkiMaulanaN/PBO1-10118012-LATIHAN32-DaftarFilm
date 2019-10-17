/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarfilm;

/**
 *
 * @author LENOVO
 */
public class Film {
    public String nama;
    public String genre;
    public double rating;
    public int durasi;
    
    public void nowPlaying(String nama,String genre,double nrating,int durasi){
        System.out.println("Judul Film "+nama);
        System.out.println("Genre Film "+genre);
        System.out.println("Rating Film "+rating);
        System.out.println("Durasi Film "+durasi+" Menit \n");
    }
    
}
