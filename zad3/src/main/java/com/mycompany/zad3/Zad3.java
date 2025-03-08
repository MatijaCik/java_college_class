
package com.mycompany.zad3;
 //program koji ce sa kv matricu A s N redaka i N stupaca koja u sebi ima samo 0 i 1 izracunati koliko ima
// pojavljivanja broja 0, a da su oko njega sve jedinice
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int brojac = 0;
        int[][] A = new int[N][N];
        
        for(int i = 0; i < N; i++){
           for(int j = 0; j < N; j++){
             //  A[i][j] =  (int)(Math.random()*2);
           //  A[i][j] = rand.nextInt(2);
           A[i][j] = (int)(Math.random()*2);
           }
        }
        
        for(int i = 0; i < N; i++){
           for(int j = 0; j < N; j++){
               System.out.print(A[i][j]); 
           }
           System.out.println("");
        }
         for(int i = 1; i < N-1; i++){
           for(int j = 1; j < N-1; j++){
               if(A[i][j] == 0){
                   if(A[i-1][j-1] == 1 && A[i][j-1] == 1 &&A[i+1][j-1] == 1 && A[i-1][j] == 1 && A[i+1][j] == 1 && A[i-1][j+1] == 1 && A[i][j+1] == 1 && A[i+1][j+1] == 1){
                       brojac++;
                   }
               }
           }
        }
        System.out.println("Ima: "+brojac+" nula okruzenih jedinicama.");
     }
}
