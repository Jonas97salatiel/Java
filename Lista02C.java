/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.util.Scanner;

/**
 *
 * @author Jonas
 */
public class Lista02C {
    public static void main(String[] args){
        Scanner Leia = new Scanner(System.in);
        float N1,N2,N3,N4;
        System.out.print("Informe a primeira nota: ");
        N1 = Leia.nextFloat();
        System.out.print("Informe a segunda nota: ");
        N2 = Leia.nextFloat();
        System.out.print("Informe a terceira nota: ");
        N3 = Leia.nextFloat();
        
        if ((N1>N2)&&(N1>N3)){
            System.out.println("A maior nota é: " + N1);
        }
        if ((N2>N1)&&(N2>N3)){
            System.out.println("A maior nota é: " + N2);
        }
        if ((N3>N1)&&(N3>N2)){
            System.out.println("A maior nota é: " + N3);
        }
        N4 = (N1+N2+N3)/2;
        System.out.println("A média é: " + N4);

    } 
    
}
