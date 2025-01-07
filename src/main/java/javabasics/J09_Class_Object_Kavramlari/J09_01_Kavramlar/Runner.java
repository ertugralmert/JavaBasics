package javabasics.J09_Class_Object_Kavramlari.J09_01_Kavramlar;

import javabasics.J09_Class_Object_Kavramlari.J09_01_Kavramlar.entity.Kategori;
import javabasics.J09_Class_Object_Kavramlari.J09_01_Kavramlar.entity.Resim;
import javabasics.J09_Class_Object_Kavramlari.J09_01_Kavramlar.entity.Urun;

public class Runner {
    public static void main(String[] args) {
        Resim resim = new Resim();
        resim.id = 1L;
        resim.vitrin = true;
        resim.url = "https://picsum.photos/209/300";

        Resim resim2 = new Resim();
        resim2.id = 2L;
        resim2.vitrin = false;
        resim2.url = "https://picsum.photos/209/300";

        Resim resim3 = new Resim();
        resim3.id = 3L;
        resim3.vitrin = true;
        resim3.url = "https://picsum.photos/209/300";

        Urun urun = new Urun();
        urun.id = 1L;
        urun.ad = "Laptop";
        urun.aciklamasi = "Asus Laptop";
        urun.fiyat = 5000;
        urun.marka = "Asus";
        urun.model = "ROG";
        urun.resimler = new Resim[]{resim, resim2, resim3};

        Kategori kategori = new Kategori();
        kategori.id = 1L;
        kategori.ad = "Bilgisayar";
        kategori.urunler = new Urun[]{urun};

        System.out.println(kategori); // javabasics.J09_Class_Object_Kavramlari.J09_01_Kavramlar.entity.Kategori@6b95977
    }


}
