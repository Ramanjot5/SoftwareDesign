/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designweek1;

import java.util.Scanner;

/**
 *
 * @author srinivsi
 */
public class designweek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       //take a word i/p from user
        Scanner in = new Scanner(System.in); 
        String word = in.next();
        //split char from word and store chars in array
        char[] reverse = new char[word.length()];
        for(int i=0;i<word.length();i++)
        {
            reverse[i] = word.charAt(i);
        }
         for(int i=reverse.length-1;i>=0;i--)
         {
             System.out.print(reverse[i]);
         }
        
               
    }
    
}
