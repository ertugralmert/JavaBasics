package javabasics.J06_method;

public class P27_Method_Ornek {
    // bir ifade alan ve ifade içinde ki belli karakterleri almak sayısal index değeleri talep
    //eden bir method yazalım.

    public static void main(String[] args) {
        String yazi = selectedSubstring("bugün hava çok soğuk değil idi, ancak yağmur hissediliyordu",
        0,18,23,41);
        System.out.println(yazi); //buğm

    }

    public static String selectedSubstring(String ifade, int... index){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<index.length; i++){
            /*
            index[i] -> bize verilen sayısal değerlerin içinden ilgili sayıyı çekmemize yarar
            ifade.charAt() -> ifadenin içinde alınmak istenilen karakteri almamıza sağlar.
             */
            result.append(ifade.charAt(index[i]));
        }
        return result.toString();
    }
}
