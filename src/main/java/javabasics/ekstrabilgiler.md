# bilgiler
* bir koda kısayol eklemek istersek
  * Öncesinde eklemek istediğim kodu seçiyoruz -> Scanner scanner = new Scanner(System.in);
  * IDE' de "code" -> save as live template
  * abbreviation kısmına ad veriyoruz örnek "sc_a" 

---
## String 

```java
// Öncelikle 
String ad1 = "Jedi";
String ad2 = "Jedi2"; 

//ad1 == ad2 bu ifade doğrudur çünkü aynı yere adreslenmiştir. 
//Eğer biz scanner ile bir girdi sağlarsak bu yeni bir nesne oluşturur.
String ad3 = new Scanner(System.in).nextLine(); 
//ad1 veya ad2 ---> ad3 'e eşit değildir.
```
![stringpool](/resources/images/stringpoolscanner.png)

Karakter dizisi olarak tutar.  
String içinde birçok method vardır.

----

## Loop
* while loop'ta değişkene bir değer atanması lazım kontrol ettikten sonra çalışır.
* do-while -> kod en az bir kez çalışır sonrasında condition kontrol eder.  

---
## Random Sayı 
Random sınıfı rastgele sayı üretmek için kullanılır.  
Kullanım şekli:

 ```java
import java.util.Random;

Random rastgele = new Random();
int sayi = rastgele.nextInt(100); // 0-100 arası rastgele sayı üretir

```
---
## AOT
Start etme süresi baya düşer. JVM yerine.  
GraalVM  
Just in Time olmadan süreyi kısaltıyor

---
## String 
İki String ifade birleştirme durumunda "+" kullanımda yeni  
ifade başka bir adreste yer alır.  
concat ise ilk değişkenin içeriğine aktarır.  
Bu da performansı olumlu etkiler.  

---
## Diziler (Arrays)
Dizilerde index 0 'dan başlar.  
 * Dizilerde ekleme yapmak için
    Eski dizi deki elamanlar yeni diziye aktarılı ve yeni dizide elaman eklenir.

---
## Method
* Method içinde method tanımlanmaz
* Ekrana çıktı vermesi return type olduğu anlamına gelmez.
* Static methodlar static method'ları çağırabilir.
*  /** enter yaparsanız method yorumu oluşturursunuz.
* method isimleri küçük harfle başlar
* Method Overloading -> method ismi aynı ancak aldığı parametreler farklı

---
## Clean Code
* Kod tekrarı olmaması lazım.



---
## Class
* class scope içinde tanımlanan değişkenler main methodu ve diğer methodlar falan kullanılabilir.
* static kavramlar static ile kullanılır.
* class isimleri büyük harf ile başlat
* class içinde 
    * method
    * değişken
    * class tanımlanabilir.

---
## Static
* uygulama ayağa kalkarkan ilk static yüklenir.
* uygulama ayağa kalkarken ram'de adreslenirler.
* bellekte adreslenmesi lazım çalışabilmesi için. 
  * method veya class içinde tanımlı olması gerekir. class name = new class(); adreslenir
* Java da bir bileşene ulaşabilmenin tek yolu onun adresine sahip olmaktır.
* Adreslenme işlemi Nesne Yaratarak(new) ya da static ile belirterek yapılabilir.


---
## Object
* new'leme işlemi ile kullanırız. Kalıptan nesne yaratılır.
* new'lenen nesne ram'de adreslenir.
* özelDizi özel = new OzelDizi(); adreslenir ve adres "özel" atanır.
* Bellekte adreslendikten sonra çalışma olur. new leme bundan olur.

---
## id
* her varlığın bir id'si olmalı ve benzersiz olmalı.

---
## AccessModifier
* public -> her konumdan erişime açmayı ifade eder
* 
* private
* protected
* default