// klasa Osoa sadrzi privatne atribute ime, prezime - napisi konstruktor i get set metode
// napravi klasu Radnik koja nasljeduje klasu osoba, definira atribut placa(double)
// napisi konstruktore, get set metode i implementaciju "public boolean equals(Object o) koja usporedjuje dva objekta klase
// Radnik po placi
// radnik r1 ima placu 1000e radnik r2 2000, kad ih usporedimo bi trebali dobit ispis "Nisu isti" dok bi
// u suprotnom ispis bio "Isti su"
// u test klasi s tipkovnice unijeti podatke dva dva objekta klase radnik
package com.mycompany.random;


public class Osoba{
    
    private String ime;
    private String prezime;
    
    public Osoba(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }
    
    public void setIme(String ime){
        this.ime = ime;
    }
    
    public String getIme(){
        return ime;
    }
    
    
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    
    public String getPrezime(){
        return prezime;
    }
    
    
}