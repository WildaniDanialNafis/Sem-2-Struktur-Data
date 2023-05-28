/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author WILDANII
 */
public class QueueMhs {
    private Mahasiswa[] antrian;
    private int front;
    private int rear;
    private int size;
    private int max;

    public QueueMhs(int n) {
        max = n;
        antrian = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Mahasiswa antri) {
        if (IsFull()) {
            System.out.println("Antrian Mahasiswa sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Mahasiswa dequeue() {
        Mahasiswa dt = new Mahasiswa();
        if (IsEmpty()) {
            System.out.println("Antrian Mahasiswa sudah kosong");
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (rear == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian Mahasiswa masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].getNim() + " " + antrian[i].getNama() + " " + antrian[i].getAbsen() + " " + antrian[i].getIpk());
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].getNim() + " " + antrian[i].getNama() + " " + antrian[i].getAbsen() + " " + antrian[i].getIpk());
            System.out.println("Jumlah antrian Mahasiswa: " + size);
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian pertama: " + antrian[front].getNim() + " " + antrian[front].getNama() + " " + antrian[front].getAbsen() + " " + antrian[front].getIpk());
        } else {
            System.out.println("Antrian Mahasiswa masih kosong");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian terakhir: " + antrian[rear].getNim() + " " + antrian[rear].getNama() + " " + antrian[rear].getAbsen() + " " + antrian[rear].getIpk());
        } else {
            System.out.println("Antrian Mahasiswa masih kosong");
        }
    }

    public void peekPosition(String nim) {
        if (IsEmpty()) {
            System.out.println("Antrian Mahasiswa masih kosong");
        } else {
            int temp = -1;
            for (int i = 0; i < size; i++) {
                if (antrian[i].getNim().equalsIgnoreCase(nim)) {
                    temp = i;
                }
            }
            if (temp != -1) {
                System.out.println(antrian[temp].getNim() + " " + antrian[temp].getNama() + " " + antrian[temp].getAbsen() + " " + antrian[temp].getIpk());
                System.out.println("Berada pada antrian ke-" + (temp + 1));
            } else {
                System.out.println("Mahasiswa dengan nim " + nim + " tidak terdapat pada antrian");
            }
        }
    }

    public void printMahasiswa(int posisi) {
        if (IsEmpty()) {
            System.out.println("Antrian Mahasiswa masih kosong");
        } else {
            if (posisi < max && antrian[posisi] != null) {
                System.out.println("Mahasiswa pada posisi ke-" + (posisi + 1));
                System.out.println(antrian[posisi].getNim() + " " + antrian[posisi].getNama() + " " + antrian[posisi].getAbsen() + " " + antrian[posisi].getNim());
            } else {
                System.out.println("Index yang anda masukkan salah");
            }
        }
    }
}
