package javabasics.J03_kararyapilari;

import java.util.Scanner;

public class P07_KararYapilari_AsalSayiBulma {
    /*
    Girilen iki sayı arasındaki asal sayıları bulan kodu yazınır.
     */
    public static void main(String[] args) {
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("Ikinci sayıyı giriniz: ");
        int sayi2 = new Scanner(System.in).nextInt();

        // Öncelikle girilen iki sayının arasındaki sayıları ekrana yazdırırız.
        for (int i = sayi1; i <= sayi2; i++) {
            boolean asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println(i + " sayısı asaldır.");
        }

        }
    }
}