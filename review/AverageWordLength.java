/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package review;

import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class AverageWordLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        int totalCharacters = 0;
        int numberOfWords = 0;
        
        System.out.print("Type some words followed by the ENTER key ...");
        Scanner linesc = new Scanner(kb.nextLine());
        
        while(linesc.hasNext()){
           totalCharacters = totalCharacters + linesc.next().length();
           numberOfWords++;
        }
        System.out.println("average word length = " + (double)totalCharacters/numberOfWords);

    }

}
