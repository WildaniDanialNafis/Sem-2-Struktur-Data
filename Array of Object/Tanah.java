/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author ACER
 */
public class Tanah {
    public int panjang;
    public int lebar;

    public Tanah() {

    }

    public Tanah(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public int luasTanah() {
        return panjang * lebar;
    }
}
