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
public class Lista03EX7 {
    public static void main(String[] Args){
        Scanner Leia = new Scanner(System.in);
        float n1,n2,n3,n4,n5,n6;
        int c;
        
        c=0;
        n1=1;
        n2=0;
        n3=0;
        n4=0;
        while(n1>0){
            System.out.print("Informe a média do aluno: ");
            n1 = Leia.nextFloat();
            c++;
            n4=n4+n1;
            if(n1>n2){
                n2=n1;
            }else{
                n3=n1;
        } 
            
            
        }
        n5=n4/c;
            System.out.printf("A maior média é %.2f \n",n2);
            System.out.printf("A menor média é %.2f \n",n3);
            System.out.printf("A média da turma é %.2f \n",n5);
    }
}
