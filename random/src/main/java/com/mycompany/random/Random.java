
package com.mycompany.random;

// klasa Osoa sadrzi privatne atribute ime, prezime - napisi konstruktor i get set metode
// napravi klasu Radnik koja nasljeduje klasu osoba, definira atribut placa(double)
// napisi konstruktore, get set metode i implementaciju "public boolean equals(Object o) koja usporedjuje dva objekta klase
// Radnik po placi
// radnik r1 ima placu 1000e radnik r2 2000, kad ih usporedimo bi trebali dobit ispis "Nisu isti" dok bi
// u suprotnom ispis bio "Isti su"
// u test klasi s tipkovnice unijeti podatke dva dva objekta klase radnik
import java.util.Scanner;
public class Random {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        Radnik r1 = new Radnik("", "");
        Radnik r2 = new Radnik("", "");
        
        r1.setIme(input.nextLine());
        r1.setPrezime(input.nextLine());
        r1.setPlaca(input.nextDouble());
        
        r2.setIme(input2.nextLine());
        r2.setPrezime(input2.nextLine());
        r2.setPlaca(input2.nextDouble());
        
        if(r1.getPlaca() == r2.getPlaca()){
            System.out.println("Isti su");
        }else{
            System.out.println("Nisu isti");
        }
        
    }
}
