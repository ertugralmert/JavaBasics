package javabasics.J09_Class_Object_Kavramlari.J09_03_Static_Kavrami;

import javabasics.J09_Class_Object_Kavramlari.J09_03_Static_Kavrami.entity.Matematik;
import javabasics.J09_Class_Object_Kavramlari.J09_03_Static_Kavrami.entity.Musteri;

public class Runner {
    public static void main(String[] args) {
        //musteri değişkeni = müşteri nesnesi
        Musteri musteri = new Musteri();
        // müşteri değişkeni , müşteri nesnesinin adresini taşır
        //böylelikle müşteri nesnesini bileşenlerine erişebilir.

        Musteri.yas = 20; // nesne oluşturmadan direk eriştik
        /**
         * Java da bir bileşene ulaşabilmenin tek yolu onun adresine sahip olmaktır.
         * Adreslenme işlemi Nesne Yaratarak(new) ya da static ile belirterek yapılabilir.
         */


        System.out.println("Uygulama Başladı");
        new Matematik();
        System.out.println("Uygulama Bitti");
        /** OUT PUT
         * Uygulama Başladı
         * Static bir kod bloğu çalıştı
         * kendi kendine çalışan bir kod bloğu çalıştı
         * Constructor çağrıldı
         * Uygulama Bitti
         */
    }


}


/**
 * JVM kavramı
 */