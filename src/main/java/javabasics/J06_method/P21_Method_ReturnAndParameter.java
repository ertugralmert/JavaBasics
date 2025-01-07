package javabasics.J06_method;

public class P21_Method_ReturnAndParameter {
    public static void main(String[] args) {
        // Bir üçgenin alanını hesapla ve sonucu bana ver
        int ucgenAlan = ucgenAlanHesaplama(5,10);
        System.out.println("üçgenin alanı: "+ ucgenAlan); //25


    }

    public static int ucgenAlanHesaplama(int h, int l){
        int ucgeninAlani = h*l/2;
        return ucgeninAlani;

    }
}
