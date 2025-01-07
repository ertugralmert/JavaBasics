package javabasics.J04_string;

public class P11_Performans {
    public static void main(String[] args) {
        String lowPerformance = "Bugün hava güzel idi";
        long startLow = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) {
            lowPerformance = lowPerformance + i;
        }
        long endLow = System.currentTimeMillis();
        System.out.println("Geçen Süre: "+ (endLow - startLow));

        System.out.println("****");

        StringBuilder goodPerformance = new StringBuilder("Bugün hava güzel idi");
        long startGood = System.currentTimeMillis();
        for(int i = 0; i<10000; i++) {
            goodPerformance.append(i);
        }
        long endGood = System.currentTimeMillis();
        System.out.println("Geçen Süre: "+ (endGood - startGood));
    }
}
