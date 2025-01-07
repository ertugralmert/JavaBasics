package javabasics.J06_method;

import java.util.Scanner;

public class P22_Method_Ornek {
    // Kullanıcın adını alın adının tersten yazdırın ve sonucu dönen method

    public static void main(String[] args) {
        System.out.println("Lütfen adınızı giriniz: ");
        String ad = new Scanner(System.in).nextLine();
        System.out.println(isimTersCevirme(ad));


    }

    public static String isimTersCevirme(String ad){
        String tersineYaz = "";
        for (int i = ad.length()-1; i>-1; i--){
            tersineYaz += ad.charAt(i);
        }
    return tersineYaz;
    }
}
