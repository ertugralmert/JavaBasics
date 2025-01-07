package javabasics.J03_kararyapilari;

import java.util.Scanner;

public class P07_KararYapilari_SwitchCase1 {
    public static void main(String[] args) {
        System.out.println("""
                **** Hesap Makinesi ****
                1-Toplama
                2-Çıkarma
                3-Çarpma
                4-Bölme
                5- Mod alma
                0- Çıkış
                """);
        System.out.print("lütfen seçiniz: ");
        int secim = new Scanner(System.in).nextInt();

        switch (secim){
            case 1 :
                System.out.println("Toplama yap"); break;
            case 2 :
                System.out.println("Cıkarma yap"); break;
            case 3 :
                System.out.println("Carpma yap"); break;
            case 4 :
                System.out.println("Bolme yap"); break;
            case 5 :
                System.out.println("Mod alma yap"); break;
            case 0 :
                System.out.println("Program bitti"); break;
            default :
                System.out.println("Lütfen gecerli bir seçim yapınız.");
        }
    }
}



/*
if gibi belli bir kontorlü yapmak ve akışın yönünü değiştirmek
için kullanılan bir karar yapısıdır.

Syntax;
switch(key){
 case DURUM1:
    //code block
    break;
 case DURUM2:
    //code block
    break;
 case DURUM3:
    //code block
    break;
 default:
    //code block
    break;
}
 */


// Genellikle birebir eşitlik olan durumlarda özellikle performans
// kullnılarak yapıdır.