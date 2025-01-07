package javabasics.J05_diziler;

import java.util.Scanner;

public class P14_GenelAlistirma {
    /**
     * Bu zamana kadar gördüklerimiz:
     * Değişkenler -> byte, short, int, long,float, double,boolean,char <> String
     * Operatorler -> +, -, *, /, %, ++, --, =, +=, -=, *=, /=, %=
     * Dögüler -> for loop, while, do - while
     * Karar Yapısı -> if, else if, else, switch case
     * String Değişkeni
     * Diziler
     */
    public static void main(String[] args) {
        String[] ogrenciler = {"Ahmet Melih","Atahan","Berkey","Çağrı","Dilara","Enes",
        "İsmail","Mert","Tuğba","Yaşar"};

        int secim;

        do{
            System.out.println("""
                **** Java Kurs Otomasyonu ****
                1- Öğrencileri Listele
                2- Öğrenci Ekle
                3- Öğrenci Sil
                4- Öğrenci Ara
                0- Çıkış
                """);
            System.out.println("Lütfen Seçiniz: ");
            secim = new Scanner(System.in).nextInt();

            switch (secim){
                case 1:
                    for(int i = 0; i < ogrenciler.length; i++){
                        System.out.println(ogrenciler[i]);
                    }
                    break;
                case 2:
                    System.out.println("Öğrenci Adını giriniz: ");
                    String ad = new Scanner(System.in).nextLine();
                    String[] yeniOgrenciler = new String[ogrenciler.length+1];
                    for(int i = 0; i<ogrenciler.length; i++){
                        yeniOgrenciler[i] = ogrenciler[i];
                    }
                    yeniOgrenciler[yeniOgrenciler.length] = ad;
                    ogrenciler = yeniOgrenciler;

                    break;
                case 3: break;
                case 4:
                    System.out.println("Aramak istediğiniz kişi: ");
                    String aranan = new Scanner(System.in).nextLine();
                    for(int i = 0; i<ogrenciler.length; i++){
                        if(ogrenciler[i].toLowerCase().contains(aranan.toLowerCase())){
                            System.out.println(ogrenciler[i]);

                        }
                            break;
                    }
                    break;
                case 0:
                    System.out.println("Çıkış Yapılıyor"); break;
                default:
                    System.out.println("Lütfen gecerli bir seçim yapınız.");
            }
        }while(secim!=0);

    }
}
