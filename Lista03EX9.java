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
public class Lista03EX9 {
    public static void main(String[] Args){
        Scanner Leia = new Scanner(System.in);
        int c,n,i,p;
        
        p=0;
        
        System.out.print("Digite um número: ");
        n = Leia.nextInt();
        if(n==1){
           System.out.printf("O número %d não é um número primo \n",n); 
        }else{
        for(c=0;c<=n;c++){
            for(i=0;i<=c;i++){
                if(c%i==0){
                    p=p+1;
                    
                }
                
            }
        }
                if(p==2){
                    System.out.printf("O número %d é um número primo \n",n);
                    
                }else{
                    System.out.printf("O número %d não é um número primo \n",n);
                }
        
        }
    }
}
