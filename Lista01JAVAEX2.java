/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01java;

import java.util.Scanner;
/**
 *
 * @author Jonas
 */
public class Lista01JAVAEX2 {
    public static void main(String[] Args){
        Scanner Leia = new Scanner(System.in);
        float n1,n2,n3,r;
        n1=12;
        n2=20;
        System.out.print("Informe a distância: ");
        n3 = Leia.nextFloat();
        if(n3>12){
            System.out.print("Distância invalida");
        }else{
            r=(float) (n3*3);
            System.out.printf("A onde percorreu %.1f metros em %.2f  Minutos.  \n",n3,r);
        }
    }
}
