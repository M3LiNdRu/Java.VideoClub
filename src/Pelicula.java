/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
//import javax.swing.*;
/**
 *
 * @author ceina
 */
public class Pelicula {
    private static int id = 0;
    private String nom;
    private int any;
    private String director;
    private String genere;
    private double preucost;
    private double lloguer;
    private double total;
    
    
    public Pelicula() {
        
    }
    
    public Pelicula(String name,int date, String dir, String gen, double prize,double llog, double tot) {
        this.id++;
        this.nom = name;
        this.any = date;
        this.director = dir;
        this.genere = gen;
        this.preucost = prize;
        this.lloguer = llog;
        this.total = tot;
        
    }
    
    public boolean guardarPeli() {
        try {
            RandomAccessFile fsortida = new RandomAccessFile("Pelis.txt", "rw");
            fsortida.seek(fsortida.length()); //Poses el punter al final del fitxer
            fsortida.writeUTF(Integer.toString(id)); //Escrius i incrementes el punter
            fsortida.writeUTF(nom);       //Escrius i incrementes el punter
            fsortida.writeUTF(Integer.toString(any));         //Escrius i incrementes el punter
            fsortida.writeUTF(director);       //Escrius i incrementes el punter
            fsortida.writeUTF(genere);      //Escrius i incrementes el punter
            fsortida.writeUTF(Double.toString(preucost)); //Escrius i incrementes el punter
            fsortida.writeUTF(Double.toString(lloguer));//Escrius i incrementes el punter
            fsortida.writeUTF(Double.toString(total)); //Escrius i incrementes el punter
            fsortida.close();               //Tanques el fitxer
        } catch (IOException error) {
            return false;
        }
       return true; 
    }
}
