/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista05;

import java.util.Scanner;

/**
 *
 * @author Jonas
 */
public class Lista05 {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
                
        System.out.print("informe um número: ");
        float N1 = Leia.nextInt();
        float N2 = N1*N1;
        System.out.printf("O resultado é: %.0f \n",N2);
        
        
        
    }
    
}
