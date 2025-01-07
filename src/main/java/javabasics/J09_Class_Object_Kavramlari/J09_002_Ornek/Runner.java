package javabasics.J09_Class_Object_Kavramlari.J09_002_Ornek;

import javabasics.J09_Class_Object_Kavramlari.J09_002_Ornek.entity.Ders;
import javabasics.J09_Class_Object_Kavramlari.J09_002_Ornek.entity.Ogrenci;
import javabasics.J09_Class_Object_Kavramlari.J09_002_Ornek.entity.Ogretmen;

public class Runner {
    /*
    Öğrenci temel bilgiler
    Ders
    Öğretmen
     */
    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.id = 1L;
        ogretmen.ad = "Ali";
        ogretmen.brans = "Matematik";
        ogretmen.adres = "İzmir";
        ogretmen.telefon = "1234567890";

        Ogretmen ogretmen2 = new Ogretmen();
        ogretmen2.id = 2L;
        ogretmen2.ad = "Veli";
        ogretmen2.brans = "Fizik";
        ogretmen2.adres = "Ankara";
        ogretmen2.telefon = "1234567890";


        Ders ders = new Ders();
        ders.id = 1L;
        ders.ad = "Matematik";
        ders.notlar = new int[]{100, 90, 80};
        ders.ogretmen = ogretmen;

        Ders ders2 = new Ders();
        ders2.id = 2L;
        ders2.ad = "Fizik";
        ders2.notlar = new int[]{100, 90, 80};
        ders2.ogretmen = ogretmen;

        Ders ders3 = new Ders();
        ders3.id = 3L;
        ders3.ad = "Kimya";
        ders3.notlar = new int[]{100, 90, 80};
        ders3.ogretmen = ogretmen2;


        Ogrenci ogrenci = new Ogrenci();
        ogrenci.id = 1L;
        ogrenci.ad = "Mert";
        ogrenci.adres = "Ankara";
        ogrenci.telefon = "1234567890";
        ogrenci.dersler = new Ders[]{ders, ders2, ders3};
    }
}
