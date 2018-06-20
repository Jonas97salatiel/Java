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
public class Lista02B {
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        int N1,N2,N3;
        System.out.println("Informe o valor do lado 1: ");
        N1 = Leia.nextInt();
        System.out.println("Informe o valor do lado 2:");
        N2 = Leia.nextInt();
        System.out.println("Informe o valor do lado 3:");
        N3 = Leia.nextInt();
        
        if ((N1+N2>=N3)&&(N2+N3>=N1)&&(N3+N1>=N2)){
            System.out.println("triângulo detectado");
        } else{
            System.out.println("Triângulo inválido");
        }
        if ((N1==N2)&&(N2==N3)&&(N3==N1)){
        System.out.println("O triângulo é equilatero");
        }
        if ((N1==N2)&&(N1!=N3)){
            System.out.println("O triângulo e isóceles ");
        }
        if ((N1!=N2)&&(N2!=N3)&&(N1!=N3)){
            System.out.println("O trinângulo é escalo");
        }
    }
    
}
