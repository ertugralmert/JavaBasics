package javabasics.J04_string;

public class P09_StringAnlatim {
    /*
    String -> karakter dizi şeklinde tanımlanır.
    Özel bir sınıftır.
    Kendine özel bellek yönetimi vardır.
    String bir referans veri tipidir. Bellekte tutulduğu alan farklıdır.
    String ifade = "Ali" -> aslında olan {'A','l','i'}
     */
    public static void main(String[] args) {
        String ifade;
        ifade = "Bugün hava sabah saatlerinde çok soğuk idi.";
        System.out.println("ifade değişkeni: "+ ifade);
        System.out.println("**********");

        ifade.length(); // uzunluğunu bildirir.
        System.out.println("ifade uzunluğu: "+ ifade.length());

        System.out.println("***********");
        System.out.println("6. karakteri alalım: "+ ifade.charAt(6));
        System.out.println("*****");

        //ismimizi alt alta yazdıralım.
        String ad =  "Mert";
        for(int i = 0; i<ad.length(); i++){
            System.out.println(ad.charAt(i));
        }


        System.out.println("****");
    }

}


/*
length() -> Bur bir method tanımıdır. Bir işlem yapar ve gerekirse bir sonuç döner.
Bir String değişkeninin içinde barındırdığı karakter uzunluğunu verir.
DİKKATT!!! Bazı karakterler bellek te tutulan birden fazla karakterşik alan kapladığı ve öyle
ifade edilidği için length her zaman karakter sayısınnı vermez.
 */

/*
charAt();
-> tanım içinde ilgili karakteri verir. 6 dersek 6. karakteri verir.
 */

/*
indexOf(char ch or String str)->
kendisine verilen karakter ya da String değeri ifadenin içinde arar ve aranmak istenilen
değeri bulursa ilk bulduğu konumu döner. Bulamaz ise "-1" döner.
 */

/*
lastIndexOf()
-> aranılan değerin son rastlanılan konumunu verir.
 */

/*
toLowerCase();  // karakterleri küçük çevirir.
toUpperCase(); // karakterleri büyük metin yapar.

DİKKAT!!!!
Upper ve lower işlemleri işlem yapılan makinenin işletim sistemi dili ile doğrudan ilişkilidir.
Türkçe ise i -> İ
İngilizce  ise i -> I
alternatif:
ifade.toLowerCase(Locale.ENGLISH) VEYA
ifade.toLowerCase(Locale.of(tr-TR));
 */


/*
equals or equalsIgnoreCase()
-> iki String ifadenin bir birine eşit olmadığını yukarıdaki method ile kontrol ederiz.
 */


/*
substring(beginIdex, endIndex)
-> verilen ifadenin içinde istenilen miktarda karakteri almak için kullanılır.
-> index verilerek yapılıur
-> ilk index dahil değildir son idex dahildir. (2,5]
-> ilk index dahil sonra idex dahil değil . -> [2,5)
-> substring(6) : [6,length]
 */

/*
split(char ch or String str)
-> verilen değer kullanılarak ifadenin dizilere ayrılması sağlanır.
String adlar = "Muhammet, Murat,Mert,Demet,Hakan,Ali,Durmuş";
String[] adListesi = adlar.split(",");
Parçalama işlemi yaparak diziye atıyor.

 */

/*
replace(oldValue, newValue)
-> bir dosya adını düzenlemek istiyoruz. -> yeni yıl kutlaması.png -> yeni-yil-kutlaması.png
String yy = "yeni yıl kutlaması";
yy.replace(" ", "-");
 */


/*
ifade.trim();  -> ifadenin başında ve sonunda olan boşlukları siler.

ifade.isEmpty(); -> boş mu diye bakar. true false döner

ifade.isBlank(); -> boşluk koysak bile sorun olmaz. içinde ifade var mı yok mu diye bakar.
true false döner

ifade.concat(""); -> İki String ifadeyi birleştirmek için kullanılır.
performans için String ifadelerin devamını eklemek için "concat" kullanılır.
String ifade = "Mert";
String ifade2 = "Ertugral";
System.out.println(ifade.concat(ifade2));

ifade.startsWith(""); -> bir ifade ile başlıyor mu diye bakılır.
ifade.startWith("Mert") // ifade "Mert" ile başlıyor mu diye bakar.



iface.contains(); -> ilgili ifadeyi içeriyor mu diye bakılır
 */