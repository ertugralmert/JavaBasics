package javabasics.J06_method;

import java.util.Scanner;

public class P23_Method_Ornek {

    public static void main(String[] args) {
        int secim = -1;
        do {
            secim = gui();
            switch (secim){
                case 1 : toplamaYap();
                    break;
                case 2: cikarmaYap(); 
                    break;
                case 3 : carpmaYap();
                    break;
                case 4 : bolmeYap();
                    break;
                case 5 : modAl();
                    break;
                case 0 :
                    System.out.println("Çıkış Yapıldı");
                    break;
                default:
                    System.out.println("Lütfen Geçerli Seçim Yapınız!");
                    break;
            }
            
        }while (secim != 0);
        System.out.println("Program Bitti");


    }

    public static int gui(){
        System.out.println("""
                *** Çarpım Tablosu***
                1- Toplama
                2- Çıkarma
                3- Çarpma
                4- Bölme
                5- Mod Al
                0- Çıkış
                """);
        System.out.println("Lütfen Seçiniz: ");
        int secim = new Scanner(System.in).nextInt();
        return secim;
    }
    
    
    

    public static int sayiAl(String sayiNo){
        System.out.println(sayiNo + ". Sayıyı Giriniz: ");
        int sayi = new Scanner(System.in).nextInt();
        return sayi;

    }

    public static void toplamaYap() {
        int result = sayiAl("1") + sayiAl("2");
        System.out.println("İki Sayının Toplamı: "+ result);
    }

    public static void carpmaYap(){
        int result = sayiAl("1" ) * sayiAl("2");
        System.out.println("İki Sayının Çarpımı: "+ result);
    }

    public static void bolmeYap(){
        int result = sayiAl("1") / sayiAl("2");
        System.out.println("İki Sayının Bölümü: "+ result);
    }

    public static void cikarmaYap(){
        int result = sayiAl("1") - sayiAl("2");
        System.out.print("İki Sayının Çıkarma Sonucu: "+ result);
    }

    public static void modAl(){
        int result = sayiAl("1") % sayiAl("2");
        System.out.println("İki Sayının Toplamı: "+ result);
    }
}
