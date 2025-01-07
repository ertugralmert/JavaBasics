package javabasics.J03_kararyapilari;

import java.util.Random;
import java.util.Scanner;

public class P07_kararyapilari1 {
    public static void main(String[] args) {
        System.out.print("lütfen bir sayı giriniz: ");
        int sayi = new Scanner(System.in).nextInt();
        if(sayi >0){
            System.out.println("Girilen Sayı Pozitiftir");
        }else if (sayi < 0){
            System.out.println("Girilen Sayı negatiftir.");
        }else {
            System.out.println("Girilen sayı 0 ");
        }
    }

}




/*
Akışın yönünü değiştirmek için kullandığımız karar yapılarıdır.
Syntax;
v1: if(condition){
//code block
}
************
v2: if(durum){
//code
}else{
 //code
 }
 ************
 v3: if(durum){
 //code
 }else if(diğer durum){
 //code
 }else if (bambaşka bir durum){
 }else{
 // yukarıdakilerin biri değil ise o zaman ben çalışırım kısmı
 }


 */