package javabasics.J05_diziler;

public class P16_Diziler_CokBoyutlu {
    int[] sayi = new int[3];
    int[][] matris = new int[3][3];

    /**
     * 0 1 2
     * 1 2 3
     * 2 3 4
     */
    public static void main(String[] args) {
        String[][] sinifListesi = new String[4][3];
        sinifListesi[0][0] = "1";
        sinifListesi[0][1] = "Ahmet Melih";
        sinifListesi[0][2] = "Gıcır";

        sinifListesi[1][0] = "2";
        sinifListesi[1][1] = "Atahan";
        sinifListesi[1][2] = "Gıcır";

        sinifListesi[2][0] = "3";
        sinifListesi[2][1] = "Berkey";
        sinifListesi[2][2] = "Gıcır";

        sinifListesi[3][0] = "4";
        sinifListesi[3][1] = "Çağrı";
        sinifListesi[3][2] = "Gıcır";

        for (int i = 0; i < sinifListesi.length; i++) {
            for (int j = 0; j < sinifListesi[i].length; j++) {
                System.out.println(sinifListesi[i][j]);
            }
        }
    }
}
