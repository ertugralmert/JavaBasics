package javabasics.J01_operatorler;


public class P04_MantıksalOperatorler {
    public static void main(String[] args) {
        String kullaniciAdi = "Admin";
        String sifre = "123456";

        boolean girisYap;

        girisYap = kullaniciAdi == "Admin" && sifre == "123456";
        System.out.println("Giriş Durumu: "+ girisYap); // hem kullanıcı adı ve şifre eşit olduğundan true gelecek.
        // Giriş Durumu: true
    }
}




/*
Bazen tek bir durumu irdelemek işimizi çözmez bu nedenle birden fazla durumn işlenmesine gerek vardır.
Bu tarz durumlarda farklı sorguları birleştirebileceğimiz mantık operatörlerini kullanırız.

&& -> ve
|| -> veya

 */