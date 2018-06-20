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
public class Lista02A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leia = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int N1 = Leia.nextInt();
        if (N1%2==0){
            System.out.println("O número e par");
        }else{ 
                    System.out.println("O número é impar");
                    }
            if (N1>=0){
                System.out.println("O número é positivo");
            } else {
                System.out.println("O número é negativo");
            }       
            
        } 
        
    
    
}
