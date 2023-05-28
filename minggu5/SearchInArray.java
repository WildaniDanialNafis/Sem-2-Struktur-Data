/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author ACER
 */
public class SearchInArray {
    private int[] array;
    private int keyword;

    public SearchInArray() {

    }

    public SearchInArray(int[] arr, int key) {
        keyword = key;
        array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        } 
    }

    public void setArray(int[] arr) {
        array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        } 
    }

    public void setKey(int key) {
        keyword = key;
    }

    public int[] getArray() {
        return array;
    }

    public int getKey() {
        return keyword;
    }

    public boolean cariNilai() {
        boolean hasil = false;
        for (int i = 0; i < array.length; i++) {
            if (keyword == array[i]) {
                hasil = true;
                break;
            }
            else if (keyword < array[i]) {
                break;
            }
        }
        return hasil;
    }
}
