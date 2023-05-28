/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author WILDANII
 */
public class DoubleLinkedListsAnt {
    NodeAnt head;
    int size;

    public DoubleLinkedListsAnt() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Antrian item) {
        if (isEmpty()) {
            head = new NodeAnt(null, item, null);
        } else {
            NodeAnt newNode = new NodeAnt(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Antrian item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeAnt current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeAnt newNode = new NodeAnt(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Antrian item, int index) throws Exception {
        if (isEmpty()){
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            NodeAnt current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeAnt newNode = new NodeAnt(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeAnt newNode = new NodeAnt(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeAnt tmp = head;
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|No.\t|Nama\t|");
            while (tmp != null) {
                System.out.println("|" + tmp.data.getNomor() + "\t|" + tmp.data.getNama() + "\t|");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeAnt current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeAnt current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Antrian getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        }
        return head.data;
    }

    public Antrian getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        }
        NodeAnt tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Antrian get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        NodeAnt tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
