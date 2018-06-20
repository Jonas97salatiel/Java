/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

/**
 *
 * @author Jonas
 */
public class Lista03EX3 {
    public static void main(String[] Args){
        int c;
        
        for (c=1000; c<=1999; c++){
            if(c%11 == 5){
                System.out.println(c);
            }
        }
    }
    
}
