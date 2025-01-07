package javabasics.J01_operatorler;

import java.util.Scanner;

public class P05_Ornekler2 {
    // girilen iki sayının karelerinin toplamı bulan kodu yazınız
    public static void main(String[] args) {
        int sayi1,sayi2, toplam;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = scanner.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        sayi2 = scanner.nextInt();
        toplam = (sayi1*sayi1)+ (sayi2*sayi2);
        System.out.println("Girilen iki sayının karelerinin toplamı:" + toplam);
    }

    // nesne yaratmak için sayi1 = new Scanner(System.in).nextInt(); ancak 1 kere nesne yaratmak daha iyi
    // java da matematik önceliği var.  parantez kullanımı önemli

}

