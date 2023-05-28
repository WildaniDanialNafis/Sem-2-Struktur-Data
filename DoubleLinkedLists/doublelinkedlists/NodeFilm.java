/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author WILDANII
 */
public class NodeFilm {
    Film data;
    NodeFilm prev, next;

    public NodeFilm(NodeFilm prev, Film data, NodeFilm next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
