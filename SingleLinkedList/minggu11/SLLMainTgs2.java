/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu11;

/**
 *
 * @author WILDANII
 */
public class SLLMainTgs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingleLinkedListTgs2 singLL = new SingleLinkedListTgs2();

        singLL.addFirst("b");
        singLL.print();
        singLL.addLast("c");
        singLL.print();
        singLL.insertAfter("c", "d");
        singLL.print();
        singLL.insertBefore("b", "a");
        singLL.print();
        singLL.insertAt(4, "e");
        singLL.print();
    }
    
}
