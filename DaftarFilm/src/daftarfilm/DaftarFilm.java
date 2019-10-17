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
public class DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film f1=new Film();
        Film f2=new Film();
        Film f3=new Film();
        Film f4=new Film();
        
        
        f1.nowPlaying("Venom","Action",8.5,120);
        f2.nowPlaying("Small Foot","Animation",9.0,96);
        f3.nowPlaying("Crazy Rich Asian","Comedy",7.0,119);
        f4.nowPlaying("Asih","Horror",6.0,100);
    }
    
}
