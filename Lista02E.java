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
public class Lista02E {
    public static void main(String[] Args){
        Scanner Leia = new Scanner(System.in);
        float N1,N2,N3,N4;
        N4 = 0;
        System.out.print("Informe o primeiro número:");
        N1 = Leia.nextFloat();
        System.out.println("Informe a operação desejada:");
        System.out.println("Para calcular média digite (1)");
        System.out.println("Para somar digite (2)");
        System.out.println("Para multiplicar digite (3)");
        N3 = Leia.nextFloat();
        System.out.print("Informe o segundo número:");
        N2 = Leia.nextFloat();
        
        if (N3 == 1){
            N4 = (N1+N2)/2;
        }
        if (N3 == 2){
            N4 = N1+N2;
        }
        if (N3 == 3){
            N4 = N1*N2;
        }
        System.out.printf("Segue o resultado da operação: %.0f \n",N4);
}
}