
package com.mycompany.mavenproject2;


public class Nit extends Thread {
    
    private int redak;
    private int[][] A;
    
    public Nit(int[][]A,int redak){
        this.A = A;
        this.redak = redak;
    }
    
    @Override
    public void start(){
        
        int suma = 0;
        
        for(int stupac : A[redak]){
            suma += stupac;
        }
        
        System.out.println("Nit"+redak+"suma: "+ suma);
    }
    
    
}
