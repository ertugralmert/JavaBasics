# İki Sayının Toplamı
Bir değişken tanımı yapılırsa ama değer atanmazsa değişkeni kullanamıyz.  

```java
byte sayi1,sayi2,toplam;   // sadece bu şekilde alırsak kullanamayız.  
// Öncelikle kullanıcıya sayı girdirmemiz lazım. 
System.out.print("lütfen birinci sayiyi giriniz: ");  
// Özel bir sınıfımız var adı "Scanner" sınıfıdır. Burada nesne oluşturacağız Scanner class'tan

Scanner scanner = new Scanner(System.in); // klavyeden veri girişini almak icin Scanner class'ından nesne olusturuyoruz.
sayi1 = scanner.nextByte(); //girilen değeri byte tipinden okur.

System.out.print("lütfen ikinci sayiyi giriniz: ");  
sayi2 = scanner.nextByte(); //girilen değeri byte tipinden okur.

toplam =(byte) (sayi1 + sayi2); // default integer olduğu için toplamı byte'a ceviriyoruz.
System.out.println("Toplam: " + toplam); // ekrana yazdırır.
```