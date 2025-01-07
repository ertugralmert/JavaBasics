package javabasics.J07_class.J07_01_kedi_soyutlama;

public class P32_Kedi_Kullanma {
    public static void main(String[] args) {
        P31_Kedi kedi = new P31_Kedi(); // Kedi sınıfını soyutlandırdık
        System.out.println("Kedi uyuyor mu: "+ kedi.uyuyorMu); // Kedi uyuyor mu: false
        kedi.uyu();
        System.out.println("Kedi uyuyor mu: "+ kedi.uyuyorMu); //Kedi uyuyor mu: true

        kedi.tur = "Van Kedisi";
        System.out.println("Kedi-1 türü: "+ kedi.tur); // Kedi-1 türü: Van Kedisi

        P31_Kedi kedi2 = new P31_Kedi();
        System.out.println("Kedi-2 türü: "+ kedi2.tur); // Kedi-2 türü: null

        System.out.println("Kedi Nesnesinin referans adresi: "+ kedi);

        System.out.println("Kedi2 Nesnesinin referans adresi: "+ kedi2);
    }


    // Aşağıudaki method main method içinde tanımlanamaz.
    /*
    Çünkü adreslemesi  yapılmadı. Ancak static olan method tanımlamabilir.
    Java da uygulama ayağa kalkarken static olanlar belleğe alınıyor ve adresleniyor.
    Aşağıdaki method adreslenmediğinden biz o methodu yukarıda kullanamayız!!!!
     */
    public int baskaSayiVer(){
        return 433;
    }

    public static int sayiVer(){
        return 123;
    }
}

