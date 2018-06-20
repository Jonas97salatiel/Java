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
public class Lista02D {
    public static void main(String[] Args){
        Scanner Leia = new Scanner(System.in);
        float N1,N2,N3,N4;
        System.out.print("Informe o 1° número: ");
        N1 = Leia.nextInt();
        System.out.print("Informe o 2° número: ");
        N2 = Leia.nextInt();
        System.out.print("Informe o 3° número: ");
        N3 = Leia.nextInt();
        
        if (N2>N1){
            N4 = N1;
            N1 = N2;
            N2 = N4;        
        }
        if (N3>N2){
            N4 = N2;
            N2 = N3;
            N3 = N4;
        }
        if (N2>N1){
            N4 = N1;
            N1 = N2;
            N2 = N4;                           
        }
        if (N3>N2){
            N4 = N2;
            N2 = N3;
            N3 = N4;
        }
        
        
        System.out.println("Escolha (C) para exibir em ordem crescente ou (D) para ordem decrescente");
        String OP = Leia.next();
        String RES = "C";
        String RES1 = "D";    
            
            if (OP.equals(RES)){
                System.out.printf("segue os números em ordem crescente %.0f , %.0f , %.0f",N3,N2,N1);
            
        }
            if (OP.equals(RES1)){
                System.out.printf("segue os números em ordem decrescente %.0f , %.0f , %.0f",N1,N2,N3);
            }
        
    }
    
    
}
