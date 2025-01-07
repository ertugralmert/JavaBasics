package javabasics.J07_class.J07_03_matematik;

public class Runner {
    /*
    Matematik sınıfı olacak
    toplalma sayı sınırı yok
    carpma -> 2 sayıyıy çarpacak
    alan hesaplama -> ücgen ve diktorgen bu method 2 değer alacak. 1. değer string 2. değerler int, int
     */

    public static void main(String[] args) {
        Matematik matematik = new Matematik();
        matematik.alanHesapla("Üçgen", 3, 4);
    }
}
