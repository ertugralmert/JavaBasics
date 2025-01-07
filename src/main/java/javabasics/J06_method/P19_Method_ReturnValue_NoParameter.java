package javabasics.J06_method;

import java.util.Random;

public class P19_Method_ReturnValue_NoParameter {
    public static void main(String[] args) {

        System.out.println(rastgeleSayiUretBanaVer()); //82

        int uretilenSayi = rastgeleSayiUretBanaVer();
        System.out.println(uretilenSayi); // 67

    }//main method sonu

    public static int rastgeleSayiUretBanaVer(){
       Random random = new Random();
        int sayi = random.nextInt(100);
        return sayi;
    }
}// class sonu
