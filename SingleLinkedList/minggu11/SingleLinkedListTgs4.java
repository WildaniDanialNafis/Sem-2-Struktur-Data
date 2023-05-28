/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author WILDANII
 */
public class SingleLinkedListTgs4 {
    NodeMhs head;
    NodeMhs tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMhs tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.mhs.getNim() + " " + tmp.mhs.getNama() + " " + tmp.mhs.getAbsen() + " " + tmp.mhs.getIpk());
                System.out.println();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void peekHead() {
            if (!isEmpty()) {
                System.out.println("Antrian pertama: " + head.mhs.getNim() + " " + head.mhs.getNama() + " " + head.mhs.getAbsen() + " " + head.mhs.getIpk());
            } else {
                System.out.println("Antrian Mahasiswa masih kosong");
            }
    }

    public void peekTail() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir: " + tail.mhs.getNim() + " " + tail.mhs.getNama() + " " + tail.mhs.getAbsen() + " " + tail.mhs.getIpk());
        } else {
            System.out.println("Antrian Mahasiswa masih kosong");
        }
    }

    public void addFirst(Mahasiswa input) {
        NodeMhs ndInput = new NodeMhs(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa input) {
        NodeMhs ndInput = new NodeMhs (input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String nim, Mahasiswa input) {
        NodeMhs ndInput = new NodeMhs(input, null);
        NodeMhs temp = head;
        do {
            if (temp.mhs.getNim().equalsIgnoreCase(nim)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertBefore(String nim, Mahasiswa input) {
        NodeMhs ndInput = new NodeMhs(input, null);
        NodeMhs temp = head;
        do {
            if ((temp.mhs.getNim().equals(nim)) && (temp == head)) {
                addFirst(input);
                break;
            }
            else if (temp.next.mhs.getNim().equals(nim)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);

    }

    public void insertAt(int index, Mahasiswa input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMhs temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMhs(input, temp.next);
            if (temp.next.next == null) tail = temp.next;
        }
    }

    public Mahasiswa getData(int index) {
        NodeMhs tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.mhs;
    }

    public int indexOf(String nim) {
        NodeMhs tmp = head;
        int index = 0;
        while (tmp != null && !(tmp.mhs.getNim().equals(nim))) {
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
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");  
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMhs temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String nim) {
        if (isEmpty()) {
            System.out.println("Linked List masih Kosong, tidak dapat dihapus!");  
        } else {
            NodeMhs temp = head;
            while (temp != null) {
                if ((temp.mhs.getNim().equals(nim)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.next.mhs.getNim().equals(nim)) {
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
            NodeMhs temp = head;
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
