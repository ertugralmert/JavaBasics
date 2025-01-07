package javabasics.J03_kararyapilari;

import java.util.Scanner;

public class P08_KararYapilari_CarpimTablosu {
    /*
    1 ile 9 arasında girilen sayının çarpım talbosunu ekrana yazdır
    örn: 7
    7 X 1 = 7
    7 X 2 = 14
    7 X 3 = 21
     */
    public static void main(String[] args) {
        System.out.println("Lütfen 1 ile 9 arasında bir sayı giriniz: ");
        int sayi = new Scanner(System.in).nextInt();
        for(int i = 1; i<=9; i++){
            System.out.println(sayi + " X " + i + " = " + (sayi * i));
        }
    }
}
