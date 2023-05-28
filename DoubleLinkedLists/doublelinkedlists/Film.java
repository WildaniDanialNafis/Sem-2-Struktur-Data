/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlists;

/**
 *
 * @author WILDANII
 */
public class Film {
    private int id;
    private String judul;
    private float rating;

    public Film(int id, String judul, float rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public int getId() {
        return this.id;
    } 
    
    public String getJudul() {
        return this.judul;
    } 

    public float getRating() {
        return this.rating;
    }
}
