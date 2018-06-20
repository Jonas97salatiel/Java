/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista04;

/**
 *
 * @author Jonas
 */
public class Lista04 {
     public static void main(String[] args) {
     float N1,N2,N3,N4;
     N1 = 1;
     N2 = 2;
         System.out.printf("Primeira posição:%.0f Segunda posição:%.0f \n",N1,N2);
    
    N3 = N1;
    N4 = N2;
    N1 = N4;
    N2 = N3;
         System.out.printf("Primeira posição:%.0f Segunda posição:%.0f \n",N1,N2);
         
     }
}
