
package com.mycompany.lv5;


public class Lv5 {

    public static void main(String[] args) {
         
       
    public static void usporedi(Test auto1, Test auto2) {
        // Izračun stvarne potrošnje za prvi auto
        double stvarnaPotrosnja1 = (auto1.getPotrosioGoriva() / auto1.getPrijedjenPut()) * 100;
        // Izračun stvarne potrošnje za drugi auto
        double stvarnaPotrosnja2 = (auto2.getPotrosioGoriva() / auto2.getPrijedjenPut()) * 100;

        // Usporedba sa deklariranom potrošnjom
        System.out.println("Rezultati usporedbe:");
        System.out.println("Automobil 1: Deklarirana potrošnja: " + auto1.getPotrosnja() + 
                           " L/100km, Stvarna potrošnja: " + stvarnaPotrosnja1 + " L/100km");
        System.out.println("Automobil 2: Deklarirana potrošnja: " + auto2.getPotrosnja() + 
                           " L/100km, Stvarna potrošnja: " + stvarnaPotrosnja2 + " L/100km");

        // Određivanje štedljivijeg automobila
        if (stvarnaPotrosnja1 < stvarnaPotrosnja2) {
            System.out.println("Automobil 1 je štedljiviji.");
        } else if (stvarnaPotrosnja1 > stvarnaPotrosnja2) {
            System.out.println("Automobil 2 je štedljiviji.");
        } else {
            System.out.println("Oba automobila imaju istu potrošnju.");
        }
    }
}


// Klasa Automobil
class Automobil {
    // Privatni članovi
    private double spremnik;
    private double potrosnja;
    private String vrsta_goriva;
    private String tip;
    private String marka;

    // Konstruktor bez parametara
    public Automobil() {
        this.spremnik = 50.0; // default vrijednost u litrima
        this.potrosnja = 7.0; // default potrošnja u litrama na 100 km
        this.vrsta_goriva = "Benzin"; // default vrsta goriva
        this.tip = "Limuzina"; // default tip automobila
        this.marka = "Default Marka"; // default marka automobila
    }

    // Getter i setter za spremnik
    public double getSpremnik() {
        return spremnik;
    }

    public void setSpremnik(double spremnik) {
        this.spremnik = spremnik;
    }

    // Getter i setter za potrosnju
    public double getPotrosnja() {
        return potrosnja;
    }

    public void setPotrosnja(double potrosnja) {
        this.potrosnja = potrosnja;
    }

    // Getter i setter za vrstu goriva
    public String getVrstaGoriva() {
        return vrsta_goriva;
    }

    public void setVrstaGoriva(String vrsta_goriva) {
        this.vrsta_goriva = vrsta_goriva;
    }

    // Getter i setter za tip
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    // Getter i setter za marku
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}

// Klasa Test koja nasljeđuje klasu Automobil
class Test extends Automobil {
    // Privatni članovi
    private double potrosio_goriva; // stvarno potrošeno gorivo u litrama
    private double prijedjen_put;  // prijeđeni put u kilometrima

    // Getter i setter za potrosio_goriva
    public double getPotrosioGoriva() {
        return potrosio_goriva;
    }

    public void setPotrosioGoriva(double potrosio_goriva) {
        this.potrosio_goriva = potrosio_goriva;
    }

    // Getter i setter za prijedjen_put
    public double getPrijedjenPut() {
        return prijedjen_put;
    }

    public void setPrijedjenPut(double prijedjen_put) {
        this.prijedjen_put = prijedjen_put;
    }
}

// Klasa Izracun s metodom usporedi

