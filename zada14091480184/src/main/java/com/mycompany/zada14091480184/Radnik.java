/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zada14091480184;

/**
 *
 * @author Matija
 */
public class Radnik extends Osoba {
    
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
