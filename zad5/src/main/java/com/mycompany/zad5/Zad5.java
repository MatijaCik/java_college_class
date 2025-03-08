package com.mycompany.zad5;
import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        // Unos veličine matrice
        do {
            n = input.nextInt();
        } while (n <= 0 || n >= 100);

        int[][] A = new int[n][n];

        // Popunjavanje matrice nasumičnim brojevima
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = input.nextInt();//(int) (Math.random() * 10);
            }
        }

        // Ispis matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        int magicSum = 0;
        int[] sumaRed = new int[n];
        int[] sumaStupac = new int[n];
        int sumaG = 0; // Glavna dijagonala
        int sumaS = 0; // Sporedna dijagonala

        // Izračunavanje magičnog zbroja iz prvog reda
        for (int j = 0; j < n; j++) {
            magicSum += A[0][j];
        }

        // Računanje suma redaka, stupaca i dijagonala
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumaRed[i] += A[i][j];
                sumaStupac[j] += A[i][j];
                if (i == j) sumaG += A[i][j];
                if (i + j == n - 1) sumaS += A[i][j];
            }
        }

        // Provjera je li matrica magični kvadrat
        boolean isMagic = true;
        for (int i = 0; i < n; i++) {
            if (sumaRed[i] != magicSum || sumaStupac[i] != magicSum) {
                isMagic = false;
                break;
            }
        }

        if (sumaG != magicSum || sumaS != magicSum) {
            isMagic = false;
        }

        System.out.println(isMagic ? 1 : -1); // Ispis 1 ako je magični kvadrat, inače -1
    }
}
