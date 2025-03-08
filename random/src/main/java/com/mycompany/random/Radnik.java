
package com.mycompany.random;


public class Radnik extends Osoba{
    
    
    private double placa;
   
    public Radnik(String ime,String prezime){
        super(ime,prezime);
    }
    
    public void setPlaca(double placa){
       this.placa = placa;
    }
    public double getPlaca(){
        return placa;
    }
    
}
