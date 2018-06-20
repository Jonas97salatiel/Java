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
public class Lista03EX6 {
    public static void main(String[] Args){
        Scanner Leia = new Scanner(System.in);
        
        float n1,n2,n3,n4,n5,n6;
        n1=1;
        n2=2;
        n3=3;    
        while((n3>n2)&&(n2>n1)){
                System.out.print("Informe o 1° número: ");
                n1 = Leia.nextFloat();
                System.out.print("Informe o 2° número: ");
                n2 = Leia.nextFloat();
                System.out.print("Informe o 3° número: ");
                n3 = Leia.nextFloat();
                n4=n1+n2+n3;
                n5=n1*n2*n3;
                n6=n4/3;
                System.out.printf(" A soma é: %.4f \n",n4);
                System.out.printf(" O resultado é: %.4f \n",n5);
                System.out.printf(" A média é: %.4f \n",n6);
                
            }    
                          
        
    }
    
}
