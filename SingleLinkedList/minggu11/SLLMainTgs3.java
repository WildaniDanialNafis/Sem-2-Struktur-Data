/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu11;

/**
 *
 * @author WILDANII
 */
public class SLLMainTgs3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingleLinkedListTgs2 singLL = new SingleLinkedListTgs2();

        singLL.addFirst("Statistika");
        singLL.print();
        singLL.addLast("Algoritma");
        singLL.print();
        singLL.insertAfter("Algoritma", "Matematika");
        singLL.print();
        singLL.insertBefore("Statistika", "Multimedia");
        singLL.insertAt(4, "Basis Data");
        singLL.print();
        singLL.insertAt(5, "Bahasa");
        singLL.print();
        singLL.insertBefore("Bahasa", "Komputer");
        singLL.print();
        singLL.insertAfter("Komputer", "Android");
        singLL.print();
    }
    
}
