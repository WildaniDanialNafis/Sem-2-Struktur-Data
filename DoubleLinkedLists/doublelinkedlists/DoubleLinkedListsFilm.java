/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author WILDANII
 */
public class DoubleLinkedListsFilm {
    NodeFilm head;
    int size;

    public DoubleLinkedListsFilm() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film item) {
        if (isEmpty()) {
            head = new NodeFilm(null, item, null);
        } else {
            NodeFilm newNode = new NodeFilm(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeFilm current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeFilm newNode = new NodeFilm(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film item, int index) throws Exception {
        if (isEmpty()){
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            NodeFilm current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeFilm newNode = new NodeFilm(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeFilm newNode = new NodeFilm(current.prev, item, current);
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
            NodeFilm tmp = head;
            System.out.println("Cetak Data");
            while (tmp != null) {
                System.out.println("ID: " + tmp.data.getId() + "\nJudul Film: " + tmp.data.getJudul() + "\nRating: " + tmp.data.getRating());
                tmp = tmp.next;
            }
        } else {
            System.out.println("Film Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Film masih kosong");
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
            throw new Exception("Film masih kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeFilm current = head;
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
            NodeFilm current = head;
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

    public Film getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Film masih kosong");
        }
        return head.data;
    }

    public Film getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Film masih kosong");
        }
        NodeFilm tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        NodeFilm tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void findID(int idDicari) {
        NodeFilm tmp = head;
        int i = 0;
        int temp = - 1;
        while (tmp != null) {
            if (tmp.data.getId() == idDicari) {
                System.out.println("Data Id Film: " + idDicari + " berada di node ke-" + i);
                System.out.println("IDENTITAS:");
                System.out.println("ID Film: " + tmp.data.getId());
                System.out.println("Judul Film: " + tmp.data.getJudul());
                System.out.println("IMDB Rating: " + tmp.data.getRating());
                temp++;
                break;
            } else {
        
            }
            i++;
            tmp = tmp.next;
        }
        if (temp == -1) {
            System.out.println("ID yang anda cari tidak tercantum");
        }
    }

    public void urutRatingDesc() {
        if (head == null || head.next == null) {
            return;
        } 

        boolean swapped;
        NodeFilm current;
        NodeFilm last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data.getRating() < current.next.data.getRating()) {
                    swapNodes(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    public void swapNodes(NodeFilm node1, NodeFilm node2) {
        Film temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
    }
}
