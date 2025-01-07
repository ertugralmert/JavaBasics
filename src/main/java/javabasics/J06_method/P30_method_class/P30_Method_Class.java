package javabasics.J06_method.P30_method_class;

public class P30_Method_Class {
    // P30_Method_Class_OzelDizi class'ında tanımladğımız class'ları nesne oluşturarak kullancağız
    public static void main(String[] args) {
        P30_Method_Class_OzelDizi ozelDizi = new P30_Method_Class_OzelDizi();
        ozelDizi.add("ali");
        ozelDizi.add("veli");
        ozelDizi.add("ahmet");
        ozelDizi.print();
        System.out.println("*******");
        ozelDizi.remove(1);
        ozelDizi.print();
    }




    /*
    yukarıda görüldüğü gibi class'ta tanımladığımız methodları burada kullanabiliriz.
     */
}
