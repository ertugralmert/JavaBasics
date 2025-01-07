package javabasics.J06_method;

public class P28_Method_Ornek {
    /**
     * bir method tanımlayın. method bir String ve farklı türlerde değerler alsın.
     * String ifade içinde kullanılacak özel bir karakter olsun karakter "<>" olsun
     * Bu bağlamda söyle bir kullanım ve çıktıyı sağlayan bir method yazmanız gerekir.
     * Girdi ->>> ekranaYazdir("bu iki sayi: <> ve <> aralarınd asaldır.<>"5,9,"doğru bir ifade");
     * Çıktı -> bu iki sayi: 5 ve 9 aralarında asal dur. doğru bir ifade
     */
    public static void main(String[] args) {

    }

    public static void ekranaYazdir(String ifade, Object... degeler){
        String[] ifadeDizisi = ifade.split(" ");
        StringBuilder sb = new StringBuilder();
        int sayac = 0;
        for(int i = 0; i<ifadeDizisi.length; i++){
            if(ifadeDizisi[i].equals("<>")){
                sb.append(degeler[sayac]).append(" ");
                sayac++;
            }else {
                sb.append(ifadeDizisi[i]).append(" ");
            }
        }
        System.out.println(sb);
    }
}
