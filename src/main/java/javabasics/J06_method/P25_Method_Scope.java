package javabasics.J06_method;

public class P25_Method_Scope {
    // scope class içinde tanımlanırsa değişkenler her yerden erişilir.
    /*
    class içinde tanımlanabilecekler:
        Methodlar
        Değişken
        class - inner class

        !!!!!! Java Class Loader kavramını araştırınız.
     */

    static  int alanHesaplamaAdedi = 0;
    static int satisIslemleriAdedi = 0;

    public static void main(String[] args) {
        System.out.println(alanHesaplama(5,9));
        System.out.println(alanHesaplama(50,36));
        System.out.println(alanHesaplama(43,7));
        System.out.println(alanHesaplama(23,19));
        System.out.println(satisIslemleri("Bilgisayar",65_874));
        System.out.println(satisIslemleri("Telefon",95_002));


    }








    public static int alanHesaplama(int yukseklik, int tabanUzunlugu){
        int alan = yukseklik * tabanUzunlugu;
        return alan;
    }

    public static double satisIslemleri(String urun, double fiyat){
        //code
        return fiyat;
    }


}
