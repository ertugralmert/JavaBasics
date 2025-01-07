package javabasics.J05_diziler;

import java.util.Scanner;

public class P13_Diziler_Ornek {
    // Kullanıcıdan alınan 5 sayıyı diziye ata. Sayıları yazdır.
    public static void main(String[] args) {
        int[] sayilar = new int[5];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("Lütfen 5 sayı giriniz: ");
            int sayi = new Scanner(System.in).nextInt();
            sayilar[i] = sayi;
        }
        System.out.println("*****");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }
    }
}
