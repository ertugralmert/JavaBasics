# Karakter Değişkeni
Karakter -> bilgisayarın belli bir kural çerçevesinde standart olarak  
 kabul görmüş çizimleri sayısal olarak temsil etmesidir. Burada olay  
girilen karakterlerin "char" tarafından sayısal şekilde tutulması.

###### char
```java
char karakter;
```
ASCII table standart bir tablodur.  
klavyeden a ya barsak 97 yi gönderir.  

Karakterleri ifade edebilmek için iki yöntem vardır.  
 * Karakterin sayısal değeri 
 * ' ' (tek tırnak) ile karakteri yazmak.

```java
char karakter;
karakter = 'a'; // çıktısı a olarak gelir.
System.out.println(karakter);
karakter = 98 ;  // çıktısı b olarak gelir.
System.out.println(karakter);
```

```java
karakter = 'k' 
System.out.println((int)karakter); // ->> cast işlemi yaptık.
// normalde k harfini vermesi gerekirken cast ile int'e çevirip 107 sayısını elde ettik.
```

> char değişki ile 'ali' falan yazamayız. tek karakter olması gerekir.

> max değer 65535 tir.  -> karakter = 65536; 
