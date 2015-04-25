/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticket;

import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class PrintTicketAsText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = getName(input);
        String symbol = getSymbol(input);
        String title = getTitle(input);
        String summary = getSummary(input);
        String question = getQuestion(input);
        String answer = getAnswer(input);
        
        printTicket(name, symbol, title, summary, question, answer);

    }
    
    public static String getName(Scanner in){
        System.out.print("Name?  ");
        return in.nextLine();          
    }
    
    public static String getSymbol(Scanner in){
        System.out.print("Symbol?  ");
        return in.nextLine();
    }

    private static String getTitle(Scanner in) {
        System.out.print("Title?  ");
        return in.nextLine();
    }

    private static String getSummary(Scanner in) {
        System.out.print("Summary?  ");
        return in.nextLine();
    }

    private static String getQuestion(Scanner in) {
        System.out.print("Question?  ");
        return in.nextLine();
    }

    private static String getAnswer(Scanner in) {
        System.out.print("Answer?  ");
        return in.nextLine();
    }

    private static void printTicket(String n, String sym, String t, String sum, String q, String a) {
        System.out.println("\n\n\n\n\n" + "Cog241/Csc241 Fall 2014");
        System.out.println("Ticket to Demo");
        
        System.out.println("\n\n\n" + "Name:  " + n);
        
        System.out.println("\n\n" + "Assignment:  " + sym + " - " + t);
        
        System.out.println("\n\n" + "Summary...");
        System.out.println(sum);
        
        System.out.println("\n\n" + "Question...");
        System.out.println(q);
        
        System.out.println("\n\n" + "Answer...");
        System.out.println(a); 
    }

}
