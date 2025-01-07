package javabasics.J06_method;

public class P29_Method_Ornekler {
    private static String[] ogrenciler;
    private static int ogrenciSayisi= 0;


    public static void main(String[] args) {
        add("mert");
        add("dilara");
        add("can");
        for( int i = 0 ; i< ogrenciSayisi; i++){
            System.out.println(ogrenciler[i]);
        }

    }

    /**
     * Öğrenci ekleme methodu
     * öğrencinin adını parametre olarak alır.
     * geriye değer döndürmez.
     */


    /*
    Öncelikle öğrenci eklemek için array'ı arttırmamız lazım ki ekleme yapabilelim.
     */
    public static void add(String ogrenci){

        ogrenciSayisi++;
        if(ogrenciSayisi == 1){
            ogrenciler = new String[1];
            ogrenciler[0] = ogrenci;
        }else {
            String[] geciciDizi = new String[ogrenciSayisi];
            for (int i = 0; i < ogrenciler.length; i++){
                geciciDizi[i] = ogrenciler[i];
            }
            geciciDizi[ogrenciSayisi-1] = ogrenci;
            ogrenciler = geciciDizi;

        }
        }

        // index numarası verilen öğrenciyi silen methodu yazınız.
    public static void remove(int index){
        ogrenciSayisi--;
        String[] geciciDizi = new String[ogrenciSayisi];
        int deger = 0;
        for (int i = 0; i < ogrenciler.length; i++){
            if(i == index){
                deger++;
                break;
            }
            geciciDizi[i-deger] = ogrenciler[i];
        }
        ogrenciler = geciciDizi;
    }

    // öğrenciler dizisini ekrana yazdıran geriye değer döndürmeyen methodu yazınız.
    public static void print(){
        for( int i = 0 ; i< ogrenciSayisi; i++){
            System.out.println(ogrenciler[i]);
        }
    }
}
