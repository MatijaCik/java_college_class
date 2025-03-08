
package com.mycompany.zad8;


public class MojaNit extends Thread {
    
    int i;
    private String rijec;
    public MojaNit(int i, String rijec){
        this.i = i;
        this.rijec = rijec;
    }
    
    public void run(){
        
        char slovo = 0;
        int suma = 0;
        for( i = 0; i < rijec.length(); i++){
            slovo = rijec.charAt(i);
            suma +=  slovo;
        }
        System.out.println(suma);
    
}
}
