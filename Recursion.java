/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
 
        System.out.println("Enter a number");
            num = sc.nextInt();
        
        binary(num);
    }

    private static void binary(int num) {
        int num02;
        if(num == 1)    {
            System.out.println(num);
        }else if(num == 0)  {
            System.out.println(num);
        }else{
            System.out.print(num % 2 + " ");
            binary(num / 2);
            
        }
        
        
    }
}
