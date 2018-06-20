/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Scanner;

/**
 *10
 * 
 * @author Jonas
 */
public class Lista03EX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
        int c,n,m,o;
        c = 1;
        o = 0;
        m = 0;
        System.out.printf("Informe o %d número:",c);
            n = Leia.nextInt();
            c++;
            m=n;
            o=n;
        
        do{
            System.out.printf("Informe o %d número:",c);
            n = Leia.nextInt();
            c++;
            if(m<n){
                m = n;
            }
            if (o>n) {
                o = n;
                
            }
                    
        }while (c<=15);
        System.out.printf("O menor número é %d \n",o);
        System.out.printf("O maior número é %d ",m);
    }
   
}
 