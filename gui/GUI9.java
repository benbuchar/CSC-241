/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import javax.swing.SwingUtilities;
import frames.KFrame9;
/**
 *
 * @author Ben
 */
public class GUI9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());

    }
    
    private static class ThreadForGUI implements Runnable {
        public void run() {
            GUI9 gui = new GUI9();
        }
    }
    public GUI9() {
        KFrame9 frame = new KFrame9("Color Thing #1");
    }

}
