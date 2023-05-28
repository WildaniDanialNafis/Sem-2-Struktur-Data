/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu5;

/**
 *
 * @author ACER
 */
public class SearchInArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayInt = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        SearchInArray[] arraySearch = new SearchInArray[2];
        arraySearch[0] = new SearchInArray(arrayInt, 41);
        arraySearch[1] = new SearchInArray();
        arraySearch[1].setArray(arrayInt);
        arraySearch[1].setKey(50);
        
        System.out.println("+---------------+");
        System.out.println("| Mencari Nilai |");
        System.out.println("+---------------+");

        System.out.print("Index :");

        for (int i = 0; i < arraySearch[1].getArray().length; i++) {
            System.out.print("  " + i);
        }

        System.out.print("\nArray :");
        
        for (int i = 0; i < arraySearch[1].getArray().length; i++) {
            System.out.print(" " + arraySearch[1].getArray()[i]);
        }

        System.out.println("\n+---------------+");
  
        for (int i = 0; i < arraySearch.length; i++){
            boolean hasil = arraySearch[i].cariNilai();
            if (hasil == true) {
                System.out.println("Nilai " + arraySearch[i].getKey() + " ditemukan");
            }
            else {
                System.out.println("Nilai " + arraySearch[i].getKey() + " tidak ditemukan");
            }
        }
    }
    
}
