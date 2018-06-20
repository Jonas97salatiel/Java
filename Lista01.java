/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author Jonas
 */
public class Lista01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        System.out.println("Informe o primeiro N°: ");
        float N1 = Leia.nextFloat();
        System.out.println("Informe o segundo N°: ");
        float N2 = Leia.nextFloat();
        
        float N3 = N1 + N2;
        float N4 = N1 - N2;
        float N5 = N1 + N2;
        float N6 = (N1 + N2)/2;
        System.out.printf("Soma: %.0f \n", N3);
        System.out.printf("Diferença: %.2f \n", N4);
        System.out.printf("Produto: %.0f \n", N5);
        System.out.printf("Media: %.0f \n", N6);
    }
    
}
