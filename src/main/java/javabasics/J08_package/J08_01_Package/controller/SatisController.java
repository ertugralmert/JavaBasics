package javabasics.J08_package.J08_01_Package.controller;

import javabasics.J08_package.J08_01_Package.service.SatisService;

public class SatisController {

    public void urunSatisIslemi(){
        SatisService satisService = new SatisService();
        satisService.satisYap();
    }
}
