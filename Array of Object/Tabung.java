/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author ACER
 */
public class Tabung {
    public double jariJari;
    public double tinggi;

    public Tabung() {

    }

    public Tabung(double jr, double t) {
        jariJari = jr;
        tinggi = t;
    }

    public double luasPermukaan() {
        double luasAlas;
        double selimut;

        luasAlas = (3.14) * jariJari * jariJari;
        selimut = (2 * (3.14) * jariJari) * tinggi;

        return (2 * (luasAlas)) + selimut;
    }

    public double volume() {
        return ((3.14) * jariJari * jariJari) * tinggi;
    }
}
