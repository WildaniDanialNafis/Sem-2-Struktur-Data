/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author ACER
 */
public class ArrayTerbesar {
    private int[] array;

    public ArrayTerbesar(int[] arr) {
        array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }
    }

    public int[] getArray() {
        return array;
    }

    public int cariNilaiTerbesar() {
        int terbesar = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= terbesar) {
                terbesar = array[i];
            }
        }
        return terbesar;
    }

    public void tampilIndex(int terbesar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == terbesar) {
                System.out.print(" " + i);
            }
        }
    }
}
