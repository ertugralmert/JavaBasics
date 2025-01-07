package javabasics.J03_kararyapilari;

import java.util.Scanner;

public class P07_kararyapilari2 {
    // kullanıcıdan alınan 2 sayıdan hangisinin büyük olduğunu
    // yazan kodu yazınız
    public static void main(String[] args) {
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        int sayi2 = new Scanner(System.in).nextInt();
        if(sayi1 >= sayi2){
            System.out.println("büyük sayı: "+sayi1);
        }else System.out.println("büyük sayı: "+ sayi2);
    }
}
