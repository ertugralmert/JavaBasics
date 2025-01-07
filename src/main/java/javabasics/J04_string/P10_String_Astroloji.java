package javabasics.J04_string;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class P10_String_Astroloji {
    private static final String site = "https://www.elle.com.tr/astroloji/";

    public static void main(String[] args) throws IOException {

        System.out.println("""
                **** Burç Yorumları ****
                1- Koç
                2- Boğa
                3- İkizler
                4- Yengeç
                5- Aslan
                6- Başak
                7- Terazi
                8- Akrep
                9- Yay
                10- Oğlak
                11- Kova
                12- Balık
                """);
        System.out.println("Lütfen Burcunuzu Seçiniz: ");
        int burc = new Scanner(System.in).nextInt();

        String secilenBurc = switch (burc){
            case 1 -> "koc";
            case 2 -> "boga";
            case 3 -> "ikizler";
            case 4 -> "yengec";
            case 5 -> "aslan";
            case 6 -> "basak";
            case 7 -> "terazi";
            case 8 -> "akrep";
            case 9 -> "yay";
            case 10 -> "oglak";
            case 11 -> "kova";
            case 12 -> "balik";
            default -> "";
        };
        site.concat(secilenBurc);
        Scanner scannerSite = new Scanner(
                new URL(site.concat(secilenBurc)).openStream(), "UTF-8"
        );
        while (scannerSite.hasNextLine()) { // okunacak satır var mı ?
        String okunanSatir = scannerSite.nextLine(); // okunan satırır al
            if(okunanSatir.contains("<p>"))
            System.out.println(okunanSatir);
            break; // döngüden çık
        }
        System.out.println("Uygulama Bitti");
    }
}
