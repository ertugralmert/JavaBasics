package javabasics.J06_method;

import java.util.Scanner;

public class P20_Method_Ornek {

    public static void main(String[] args) {
        int secim;
        do{
            secim = secimYaptir();
            switch (secim){
                case 1: toplamaYaptir();
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 0:
                    System.out.println("Çıkış yapıldı");
                    break;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız");
                    break;

            }
        }while (secim !=0);

        System.out.println("Program Bitti");

    }

    public static int secimYaptir(){
        int seciminiz;
        System.out.println("""
                *** Hesap Makinesi
                1- Toplama
                2- Carpma
                3- Bölme
                4- Çıkartma
                5- Mod Alma
                0- Çıkış
                """);
        System.out.print("Seçiniz: ");
        seciminiz = new Scanner(System.in).nextInt();
        return seciminiz;
    }

    public static void toplamaYaptir(){
        System.out.println("Toplama İşlemi");
        System.out.println("1.sayıyı giriniz: ");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.println("2.sayıyı giriniz: ");
        int sayi2 = new Scanner(System.in).nextInt();
        int toplam = sayi2+sayi1;
        System.out.println("iki sayının toplamı: "+ toplam);
    }
}
