/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Jonas
 */
public class Lista03 {
    public static void main(String[] args) {
    Scanner raio = new Scanner(System.in);
        System.out.print("Informe o raio da lata: ");
        float N1 = raio.nextFloat();
        System.out.print("Informe a altura da lata: ");
        float N2 = raio.nextFloat();
        
        float N3 = (N1 * N1);
        double N4 =(double) (Math.PI * N2* N3);
        System.out.printf("O volume da lata é: %.4f",N4);
    }
}
