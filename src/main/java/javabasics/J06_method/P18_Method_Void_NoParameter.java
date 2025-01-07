package javabasics.J06_method;

import java.util.Scanner;

public class P18_Method_Void_NoParameter {

    /**
     * Bellir bir görevi yerine getiren ancak yaptığı işlemin sonucunu dönmeyen,
     *  yapacağı işlem için herhangi bir bilgi talep etmeyen method türü.
     *
     *  Dikkat!!! ekrana çıktı veriyor olması return olduğu anlamına gelmez!!!!
     *  Main methodun ve method içine method tanımlanmaz.
     *  Static methodlar , static methodları çağırabilir.
     */

    public static void main(String[] args) {
        int secim;
        do{
            ekranaYaz(); // aşağıda tanımlanan methodu açğırdık
            secim = new Scanner(System.in).nextInt();
        }while(secim!=0);

        System.out.println("Program Sonlandı");

    } //main sonu

    public static  void ekranaYaz(){
        System.out.println("""
                    *** İşlemler ***
                    1- Toplama 
                    2- Çıkartma
                    3- Çarpma
                    4- Bölme
                    5- Mod Alma
                    0- Çıkış 
                    """);
        System.out.println("Lütfen Seçiniz: ");
    }


} // class so
