package javabasics.J06_method;

import java.util.Scanner;

public class P17_Method_Anlatim {
    /**
     * Method kavramı ve Kullanımı:
     * Belli bir kod öbeğini içinde barından, talep edilen görevi yerine getiren bir kod blopu.
     * Tüm kodlamlar methodların gövdesinde var olur.
     * Dikkat!!! Bu zamana kadar yazdığımız tüm kodlamalar method içinde idi. (main methodu)
     *
     * Zaten isteseniz de [for,if,switch..case, System.out.print() vs] tüm kodlamalar method
     * dışında hata verir.
     * -------
     * Method, temel olarak bir görevi ifade eden fonksiyon, aksiyon şeklinde tanımlanabilir.
     * asureIslemi Method incelemesi;
     * public -> Access Modifier(Erişim Belirteci) yazmaz zorunlu dğeildir.
     *
     * static -> yazmak zorunlu değil.. Önüne gelen değişkeni belleğe atanır. ilerleyen konuda değineceğim
     * önüne geldiği varlığın uygulama açılırken adreslenmesini sğalar.
     *
     * final -> yazmak zorunlu değil. Önüne geldiği bileşeni değişmez kılar.
     *
     * Return Type -> yazmak zorunludur. Her methodun mutlak bir return type vardır.
     * Temelde iki şekilde bulunur.
     *      ..... void -> geriye değer dönmez
     *      ...... other[int,boolean,String....] -> herhangi bir değişken türünü dönebilirsiniz.
     *
     *
     * Method Name -> methodun adıdır. Açık bir şekilde method hangi işlemi gerçekştirecek ise buna
     * göre isimlendirilmelidir. Sınırlama yoktur uzun yazılabilir.
     *      method isimlendirmesi yaparken küçük harf ile başlanır. diğer kelimlerin baş harfleri büyük yazılır.
     *   **Parentezler -> method görevii yapabilmek için bazen belli değerlere ihtiyaç duyulabilir.
     *      bu durumda kendisini kullanacak alanlardan parametre ister ve bunları kullnır.Zorunlu değildir,
     *      işlevine göre seçim yapılmalıdır.
     *
     *   *** {} Method Body(scope) -> methodun sınırlarını bleirler, method'un işleyeceği kodlar
     *          bu aralıkta yazılır. Yazılması zorunludur. methodların sonuna ; (noktalı virgül)
     *          koyulmaz. Konulsa da bir işe yaramaz.
     *
     *   *** return -> method yaptığı işlem neticesinde bir geri bildirim yapacak ise return ile cevap döner.
     *          Burada dikkat edilmesi gereken husus method tanımlanırken Return Type hangi türde
     *          belirtilmiş ise geri dönüş bilgisi o türden olmaldıır.
     */
    public static void main(String[] args) {
        // Method, temel olarak bir görevi ifa eden fonksiyon, aksiyon şeklinde tanımlabilir.


    } // main sonu

    // öylesine tanımlanmış method ile ilgili bilgi vermek için böyle method olmaz !!!
    public static final Object AsureIslemi(int sayi,double sayi2, String ifade, boolean buneYa
    ,float[] ondaliklar, Object neOlursanOlGelciler, P17_Method_Anlatim P17_Method_Anlatim_Mi, String... of_biz_yandik){
        Object o = "sayiiiii";
        o = 5;
        o = 5.44;
        o = new int[]{21,23,323,23};
        o = 'a';
        o = "burada ne işimiz var";
        o = new Scanner(System.in);
        return "öfff";
    }

    public void aklindanSayiTut(){
        int sayi =5;
    }

    public int aklidanSayiTutveBanaSoyle(){
        int sayi =4;
        return sayi;
    }

    public int suIkiSayiyiToplaBanaSonucuSoyle(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        return toplam;
    }

}// class sonu
