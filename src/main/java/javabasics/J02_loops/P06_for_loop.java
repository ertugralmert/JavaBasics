package javabasics.J02_loops;

public class P06_for_loop {
    /*
    Loop Syntax
    1- for loop
    i -> sayaç
    i< number -> koşul doğru olduğu sürece döngü devam eder.
    i++ -> sayaç her döngüde 1 artar
    for(int i; i<10; i++){
    //code block
    }
     */
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println("Hello World");
            // i 10olunca döngü biter
        }
        //Dikkat!!! scope kavramı önemlidir ve dikkat etmezsek hatalı sonuçlar alabiliriz.

        System.out.println("-----------------------");

        for(int i = 0; i<4; i++) System.out.println("tek satır kod");

        System.out.println("--------");

        int sayac = 0;
        for(;sayac<10;sayac++){
            System.out.println("sayac: "+sayac);
        }

        int a= 0;
        for(;a<10;){
            System.out.println("sayac: "+ a);
            a++;
        }

        // for döngüsünü yukarıdaki gibi de kullanabilirsiniz.

    }



}
