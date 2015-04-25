/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import frames.KFrame10;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ben
 */
public class GUI10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {
        public void run() {
            GUI10 gui = new GUI10();
        }
    }

    public GUI10() {
        KFrame10 frame = new KFrame10("Color Thing #2");
    }

}
