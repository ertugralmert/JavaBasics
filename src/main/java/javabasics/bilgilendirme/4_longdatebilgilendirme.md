# Tarih Kavramı
21 Aralık 2023 perşembe 21:21:21 olarak gösterilebilir.  
Java'da "long" değişkeni kullanılarak tarih bilgileri alınabilir.
> [LongDate](https://epochconverter.com) -> tarih bilgilerini almak icin kullanilir. long değişkeni ile.
   -> 1735513472 ->  Sunday, December 29, 2024 11:04:32 PM olarak gösterilebilir.  
   ->  milisaniye olarak gösterir. 1970 yılından itibaren geçen milisaniye sayısıdır.  

```java
Long now = System.currentTimeMillis();
int birGunSonrasi = 1000 * 60 * 60 * 24; // Dikkat !!! burası long yapsak daha iyi olur 2 ay sonrası için 
Long birGunSonrasiLong = now + birGunSonrasi;
System.out.println(birGunSonrasiLong);  // bize bir gün sonrasını verir.
```