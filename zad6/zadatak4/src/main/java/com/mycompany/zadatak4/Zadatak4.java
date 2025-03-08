
// program koji ce za cjelobrojnu kv matricu A(max100 elem) s N redaka i N stupaca izracunati sumu
// svih znamenaka iznad gl dijagonale ukljucujuci i glavnu
package com.mycompany.zadatak4;

import java.util.Scanner;
public class Zadatak4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        do{
            System.out.println("Unesite broj N: ");
            N = input.nextInt();
        }while(N <= 0 || N > 100);
        
        int[][] A = new int[N][N];
        
        for(int i = 0; i < N ; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = (int)(Math.random()*10);
            }
        }
        
         for(int i = 0; i < N ; i++){
            for(int j = 0; j < N; j++){
              System.out.print(A[i][j]);
            }
            System.out.println();
        }
        int suma = 0;
        
        for(int i = 0; i< N; i++){
            for(int j = 0; j < N; j++){
                if( i == j || j > i){
                    suma += A[i][j];
                }
            }
        }
        
        System.out.println(suma);
    }
}
