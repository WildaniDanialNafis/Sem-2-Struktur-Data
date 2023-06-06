/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu14;

/**
 *
 * @author WILDANII
 */
public class BinaryTreeArrayTgsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTreeArrayTgs bta = new BinaryTreeArrayTgs();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
        
        System.out.println();
        bta.add(11);
        bta.traverseInOrder(0);

        System.out.println();
        System.out.println("Traverse Preorder");
        bta.traversePreOrder(0);
        
        System.out.println();
        System.out.println("Traverse Postorder");
        bta.traversePostOrder(0);
    }
    
}
