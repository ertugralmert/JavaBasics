package javabasics.J06_method;

public class P26_Method_Varargs {
    public static void main(String[] args) {
        System.out.println(topla(3,5));
        System.out.println(topla(4,3,2));


    }

    public static int topla(int s1, int s2){
        return s1+s2;
    }

    public static int topla(int s1, int s2, int s3){
        return s1+s2+s3;
    }

    public static float topla(float s1, int s2){
        return s1+s2;
    }
    //varargs
    // int... sayilar
    // int ... sayilar
    // int ...sayilar
    public static  int topla(int... sayilar){
        int toplam = 0;
        for (int i = 0; i<sayilar.length; i++){
            toplam += sayilar[i];
        }
        return toplam;
    }
}


/**
 * Bir method adı aynı kalmak koşulu ile farklı parametreler alarak
 * tekrar tekrar kullanılıyor ise bu Method Overloading adı verilir.
 */
