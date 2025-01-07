package javabasics.J09_Class_Object_Kavramlari.J09_03_Static_Kavrami.entity;

public class Matematik {
    // Şimdi burada static olayını anlatacağım.
    // 3 tane tanım olacak ve Runner Class'ta bunları kontrol edin
    public Matematik() {
        System.out.println("Constructor çağrıldı"); // ileride göreceğiz constructor
    }

    static {
        System.out.println("Static bir kod bloğu çalıştı");
    }

    {
        System.out.println("kendi kendine çalışan bir kod bloğu çalıştı");
    }
}
