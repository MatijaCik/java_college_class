package com.mycompany.lv7;

public  class LansirnaRampa {
    
    
    public synchronized void lanisraj(){
        
        for(int i = 10; i>=0; i--){
            System.out.println("odbrojavanje: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Prekinuto odbrojavanje.");
            }
        }
    }
}
