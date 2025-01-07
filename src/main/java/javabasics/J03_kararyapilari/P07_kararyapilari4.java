package javabasics.J03_kararyapilari;

import java.util.Scanner;

public class P07_kararyapilari4 {
    /*
    bir öğrenci 3 farklı not almış ve bunları sisteme girmiştir
    not ortalaması şu şekilde hesaplanmaktadır.
    vize notu * %25 + vize notu2 * %34 + final notu * %41

    bu koşulları sağlayan sistemi kodlayınız.
    50> ise geçer altı kalır.
     */
    public static void main(String[] args) {
        System.out.print("1. vize notunu giriniz: ");
        double vize1 = new Scanner(System.in).nextDouble();
        System.out.print("2. vize notunu giriniz: ");
        double vize2 = new Scanner(System.in).nextDouble();
        System.out.print("Final notunu giriniz: ");
        double finalNotu = new Scanner(System.in).nextDouble();
        double sonuc = (vize1*0.25)+(vize1*0.34)+(finalNotu*0.41);
        if (sonuc<50){
            System.out.print("Geçerli not alınamamıştır. Not: "+sonuc);
        }else System.out.print("Sınıfı geçtiniz. Notunuz: "+sonuc);

    }
}

