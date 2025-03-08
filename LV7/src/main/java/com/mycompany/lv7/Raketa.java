package com.mycompany.lv7;

public class Raketa extends Thread {
    private String ime;
     private LansirnaRampa Rampa;

    public Raketa(String ime, LansirnaRampa Rampa) {
        this.ime = ime;
        this.Rampa = Rampa;
    }
    
   @Override
  public void run(){
      System.out.println("Raketa " + ime + " najavljuje pocetak lansiranja.");
        Rampa.lanisraj();
        System.out.println("Raketa " + ime + " je poletjela!");
    }
  }
   
    
