
package com.mycompany.zad2;
//usporedi_sumu_iznad_i_ispod_sporedne_dijagonale;
import java.util.Scanner;

public class Zad2{
    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum_iznad = 0;
        int sum_ispod = 0;
        int[][] matrica = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrica[i][j] += (int)(Math.random()*10); 
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrica[i][j]);
            }
            System.out.println("");
        }
         
        System.out.println("");
       for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
              if(i+j > n - 1){
                  sum_ispod += matrica[i][j];
              }
              else if(i+j < n - 1){
                  sum_iznad += matrica[i][j];
              }
            }
        }
        System.out.println("suma ispod : ");
          System.out.println(sum_ispod);
           System.out.println("suma iznad : ");
          System.out.println(sum_iznad);
        
          
          if(sum_ispod > sum_iznad){
              System.out.println("-1");
          }else if(sum_ispod < sum_iznad){
                System.out.println("1");
          }else if(sum_ispod == sum_iznad){
             System.out.println("0");
          }
    }
}

