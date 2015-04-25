/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import java.util.ArrayList;
import java.util.Scanner;
import maps.NoteMap;
import maps.NoteMapADT;
import note.SNote;

/**
 *
 * @author Ben
 */
public class NoteClassDemo extends NoteMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        NoteMap map = new NoteMap();
        Scanner sc = new Scanner(System.in);
        String line = getLine(sc);
        ArrayList<String> tokens = null;
        getTokens(line, tokens);
        interpret(tokens, map);

    }

    private static String getLine(Scanner sc) {
        return sc.nextLine();
    }

    private static void getTokens(String line, ArrayList tokens) {
        System.out.println("Sing, my angel of music! Sing for me!");
        Scanner lineSc = new Scanner(line);
        while (lineSc.hasNext()) {
            tokens.add(lineSc.next());
        }
    }

    private static void interpret(ArrayList<String> tokens, NoteMap map) throws Exception {
        for (int i = 0; i < tokens.size(); i++) {
            if(!tokens.get(i).equalsIgnoreCase("names")){
                map.note(tokens.get(i));
            } else if(tokens.get(i).equalsIgnoreCase("random")){
                map.random();
            } else {
                map.names();
            }
                      
        }
    }

}
