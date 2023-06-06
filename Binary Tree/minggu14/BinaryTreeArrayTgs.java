/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu14;

/**
 *
 * @author WILDANII
 */
public class BinaryTreeArrayTgs {
    int[] data;
    int idxLast;

    public BinaryTreeArrayTgs() {
        data = new int[10];
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }

    public void add(int data) {
        idxLast++; 
        this.data[idxLast] = data;
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart<=idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }

    public void traversePostOrder(int idxStart) {
        if (idxStart<=idxLast) {
            if (idxStart<=idxLast) {
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxStart+2);
                System.out.print(data[idxStart] + " ");
            }
        }
    }
}
