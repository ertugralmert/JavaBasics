package javabasics.J06_method.P30_method_class;

// Burada P29_Method_Ornekler 'deki code'lar alınmıştır. P30_MEthod_Class sınıfında
// kullanabilmek için buradaki class'ı kullanacağız.

public class P30_Method_Class_OzelDizi {

    private String[] ogrenciler;
    private  int ogrenciSayisi= 0;


    public  void add(String ogrenci){

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


    public  void remove(int index){
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


    public  void print(){
        for( int i = 0 ; i< ogrenciSayisi; i++){
            System.out.println(ogrenciler[i]);
        }
    }

}
