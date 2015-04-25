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
public class PrintTicketAsHTML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String name = getName(in);
        String symbol = getSymbol(in);
        String title = getTitle(in);
        String summary = getSummary(in);
        String question = getQuestion(in);
        String answer = getAnswer(in);
        
        printTicketAsHTML(name, symbol, title, summary, question, answer);
    }

    private static String getName(Scanner in) {
        System.out.println("Name?  ");
        return in.nextLine();
    }

    private static String getSymbol(Scanner in) {
        System.out.println("Symbol?  ");
        return in.nextLine();
    }

    private static String getTitle(Scanner in) {
        System.out.println("Title?  ");
        return in.nextLine();
    }

    private static String getSummary(Scanner in) {
        System.out.println("Summary?  ");
        return in.nextLine();
    }

    private static String getQuestion(Scanner in) {
        System.out.println("Question?  ");
        return in.nextLine();
    }

    private static String getAnswer(Scanner in) {
        System.out.println("Answer?  ");
        return in.nextLine();
    }

    private static void printTicketAsHTML(String name, String symbol, String title, String summary, String question, String answer) {
        System.out.println("<html>");
        System.out.println("\n<head><title>Ticket</title></head>");
        System.out.println("\n<body><font size=\"5\"><font color=\"black\">");
        System.out.println("\n<p>&nbsp;<p>&nbsp;<p>&nbsp;<p>");
        System.out.println("\n<center>");
        System.out.println("<font size=\"7\">");
        System.out.println("Csc241 Fall 2014<br><b>Ticket to Demo</b>");
        System.out.println("</font>");
        System.out.println("</center>");
        System.out.println("\n<p>&nbsp;<p>&nbsp;<p>");
        System.out.println("\n<blockquote>");
        System.out.println("<b>Name</b>");
        System.out.println(name);
        System.out.println("</blockquote>");
        System.out.println("<blockquote>");
        System.out.println("<b>Assignment</b>");
        System.out.println(symbol+"-"+title);
        System.out.println("</blockquote>");
        System.out.println("<blockquote>");
        System.out.println("<b>Abstract</b>");
        System.out.println("<blockquote>");
        System.out.println(summary);
        System.out.println("</blockquote>");
        System.out.println("</blockquote>");
        System.out.println("<blockquote>");
        System.out.println("<b>Question</b>");
        System.out.println("<blockquote>");
        System.out.println(question);
        System.out.println("</blockquote>");
        System.out.println("</blockquote>");
        System.out.println("<blockquote>");
        System.out.println("<b>Answer</b>");
        System.out.println("<blockquote>");
        System.out.println(answer);
        System.out.println("</blockquote>");
        System.out.println("</blockquote>");
        System.out.println("\n</font></font></body>");
        System.out.println("</html>");
    }

}
