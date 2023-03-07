/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author ACER
 */
public class LimasPersegi {
    public double rusukAlas;
    public double tinggi;
    
    public LimasPersegi() {
        
    }
    
    public LimasPersegi(double ra, double t) {
        rusukAlas = ra ;
        tinggi = t;
    }

    public double luasAlas() {
        return rusukAlas * rusukAlas;
    }

    public double tinggiSisiTegak() {
        return Math.sqrt((((0.5) * rusukAlas) * ((0.5) * rusukAlas)) + (tinggi * tinggi));
    }

    public double luasSisiTegak() {
        return (0.5) * rusukAlas * tinggiSisiTegak();
    }

    public double luasPermukaan() {
        return (4 * luasSisiTegak()) + luasAlas(); 
    }

    public double volume() {
        return ((luasAlas() * tinggi) / 3);
    }
}
