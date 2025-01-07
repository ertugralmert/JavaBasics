package javabasics.J07_class.J07_01_kedi_soyutlama;

public class P31_Kedi {
    String tur;
    String cins;
    int uzunluk;
    int agirlik;
    String tuyRengi;
    int yas;
    boolean acMi;
    boolean uyuyorMu; //evet uyuyor: true , hayır uyanık: false
    int hiz;

    public void uyu(){
        uyuyorMu = true;
    }

    public void uyandir(){
        uyuyorMu = false;
    }

    public void yemekYe(){
        if(acMi){
            acMi=false;
            System.out.println("Hayvan doyuruldu");
        }else System.out.println("Zaten karnı tok, yemek yemedi");
    }

}
