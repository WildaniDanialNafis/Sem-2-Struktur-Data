/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu11;

/**
 *
 * @author WILDANII
 */
public class NodeMhs {
    Mahasiswa mhs;
    NodeMhs next;

    public NodeMhs(Mahasiswa mahasiswa, NodeMhs berikutnya) {
        this.mhs = mahasiswa;
        this.next = berikutnya;
    }
}
