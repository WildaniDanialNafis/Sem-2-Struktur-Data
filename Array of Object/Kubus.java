/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author ACER
 */
public class Kubus {
    public double rusuk;
    
    public Kubus() {

    }

    public Kubus(double r) {
        rusuk = r;
    }

    public double luasPermukaan() {
        return 6 * (rusuk * rusuk);
    }

    public double volume() {
        return rusuk * rusuk * rusuk;
    }
}
