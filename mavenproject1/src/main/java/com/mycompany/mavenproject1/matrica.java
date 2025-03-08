package com.mycompany.mavenproject1;
import java.util.Scanner;
//N i M ucitati matricu A[N][M], zatim za unose:
//R,K,NB i MB kreirati novu matricu B[NB][MB] koja predstavlja podmatricu matrice A s početkom u redu R
// i koloni K (dimenzije podmatrice ne smiju izac iz okvira matrice A). Ukoliko su dimenzije podmatrice veće od dimenzija
// matrice A tada program treba ispisati "Neispravan unos"
// ulaz:
// prvo se unosi podatak N i M
// zatim unesi podatak R,K, NB, MB
// zatim se unose vrijednosti matrice A
// izlaz:
// podmatrica A dimenzija [NB][MB]
public class matrica{
    
   public static void main(String[] args){
       
       Scanner input = new Scanner(System.in);
       System.out.println("n: ");
       int N = input.nextInt();
       System.out.println("M: ");
       int M = input.nextInt();
   
       int[][] A = new int[N][M];
       System.out.println(" R ");
       int R = input.nextInt();
       System.out.println(" K");
       int K = input.nextInt();
       System.out.println("NB");
       int NB = input.nextInt();
       System.out.println("MB");
       int MB = input.nextInt();
      
       
       
       System.out.println("Unos matrice A :");
       for(int i = 0; i < N; i++){
           for(int j = 0; j < M; j++){
               A[i][j] = input.nextInt();
               
           }
       }
       System.out.println("print matrice: ");
       for(int i = 0; i < N; i++){
           for(int j = 0; j < M; j++){
              System.out.print(A[i][j]);
               
           }
           System.out.println();
       }
       
       
       if(R < 0 || K < 0 || R + NB > N || K + MB > M ){
           System.out.println("Neispravan unos");
       }else{
            int[][] B = new int[NB][MB];
           for(int i = 0; i< NB; i++){
               for(int j = 0; j < MB; j++){
                  B[i][j] = A[i+R][j+K];
               } 
           }
           System.out.println("podmatrica B");
           for(int i = 0; i< NB; i++){
               for(int j = 0; j < MB; j++){
                 System.out.print(B[i][j]);
               } 
               System.out.println();
           }
           
       }
   } 
    
}