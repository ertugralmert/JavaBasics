package javabasics.J07_class.J07_02_ogrenci_soyutlama;

public class RunnerOgrenci {

    public static void main(String[] args) {
        // Ogrenci class'ında ogreciyi soyutlaştırdık
        Ogrenci ogrenci = new Ogrenci();
        Ogrenci ogrenci1 = new Ogrenci();

        ogrenci.adSoyad = "Mert Ertugral";
        ogrenci1.adSoyad = "Dilara  Ertugral";

        // veya dizi içinde tuarız
        Ogrenci[] ogrenciler = new Ogrenci[2];
        ogrenciler[0] = ogrenci;
        ogrenciler[1] = ogrenci1;

        for(int i = 0; i < ogrenciler.length; i++){
            System.out.println(ogrenciler[i].adSoyad); //Mert Ertugral Dilara  Ertugral

        }
    }

}
