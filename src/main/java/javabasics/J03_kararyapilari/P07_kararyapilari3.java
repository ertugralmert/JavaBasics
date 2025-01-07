package javabasics.J03_kararyapilari;

public class P07_kararyapilari3 {
    // 1 ile 400 arasında hem 9 un katı hem 15 bölümünden kalan 2 olan sayılar
    public static void main(String[] args) {
        for(int i = 1; i<400; i+=9){
            if (i%9==0 && i%15==0){
                System.out.println(i);
            }
        }
    }
}
