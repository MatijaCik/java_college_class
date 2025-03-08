package com.mycompany.lv7;

public class main{

    public static void main(String[] args) {
       
        LansirnaRampa rampa = new LansirnaRampa();
        Raketa raketa0 = new Raketa("letilica",rampa);
        Raketa raketa1 = new Raketa("zvoooom",rampa);
        Raketa raketa2 = new Raketa("omgLETI",rampa);
        
        raketa0.start();
        raketa1.start();
         raketa2.start();
    }
}
