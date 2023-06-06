/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu14;

/**
 *
 * @author WILDANII
 */
public class BinaryTreeTgsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTreeTgs bt = new BinaryTreeTgs();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");
        
        bt.addRekursif(20);
        bt.addRekursif(2);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.println("---------------");
        System.out.println("Nilai minimum: " + bt.min());

        System.out.println("-----------");
        System.out.println("Daftar leaf");
        bt.leaf(bt.root);
        System.out.println();
        System.out.println("Jumlah leaf: "+ bt.jumlahLeaf(bt.root));
    }
    
}
