package javabasics.J01_operatorler;

public class P02_GorevOperatorleri {
    /*
     = atama opearatörü
     Syntax : [Değişken] = [Deger] şeklinde kullanılır.
     */
    public static void main(String[] args) {
        int sayi = 5;
        //arttırım yaparak toplama
        System.out.println("sayi: "+ sayi);
        sayi = sayi + 10; // burada sayi'ya yeni atama yapılır. sayi alıyor 10 ile toplar yeni "sayi" değeri atanmış olur.
        System.out.println("sayi: "+ sayi);

        // sayiyi 50 arttırmak için
        sayi += 50; // sayi+50 gibi düşünebiliriz.
        System.out.println("sayi: "+ sayi); // en son sayımız 15'ti 50e eklersek 65 olur.

        // sayi 3 ile capımım
        sayi *= 3; // sayiyinin yeni değeri 195 olur.

        // mod 10 alalım
        sayi %= 10; // sayının yeni değeri 195 % 10 yani 5 olur.

        //******************************************************************

        // Artırım Operatorü
        int sayac = 1;
        sayac++; // 1'er 1'er arttırmaya yarar

        /*
        ++ || -- operatorleri sayıların değerini 1 arttırmak ya da 1 eksiltmek için kullanılır.
        ancak kullanım şekli farklılık gösterir.
        Önek ve sonek şeklinde kullanımları mevcuttur.
        Syntax:
        öncek [++/--] [Değişken] -> önce değer artar
        Sonek [Değişken] [++/--] -> değer sonraki kullanımda artar.
         */

        // önek kullanımda arttırarak kullanır. sonek kullanımda arttırmadan kullanır.

        int s1=3, s2=-7 , s3=2 , s4 =5;

    }
}
