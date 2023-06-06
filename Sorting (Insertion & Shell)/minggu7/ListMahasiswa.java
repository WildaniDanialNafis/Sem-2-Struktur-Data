/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author WILDANII
 */
public class ListMahasiswa {
    public Mahasiswa[] mhs;
    public int id;

    public ListMahasiswa(int size) {
        mhs = new Mahasiswa[size];
    }

    public void tambah(Mahasiswa mahas) {
        if (id < mhs.length) {
            mhs[id] = mahas;
            id++;
        } else {
            System.out.println("Mahasiswa sudah penuh");
        }
    }

    public void tampilList() {
        System.out.println("Nama\t" + "Nilai A\t" + "Nilai B\t" + "Nilai C\t" + "Total");
        for (int i=0; i<mhs.length && mhs[i]!=null; i++) {
            mhs[i].tampil();
        }
    }

    
    public Mahasiswa[] shellSort() {
        Mahasiswa[] newList = new Mahasiswa[mhs.length];
        for (int i = 0; i < mhs.length; i++) {
            newList[i] = mhs[i];
        }

        int interval;
        for (interval = newList.length/2; interval > 0; interval/=2) {
            for (int i=interval; i<newList.length; i++) {
                Mahasiswa temp = newList[i];
                int j;
                for (j=i; j>=interval && newList[j-interval].getTotal() < temp.getTotal(); j-= interval) {
                    newList[j] = newList[j-interval];
                }
                newList[j] = temp;
            }
        }
        return newList;
    } 
    
    public void tampilListUrut(Mahasiswa[] list) {
        System.out.println("Nama\t" + "Nilai A\t" + "Nilai B\t" + "Nilai C\t" + "Total");
        for (int i=0; i<mhs.length && mhs[i]!=null; i++) {
            list[i].tampil();
        }
    }

    public void tampilTerbaik(Mahasiswa[] list) {
        System.out.println("Tiga Mahasiswa Terbaik");
        System.out.println("Nama\t" + "Nilai A\t" + "Nilai B\t" + "Nilai C\t" + "Total");
        for (int i=0; i < 3; i++) {
            list[i].tampil();
        }
    }
}