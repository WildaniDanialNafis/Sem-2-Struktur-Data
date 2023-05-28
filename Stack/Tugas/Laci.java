/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author WILDANII
 */
public class Laci {
    private int size;
    private int top;
    private Struk[] strk;

    public Laci(int size) {
        this.size = size;
        strk = new Struk[size];
        top = -1;
    }

    public boolean IsFull() {
        if (top == size) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Struk baru) {
        if (!IsFull()) {
            System.out.println("Struk dimasukkan");
            System.out.println(baru.getNoTransaksi() + " " + baru.getTglPembelian() + " " + baru.getJumlahBrg() + " " + baru.getTotalHarga());
            top++;
            strk[top] = baru;
        } else {
            System.out.println("Laci sudah penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            System.out.println("Mengambil struk");
            System.out.println(strk[top].getNoTransaksi() + " " + strk[top].getTglPembelian() + " " + strk[top].getJumlahBrg() + " " + strk[top].getTotalHarga());
            top--;
        } else {
            System.out.println("Laci sudah kosong!");
        }
    }
    
    public void print() {
        System.out.println("Daftar Struk");
        for (int i = top; i >= 0; i--) {
            System.out.println(strk[i].getNoTransaksi() + " " + strk[i].getTglPembelian() + " " + strk[i].getJumlahBrg() + " " + strk[i].getTotalHarga());
        }
    }

    public void peek() {
        System.out.println("Struk teratas");
        System.out.println(strk[top].getNoTransaksi() + " " + strk[top].getTglPembelian() + " " + strk[top].getJumlahBrg() + " " + strk[top].getTotalHarga());
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Laci sudah dikosongkan");
        } else {
            System.out.println("Laci masih kosong");
        }
    }
}
