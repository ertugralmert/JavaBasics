package javabasics.J02_loops;

import java.util.Random;
import java.util.Scanner;

public class P06_RandomSayi_Loops {
    // rastgele sayı üretiyoruz ve bu sayıyı bilmeye çalışıyor.
    // bilemez isek tekrar soruyor bilinceye kadar.
    public static void main(String[] args) {
        Random random = new Random();
        int sayi = random.nextInt(100);
        System.out.println("random sayi: "+sayi);
        int tahmin;
        do{
            System.out.print("Lütfen tahmin ediniz: ");
            tahmin = new Scanner(System.in).nextInt();
        }while(tahmin != sayi);
            System.out.println("tebrikler tahmin ettiniz.");

    }
}
