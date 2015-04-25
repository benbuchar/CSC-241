/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ticket;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ben
 */
public class FileTicketAsText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = getName(input, "Name");
        String symbol = getSymbol(input, "Symbol");
        String title = getTitle(input, "Title");
        String summary = getSummary(input, "Summary");
        String question = getQuestion(input, "Question");
        String answer = getAnswer(input, "Answer");
        
        //String file = makeFile(name, symbol, title, summary, question, answer); <-- Didn't work because /n doesn't transfer over.
        
        String fileName = "Ticket"+ symbol +".txt";
        FileWriter outputStream = null;
        try {
            outputStream = new FileWriter(fileName);
            BufferedWriter out = new BufferedWriter(outputStream);
            
            //out.write(file);
            
            out.write("Cog241/Csc241 Fall 2014");
            out.newLine();
            out.write("Ticket to Demo");
            out.newLine();
            out.newLine();
            out.newLine();
            out.write("Name:  " + name);
            out.newLine();
            out.newLine();
            out.write("Assignment:  " + symbol + " - " + title);
            out.newLine();
            out.newLine();
            out.write("Summary...");
            out.newLine();
            out.write(summary);
            out.newLine();
            out.newLine();
            out.write("Question...");
            out.newLine();
            out.write(question);
            out.newLine();
            out.newLine();
            out.write("Answer... ");
            out.newLine();
            out.write(answer);
            
            out.close();
        } catch (IOException ex){
            Logger.getLogger(FileTicketAsText.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\n" + fileName + " has been successfully filed." + "\n");
    }

    private static String getName(Scanner input, String name) {
        System.out.print(name + "?  ");
        return input.nextLine();
    }

    private static String getSymbol(Scanner input, String symbol) {
        System.out.print(symbol + "?  ");
        return input.nextLine();
    }
    
    private static String getTitle(Scanner input, String title){
        System.out.print(title + "?  ");
        return input.nextLine();
    }

    private static String getSummary(Scanner input, String summary) {
        System.out.print(summary + "?  ");
        return input.nextLine();
    }

    private static String getQuestion(Scanner input, String question) {
        System.out.print(question + "?  ");
        return input.nextLine();
    }

    private static String getAnswer(Scanner input, String answer) {
        System.out.print(answer + "?  ");
        return input.nextLine();
    }

//    private static String makeFile(String n, String sym, String t, String sum, String q, String a) {
//        return "\n\n\n\n\n" 
//                + "Cog241/Csc241 Fall 2014" 
//                + "Ticket to Demo" 
//                + "\n\n\n" 
//                + "Name:  " + n 
//                + "\n\n" 
//                + "Assignment:  " + sym + " - " + t +
//        
//                "\n\n" + "Summary..." 
//                + sum +
//        
//                "\n\n" + "Question..." +
//                q +
//        
//                "\n\n" + "Answer..." +
//                a;
//    }

}
