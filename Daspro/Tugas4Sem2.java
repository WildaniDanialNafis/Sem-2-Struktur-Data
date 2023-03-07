public class Tugas4Sem2 {
    public static void tampilTabel(int[][] bunga, String[] jnsBunga, String[] cabang) {
        System.out.println("+--------------++---------------++--------------++--------------++--------------+");
        System.out.print("|\t       |");
        for (int i= 0; i < jnsBunga.length; i++){
            System.out.print("| " + jnsBunga[i] + "\t|");
        }
        System.out.println("\n+--------------++---------------++--------------++--------------++--------------+");
        int k = 0;
        for (int i= 0; i < cabang.length; i++){
            for (int j= 0; j < cabang.length+1; j++){
                if (j == 0) {
                    System.out.print("| " + cabang[k] + " |");
                }
                else {
                    System.out.print("|\t" + bunga[i][j-1] + "\t|");
                }
            }
            System.out.println("\n+--------------++---------------++--------------++--------------++--------------+");
        }
        int[] stok = stok(bunga);
        System.out.print("| Stok :       |");
        for (int i= 0; i < stok.length; i++){
            System.out.print("|\t" + stok[i] + "\t|");
        }
        System.out.println("\n+--------------++---------------++--------------++--------------++--------------+");
    }
    public static int[] stok(int[][] bunga) {
        int[] stok = new int[bunga[0].length];
        for (int i = 0; i < bunga[0].length; i++) {
            for (int j = 0; j < bunga.length; j++) {
                    stok[i] += bunga[j][i];
            }
        }
        return stok;
    }
    public static void main(String[] args) {
        int[][] bunga = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};
        String[] jnsBunga = {"Aglonema", "Keladi", "Alokasia", "Mawar"};
        String[] cabang = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
        
        tampilTabel(bunga, jnsBunga, cabang);  
    }
}