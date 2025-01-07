package javabasics.J03_kararyapilari;

import java.util.Scanner;

public class P07_kararyapilari5 {
    /*
    kullanıcı şifre ve username girecek. 3 yanlış şifrede
    şifre bloka olup yazacak. her hata da kullanıcı adı veya şifre hatalıdır denecek.

     */
    public static void main(String[] args) {
        String userName = "Mert";
        String passowrd = "123456";
        int sayac = 0;

            do {
                System.out.println("""
                    **** Login Panel ****
                    """);
                System.out.print("Kullanıcı Adınız: ");
                String kullaniciAdi = new Scanner(System.in).nextLine();
                System.out.print("Şifreniz: ");
                String sifre = new Scanner(System.in).nextLine();

                if(userName.equals(kullaniciAdi) && passowrd.equals(sifre)){
                    System.out.println("Login başarılı");
                    break; // döngüyü sonlandırır
                }else {
                    sayac++;
                    if(sayac == 3){
                        System.out.println("3. defa şifre hatalı hesap bloke oldu");
                    }else System.out.println("kullanıcı adı veya şifre hatalı "+ sayac + ". Hatalı Giriş.");
                }
            }while  (sayac<3);

        System.out.println("Program Sonlandı");
    }
}
