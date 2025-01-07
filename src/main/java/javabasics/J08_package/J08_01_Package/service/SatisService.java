package javabasics.J08_package.J08_01_Package.service;

import javabasics.J08_package.J08_01_Package.repository.KargoRepository;
import javabasics.J08_package.J08_01_Package.repository.SatisRepository;
import javabasics.J08_package.J08_01_Package.repository.UrunRepository;

public class SatisService {

    public void satisYap(){
        SatisRepository satisRepository = new SatisRepository();
        satisRepository.save(); // Satış işlemini kaydet

        UrunRepository urunRepository = new UrunRepository();
        urunRepository.remove(); // satılan ürün stoktan düş

        KargoRepository kargoRepository = new KargoRepository();
        kargoRepository.save(); // Kargo bilgilerini kaydet
    }
}
