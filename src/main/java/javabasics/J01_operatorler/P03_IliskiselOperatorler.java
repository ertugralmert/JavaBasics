package javabasics.J01_operatorler;

public class P03_IliskiselOperatorler {

    public static void main(String[] args) {
        int ogrenciOrtalamaNotu = 49;
        System.out.println("Öğrenci Geçtimi: "+ (ogrenciOrtalamaNotu>=50)); //false gelecek.
        boolean ogrenciGectiMi; //true veya false
        ogrenciGectiMi = ogrenciOrtalamaNotu>49;
        System.out.println(ogrenciGectiMi);
        // görüldüğü gibi geçme notunu boolean cinsinden bir değişkene atadık .
    }
}




// Anlatım
/**
 * iki değerin bir birlerine göre durumunu irdeleyen operatorlerdir.
 * yapmış olduğu irdeleme sonucunda bize bir sonuç bildirir.
 * dönen sonuç boolean tipinde olup true/false sonucunu bize iletir.
 */

/*
 == --> iki değerin bir birine eşit olup olmadığını sorgular
 >= -> ilk değerin ikinci değerden büyük veya eşit olup olmadığını sorgular
 <= -> ilk değerin ikinci değerden küçük veya eşit olup olmadığını sorgular
 > ->
 < ->
 != ->> iki sayının bir birine eşit olmadığı durumunu irdeler.
 */