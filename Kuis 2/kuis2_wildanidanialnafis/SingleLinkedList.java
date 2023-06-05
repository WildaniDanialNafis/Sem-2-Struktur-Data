/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis2_wildanidanialnafis;

/**
 *
 * @author WILDANII
 */
public class SingleLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        int urutan = 0;
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null) {
                urutan++;
                System.out.println("----------------------");
                System.out.println("DAFTAR ANTRIAN NASABAH");
                System.out.println("----------------------");
                tmp.data.print();
                System.out.println("Urutan ke- " + urutan);
                System.out.println("----------------------");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Nasabah masih kosong");
        }
    }

    public void peekHead() {
            if (!isEmpty()) {
                System.out.println("Antrian pertama: ");
                head.data.print();
            } else {
                System.out.println("Antrian Nasabah masih kosong");
            }
    }

    public void peekTail() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir: ");
            tail.data.print();
            
        } else {
            System.out.println("Antrian Nasabah masih kosong");
        }
    }

    public void addFirst(Nasabah input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Nasabah input) {
        Node ndInput = new Node (input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String nama, Nasabah input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data.getNama().equalsIgnoreCase(nama)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertBefore(String nama, Nasabah input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if ((temp.data.getNama().equals(nama)) && (temp == head)) {
                addFirst(input);
                break;
            }
            else if (temp.next.data.getNama().equals(nama)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);

    }

    public void insertAt(int index, Nasabah input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public Nasabah getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(String nama) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && !(tmp.data.getNama().equals(nama))) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian nasabah masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Antrian nasabah masih Kosong, tidak dapat dihapus!");  
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian nasabah masih Kosong, tidak dapat dihapus!");  
        } else {
            Node temp = head;
            while (temp != null) {
                if ((temp.data.getNama().equals(nama)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.next.data.getNama().equals(nama)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
