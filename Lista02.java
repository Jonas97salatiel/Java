/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02;

import java.util.Scanner;

/**
 *
 * @author Jonas
 */
public class Lista02 {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus celsius: ");
        float N1 = Leia.nextFloat();
        float N2 = (9*N1+160)/5;
        System.out.printf("A temperatura em fahrenheit é %.1f \n",N2);
               
        
        
        
    }
    
}
