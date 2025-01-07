package javabasics.J05_diziler;

import java.util.Scanner;

public class P15_GenelAlistirma_SahteYapayZeka {
    /**
     * Toplama İşlemi yaapmak istiyorum.
     * peki anladım bana iki sayı verir misin?
     * sayi1 : 54
     * sayi2: 542
     * bu iki sayının toplamı = 596 dır
     * Başka işlem yapmak ister misin?
     * Hayır
     * Çıkış yapıldı
     */
    public static void main(String[] args) {
        System.out.println("Merhaba sana nasıl yardımcı olabilirim?");
        String cevap =  new Scanner(System.in).nextLine();
        if (cevap.toLowerCase().contains("top")){
            System.out.println("İki Sayının toplamaı için");
            System.out.println("Brinci sayı: ");
            int sayi1 = new Scanner(System.in).nextInt();
            System.out.println("Ikinci sayı: ");
            int sayi2 = new Scanner(System.in).nextInt();
            System.out.println("Sayıların toplamı: "+(sayi1+sayi2));
            System.out.println("Başka bir işlem yapmak ister misiniz?");
            cevap = new Scanner(System.in).nextLine();
            if (cevap.toLowerCase().contains("hayır")) {
                System.out.println("Çıkış yapıldı");
            }

        }
    }
}
