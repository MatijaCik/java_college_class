
package com.mycompany.zad9;
import java.util.Scanner;
public class Zad9{
    public static void main(String[] args) throws InterruptedException{
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int[][] A = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = (int)(Math.random()*10);
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
               System.out.print(A[i][j]);
            }
            System.out.println("");
        }
        
       for(int i = 0; i < n; i++){
           Nit nit = new Nit(A,i);
           
            nit.start();
            nit.join();
       }
    }
    
}