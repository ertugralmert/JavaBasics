package javabasics.J09_Class_Object_Kavramlari.J09_04_AccessModifier_ErisimBelirtecleri;

import javabasics.J09_Class_Object_Kavramlari.J09_03_Static_Kavrami.entity.Musteri;

public class Runner {
    /**
     * Access Modifier -> Erişim Belirtecleri
     * Bir sınıfın bir method'un veya bir değişkenin erişebilirlik düzeyini belirler.
     * Türleri:
     *      - public
     *      -protected
     *      -private
     *      -default <-> empty</->
     */

    public static void main(String[] args) {
        Musteri musteri = new Musteri();
        musteri.ad = "Mustafa";
    }
}
