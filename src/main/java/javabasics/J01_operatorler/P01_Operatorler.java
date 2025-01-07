package javabasics.J01_operatorler;

public class P01_Operatorler {

    /*
    Temel Aritmek Operatorler
    -> +,-,*,/, %
     */

    public static void main(String[] args) {
        int s1=8, s2=6;
        //Toplama işlemi
        int toplam = s1 + s2;

        //Çıkarma işlemi
        int cikarma = s1 - s2;

        //Çarpma işlemi
        int carpim = s1 * s2;

        // Bölme İşlemi
        int bolum = s1/s2;

        System.out.println("s1/s2 sonucu: "+ bolum);

        double dbolum = s1/s2;
        System.out.println("s1/s2 sonucu: "+ dbolum); // sonuç int gibi gelir 1.0 . Çünkü iki int sayıyı böldük.

        // Ancak ilk sayı double olsaydı sonuç ondalıklı gelirdi !!


        // MOD
        int mod = s1 % s2;
        System.out.println("mod: "+ mod);  // 8 'in 6'ya bölümünden kalanı verir.
    }

}
