/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Scanner;

/**
 *
 * @author Jonas
 */
public class Lista03EX5 {
    public static void main(String[] Args){
        Scanner Leia = new Scanner(System.in);
        int n1,n2,n3,n4;
        String t;

        n2 = 0;
        n3 = 0;
        n4 = 0;
        System.out.print("Informe o número: ");
        n1 = Leia.nextInt();
        n2 = n2+n1;
        System.out.println("Digite (s) para digitar outro número ou (n) para finalizar ?");
        t = Leia.next();
        
        while(t.equals("s")){
            
            System.out.print("Informe o número: ");
            n1 = Leia.nextInt();
            n2 = n2+n1;
            if(n1>1000){
                t = "n";
            }else{
            if(n1%2 ==1){
                n3=n1+n3;
            }else{
                n4=n1+n4;
                System.out.println("Digite (s) para digitar outro número ou (n) para finalizar ?");
                    t = Leia.next();
            }
            }

        }
        System.out.printf("O total de números pares é %d \n",n4);
        System.out.printf("O total de números impares é %d \n",n3);
        
    }
    
    
}
