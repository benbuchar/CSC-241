/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demos;

import java.util.Scanner;
import maps.NoteMap;
import note.SNote;

/**
 *
 * @author Ben
 */
public class NoteMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        interpretSolfege();
    }

    public static final NoteMap noteMap = new NoteMap();
    
    private static void interpretSolfege() throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Sing, my angel of music! Sing for me!");
            String solfegeSequence = scanner.nextLine();
            Scanner solfegeSequenceScanner = new Scanner(solfegeSequence);
            while(solfegeSequenceScanner.hasNext()){
                String solfegeToken = solfegeSequenceScanner.next();
                if(!solfegeToken.equalsIgnoreCase("names") && !solfegeToken.equalsIgnoreCase("random")){
                try{
                    SNote note = noteMap.note(solfegeToken);
                    note.play();
                } catch (Exception ex) {
                    String message = ex.getMessage();
                    System.out.println("### that's not solfege: " + message);
                }
                } else if (solfegeToken.equalsIgnoreCase("random")){
                    String name = noteMap.random();
                    SNote note = noteMap.note(name);
                    note.play();
                } else {
                    System.out.println(noteMap.toString());
                }
            }
            
        }
       
    }

}
