package javabasics.J02_loops;

import java.util.Scanner;

public class P06_while_loop {

    public static void main(String[] args) {
        System.out.println("""
                **** Hesap Makinesi ****
                1-Toplama
                2-Çıkarma
                3-Çarpma
                4-Bölme
                0-ÇIKIŞ
                """);


        int secim =1;  // burada değişkene değer vermemiz lazım ki initilaze olsun.
        while (secim !=0){
            System.out.print("Lütfen Seçiniz: ");
            secim = new Scanner(System.in).nextInt();
        }
        System.out.println("Program bitti");
    }

}


/**
 * Dikkat!!!
 * for kullanımı genellikle peşisıra giden yapılarda kullanılır ve özellikle belli bir
 * sayıdan /sayaçtan bahsedildiğinde kullanımı daha okunaklı ve kullanışlıdır.
 */

/**
 * While loop syntax
 * while(condition({ // parantez içine yazılan kural doğru olduğu sürece döngü devam eder
 *     //code block
 * }
 */


