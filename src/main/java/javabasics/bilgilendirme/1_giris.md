# Ufak Tüyolar
 * com.javajedi olarak package oluşturuyoruz
 * psvm yazarsak direk System.out.println komutu gelir
 *  class isimleri şuanlık runner olarak devam edecek. 
 * Main methodu önemlidir. psvm yani


Java main methodunu arar. ram üzerinde adresler ve oradan start alır.
 * yani main methodu olmak zorunda. Başlangıç noktası diyoruz. Uygulama ayağa
kalktığında ram üzerinde adreslenir.
 * Class'ın çalışabilir olması için bir main method olmak zorunda

```java
public class Runner {
    /**
     * Method
     * public ->> access modifier
     * static -> keyword -- classLoader tarafından uygulama ayağa kaldırılırken adreslenmesini ve adresin sabit kalmasını sağlar
     * void -> return type olarak geçer. Geriye bir değer döndürmeyeceğini belirtir.
     * main -> method name : methodun görevine bağlı olarak isimlerdirme yapılan kısım.
     * () -> parametre listesini alacağı kısmı belirtir. bir method'ta parametre alınmayacak ise boş bırakılır
     *
     * @param args
     */
    public static void main(String[] args){
        // Alttaki kodu tanımlayalım
        /*
                System -> bu bilgisayar, işletim sistemi
                out -> çıkış,çıktı
                print -> yazdırma
                ln -> line : bu metin sonunda bir alt satır olmasını belirtir
                yani "println" tüm satıra bunu yaz diyebiliriz.
         */
        System.out.println("Merhaba Java!");
    }
}
```
* Class ismi Runner ve kod içindeki class ismi aynı olmak zorundadır.

###### Main Methodunu inceleyelim.
* public -> access modifier
* class -> keyword // interface, record, enum, abstract class.... 
* Runner -> class name
*  {} -> scope -- sınıfın kapsam alanını belirtir.

> return type-> void: aklından bir sayı tut. geri dönüş tipi yok. 
> main ismi method ismidir. İlerleyen kısımda buraya farklı isimler gelecek.
> () -> String[] args -> bir değişken tanımıdır. String bir diziyi işaret eder. args ise değişken ismidir.

> source code -> byte code -> machine code
> IDE' de java'da sağtıklayıp direk class derseniz ve "com.javajedi.Runner" oluşturusanız direk package ve class oluşur.


#### JVM Kavramı
İçinde heap ve stack'in bulundugu bir bilgisayar. JVM'de kullandıgımız değişkenler heap'de tutulur.  
heap ve stack kavramı şu şekilde açıklanablir:
* heap -> ram'de değişkenlerin tutuldugu yerdir.
* stack -> ram'de değişkenlerin yerini tutuldugu yerdir.