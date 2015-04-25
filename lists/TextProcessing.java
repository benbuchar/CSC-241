/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author Ben
 */
public class TextProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String fileReadName = getFileReadName(sc);
        String fileWriteName = getFileWriteName(sc) + ".txt";
        ArrayList<String> words = readFile(fileReadName);
        ArrayList<String> wordsAboveAverage = getWordsAboveAverage(words, averageLength(words));
        writeFile(fileWriteName, wordsAboveAverage);

    }

    private static String getFileReadName(Scanner sc) {
        System.out.println("Input the name of the file being read:");
        return sc.nextLine();
    }

    private static String getFileWriteName(Scanner sc) {
        System.out.println("Input the name of the file being written:");
        return sc.nextLine();
    }

    private static ArrayList<String> readFile(String fileReadName) throws FileNotFoundException {
        ArrayList<String> words = new ArrayList<>();
        File file = new File(fileReadName + ".txt");
        Scanner fileSc = new Scanner(file);
        while (fileSc.hasNext()) {
            String word = fileSc.next();
            word = word.replaceAll("[\\W]", "");
            words.add(word);
        }
        return words;
    }

    private static double averageLength(ArrayList<String> words) {
        int lengthSum = 0;
        int totalWords = 0;
        for (String s : words) {
            lengthSum = lengthSum + s.length();
            totalWords = totalWords + 1;
        }
        return (double) lengthSum / totalWords;

    }

    private static ArrayList<String> getWordsAboveAverage(ArrayList<String> words, double averageLength) {
        ArrayList<String> wordsAboveAverage = new ArrayList<>();
        for (String s : words) {
            if (s.length() > averageLength) {
                wordsAboveAverage.add(s);
            }
        }
        return wordsAboveAverage;
    }

    private static void writeFile(String fileWriteName, ArrayList<String> wordsAboveAverage) {
        FileWriter outputStream = null;
        try {
            outputStream = new FileWriter(fileWriteName);
            BufferedWriter out = new BufferedWriter(outputStream);

            for (String s : wordsAboveAverage) {
                out.write(s);
                out.newLine();
            }
            out.close();

        } catch (IOException ex) {
            Logger.getLogger(TextProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(fileWriteName + " has been successfully filed.");
    }

}
