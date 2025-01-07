# Değişken Kavramı
İşlemci kendisine verilen bir işlemi alır işler ve ram'e gönderir.
Temel işlemi tek işlem yönetmektektir.
* işlemci aynı anda iki işlemi yapamaz. O yüzden bilgileri verip ram de tutup sonra kullandırmak lazım.
* Önce işlemciye tanımları vermemiz lazım yani değişkenlerimiz.

### Değişken Tanımlama Syntax
* [Data Type] [Variable Name] = [Value]  
        int sayi;
        sayi = 10;  
        char karakter;  
        String ifade;  
        boolean dogruYanlis;

* int sayi; -> değişken tanımlamak  
  sayi = 5; -> değişkene değer atamak

### Tam Sayi Değişkenleri

* byte, short, int, long

> = -> atama operatörüdür. Bir değişkene değer atamak için kullanılır.

##### byte
```java
byte byteSayi = 43;
System.out.println("byteSayisi......: " + byteSayi);
```
> byte sayısı -128 ile 127 arasında değişken tanımlanabilir.  
 "0" pozitif olarak değerlendirilmektedir.

### Bit Kavramı
0 ve 1 den oluşur.  
1 bit 1 byte'dır. 8 bit 1 byte'dır. 16 bit 2 byte'dır. 32 bit 4 byte'dır. 64 bit 8 byte'dır.  
Yani 1 byte = 8 bit'dir.  

![bitKavrami](/resources/images/bitKavrami)

 
> pc de her şey 2 katı ile devam eder!

> byte - 1 byte - 8 bit  
  short - 2 byte - 16 bit  
  int - 4 byte - 32 bit  
  long - 8 byte - 64 bit


> 1 byte -> 8 bit  
  1024 byte -> 1 Kilobyte KB  
  1024 KB -> 1 MB  
  1024 MB -> 1 GB  
  1024 GB -> 1 TB  
  1024 TB -> 1 PB  
  1024 PB -> 1 EB  
  1024 EB -> 1 ZB  
  1024 ZB -> 1 YB  
  1024 YB -> 1 YB

#### short
```java
short shortSayi = 100;
System.out.println("shortSayisi......: " + shortSayi);
```
> short sayısı -32768 ile 32767 arasında değişken tanımlanabilir.  
 "0" pozitif olarak değerlendirilmektedir.

#### int
```java
int intSayi = 100;
System.out.println("intSayisi......: " + intSayi);
```
> int sayısı -2147483648 ile 2147483647 arasında değişken tanımlanabilir.  
 "0" pozitif olarak değerlendirilmektedir.

#### long
```java 
long longSayi = 100L;
System.out.println("longSayisi......: " + longSayi);
```
> long sayısı -9223372036854775808 ile 9223372036854775807 arasında değişken tanımlanabilir.  
 "0" pozitif olarak.debugLineerlendirilmektedir.  
 Long tanımı önemlidir. sayının başına "L" ve "l" koyulmalıdır. örnek: 100L

#### float
```java
float floatSayi = 10.5f;
System.out.println("floatSayisi......: " + floatSayi);
```
> float sayısı -3.4028235E38 ile 3.4028235E38 arasında değişken tanımlanabilir.  
 "0" pozitif olarak değerlendirilmektedir.

#### double
```java
double doubleSayi = 10.5;
System.out.println("doubleSayisi......: " + doubleSayi);
```
> double sayısı -1.7976931348623157E308 ile 1.7976931348623157E308 arasında değişken tanımlanabilir.  
 "0" pozitif olarak değerlendirilmektedir.

> Her dilin default bir değeri vardır.  
  Java için tam sayı değişken tipi int'dır.  
  Ondalıklı sayı değişken tipi double'dır.

> float ve double değişkenlerini kullanmak istiyorsak f ve d harfini koyarak kullanabiliriz.

###### cast kavramı
> cast -> değişken tipini değiştirmek istedigimizde kullanılır. örnek: int -> double  

```java
int intSayi = 10;
double doubleSayi = intSayi;
System.out.println("doubleSayisi......: " + doubleSayi);
```
  