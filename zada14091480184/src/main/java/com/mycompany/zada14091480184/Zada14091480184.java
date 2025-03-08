/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zada14091480184;


import java.util.Scanner;
public class Zada14091480184 {

    public static void main(String[] args) {
       
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        
        Radnik r1 = new Radnik("","");
        Radnik r2 = new Radnik("","");
        
        
        r1.setIme(input1.nextLine());
        r1.setPrezime(input1.nextLine());
        r1.setPlaca(input1.nextDouble());
        
        r2.setIme(input2.nextLine());
        r2.setPrezime(input2.nextLine());
        r2.setPlaca(input2.nextDouble());
        
        
        if(r1.getPlaca() == r2.getPlaca()){
            System.out.println("Isti su");
        }else{
            System.out.println("Nisu isti");
        }
        
    }
}
