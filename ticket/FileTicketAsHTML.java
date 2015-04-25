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
public class FileTicketAsHTML {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String name = getName(input);
        String symbol = getSymbol(input);
        String title = getTitle(input);
        String summary = getSummary(input);
        String question = getQuestion(input);
        String answer = getAnswer(input);

        String fileName = "Ticket" + symbol + ".html";
        FileWriter outputStream = null;
        try {
            outputStream = new FileWriter(fileName);
            BufferedWriter out = new BufferedWriter(outputStream);

            writeFile(out, name, symbol, title, summary, question, answer);

        } catch (IOException ex) {
            Logger.getLogger(FileTicketAsHTML.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(fileName + " has been successfully filed.");

    }

    private static String getName(Scanner input) {
        System.out.println("Name?  ");
        return input.nextLine();
    }

    private static String getSymbol(Scanner input) {
        System.out.println("Symbol?  ");
        return input.nextLine();
    }

    private static String getTitle(Scanner input) {
        System.out.println("Title?  ");
        return input.nextLine();
    }

    private static String getSummary(Scanner input) {
        System.out.println("Summary?  ");
        return input.nextLine();
    }

    private static String getQuestion(Scanner input) {
        System.out.println("Question?  ");
        return input.nextLine();
    }

    private static String getAnswer(Scanner input) {
        System.out.println("Answer?  ");
        return input.nextLine();
    }

    private static void writeFile(BufferedWriter out, String name, String symbol, String title, String summary, String question, String answer) throws IOException {
        out.write("<html>");
        out.newLine();
        out.write("<head><title>Ticket</title></head>");
        out.newLine();
        out.write("<body><font size=\"5\"><font color=\"black\">");
        out.newLine();
        out.write("<p>&nbsp;<p>&nbsp;<p>&nbsp;<p>");
        out.newLine();
        out.write("<center>");
        out.write("<font size=\"7\">");
        out.write("Csc241 Fall 2014<br><b>Ticket to Demo</b>");
        out.write("</font>");
        out.write("</center>");
        out.newLine();
        out.write("<p>&nbsp;<p>&nbsp;<p>");
        out.newLine();
        out.write("<blockquote>");
        out.write("<b>Name</b>");
        out.write(" " + name);
        out.write("</blockquote>");
        out.write("<blockquote>");
        out.write("<b>Assignment</b>");
        out.write(" " + symbol + "-" + title);
        out.write("</blockquote>");
        out.write("<blockquote>");
        out.write("<b>Abstract</b>");
        out.write("<blockquote>");
        out.write(summary);
        out.write("</blockquote>");
        out.write("</blockquote>");
        out.write("<blockquote>");
        out.write("<b>Question</b>");
        out.write("<blockquote>");
        out.write(question);
        out.write("</blockquote>");
        out.write("</blockquote>");
        out.write("<blockquote>");
        out.write("<b>Answer</b>");
        out.write("<blockquote>");
        out.write(answer);
        out.write("</blockquote>");
        out.write("</blockquote>");
        out.newLine();
        out.write("</font></font></body>");
        out.write("</html>");

        out.close();

    }
}
