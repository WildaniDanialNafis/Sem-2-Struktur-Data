/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author WILDANII
 */
public class NodeAnt {
    Antrian data;
    NodeAnt prev, next;

    public NodeAnt(NodeAnt prev, Antrian data, NodeAnt next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
