package javabasics.J05_diziler;

public class P12_DizilerAnlatim {
    /*
    Arrays -> Diziler
   [ 1,2,343,123,4564,-23] -> Sayı Dizisi
    ["Mert","Ali","Mehmet"] -> String Dizisi

    Snytax -> DataType[] arrayName = new DataType[size];
     */
    public static void main(String[] args) {
        int[] sayiDizisi = new int[5]; // Dizi tanımlamak ve başlatmak
        int[] sayiDizisi2; // tanılamak
        sayiDizisi2 = new int[5]; // başlatmak

        int[] sayiDizisi3 = {1,2,3,4,5}; // dizi tanımalama ve başlatmak

        /*
        Dizi elamnına değer atamak ve elamanın değerini okumak
        Dikkat !!!!! -> Dizilerde index 0 dan başlar.
         */
        sayiDizisi[1] = 45;
        System.out.println("Sayı Dizisi 1'in 1. elamanı: "+ sayiDizisi[0]); // 0
        System.out.println("Sayı Dizisi 1 in 2. elamanı: "+ sayiDizisi[1]); // 45
        System.out.println("Sayı Dizisi 1 in 3. elamanı: "+ sayiDizisi[2]); // 0
    }
}
