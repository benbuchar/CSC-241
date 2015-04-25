/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import frames.KFrame6;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ben
 */
public class GUI6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           SwingUtilities.invokeLater(new ThreadForGUI());
    }
    
    private static class ThreadForGUI implements Runnable {
        @Override
        public void run(){
            GUI6 gui = new GUI6();
        }
    }
    
    public GUI6() {
        KFrame6 frame = new KFrame6("GUI 6");
    }
    
    
}
