package com.mycompany.zad6;

//N i M ucitati matricu A[N][M], zatim za unose:
//R,K,NB i MB kreirati novu matricu B[NB][MB] koja predstavlja podmatricu matrice A s početkom u redu R
// i koloni K (dimenzije podmatrice ne smiju izac iz okvira matrice A). Ukoliko su dimenzije podmatrice veće od dimenzija
// matrice A tada program treba ispisati "Neispravan unos"
// ulaz:
// prvo se unosi podatak N i M
// zatim unesi podatak R,K, NB, MB
// zatim se unose vrijednosti matrice A
// izlaz:
// podmatrica B dimenzija [NB][MB]
import java.util.Scanner;
public class Zad6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        int M = input.nextInt();
        int[][] A = new int[N][M];
         
        int R = input.nextInt();
        int K = input.nextInt();
        int NB = input.nextInt();
        int MB = input.nextInt();
        
        if( K + NB > N || R + MB > M || R < 0 || K < 0 ){
            System.out.println("Neispravan unos");
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                A[i][j] = (int)(Math.random()*10);
            }
        }
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(A[i][j]);
            }
            System.out.println("");
        }
        
        int[][] B = new int[NB][MB];
        
        for(int i = K; i < NB; i++ ){
            for(int j = R; j < MB; j++){
                B[i][j] += A[i][j];
            }
        }
        
        for(int i = K; i < NB; i++ ){
            for(int j = R; j < MB; j++){
                System.out.print(B[i][j]);
            }
            System.out.println("");
        }
    }
}
