/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zada14091480184;

public class Osoba {
    
    private String ime;
    private String prezime;
    
    public Osoba(String ime,String prezime){
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
