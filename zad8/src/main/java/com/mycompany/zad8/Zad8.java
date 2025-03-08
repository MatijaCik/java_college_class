
package com.mycompany.zad8;

import java.util.Scanner;
public class Zad8 {

    public static void main(String[] args) throws InterruptedException  {
      Scanner input = new Scanner(System.in);
      String recenica = input.nextLine();
      String[] rijeci = recenica.trim().split("\\s+");
       
      
      for(int i = 0; i < rijeci.length; i++){
          System.out.println("Nit : " + i + " Suma = ");
          MojaNit nit = new MojaNit(i,rijeci[i]);
          nit.start();
          nit.join();
          
      }
    }
}
