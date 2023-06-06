/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author WILDANII
 */
public class ShellSort {
    public int [] data;
    public int jumData;

    public ShellSort (int Data[], int jmlData) {
        jumData = jmlData;
        data = new int[jmlData];
        for (int i=0; i<jumData; i++) {
            data[i] = Data[i];
        }
    }

    public void tampilData() {
        for (int i=0; i<jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    public void shellsort() {
        int interval;
        for (interval = jumData/2; interval>0; interval/=2) {
            for (int i=interval; i<jumData; i++) {
                int temp = data[i];
                int j;
                for (j=i; j>=interval && data[j-interval] > temp; j-=interval) {
                    data[j] = data[j-interval];
                }
                data[j] = temp;
            }
        }
    }
}
