package javabasics.J02_loops;

public class P06_ornekler {
    public static void main(String[] args) {
        // 1 den 10 kadar olan sayıları ekrana yazdır.
        for (int i = 0; i <= 10; i++) System.out.println(i);
        System.out.println("--------");

        // 25 ile 48 arasındaki sayıların toplamını bulan kod
        int toplam = 0;
        for (int a = 26; a < 48; a++) {
            toplam += a;
        }
        System.out.println(toplam);

        System.out.println("---------");
        // 100 den 40 'a doğru geriye sayarak ekrana çıktı veren kodu yazınız.
        for (int b = 100; b > 40; b--) System.out.println(b);

        System.out.println("--------");

        // 30 ile 67 arasındaki tek sayıları yazdıran kod.
        int tekToplam = 0;
        for (int c = 30; c < 67; c++) {
            if (c % 2 != 0) {
                tekToplam += c;
            }
        }
        System.out.println("tek toplamlar: "+ tekToplam);
    }



}
