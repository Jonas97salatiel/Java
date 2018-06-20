/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01java;

/**
 *
 * @author Jonas
 */
public class Lista01JAVAEX1 {

    
    public static void main(String[] args) {
    int c,c1,v;

    c=1;
    v=550;
    for(c1=1;c1<=12;c1++){
            System.out.printf("%d°Ano %d° Mês Valor: %d \n",c,c1,v);
    }
    for(c=2;c<=4;c++){
        v=(int)(v+(v*0.10));    
        for(c1=1;c1<=12;c1++){
            System.out.printf("%d°Ano %d° Mês Valor: %d \n",c,c1,v);    
         
       }
     }
   
 }
}