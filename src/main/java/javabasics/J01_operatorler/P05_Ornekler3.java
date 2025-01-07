package javabasics.J01_operatorler;

import java.util.Scanner;

public class P05_Ornekler3 {
    public static void main(String[] args) {
        String userName = "mert";
        String password = "12345";
        System.out.println("""
                ****Login****
                """);
        System.out.print("Kullanıcı Adı: ");
        String kullaniciAdi = new Scanner(System.in).nextLine();
        System.out.print("Şifre: ");
        String sifre = new Scanner(System.in).nextLine();
        boolean girisYapildiMi;

        girisYapildiMi = userName.equals(kullaniciAdi) && password.equals(sifre);
        // ekstrabilgider.md kısmında scanner alanında buna bakabilirsiniz.

        System.out.println("Giriş Yapma Durumu: ");
    }
}
