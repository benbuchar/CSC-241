/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import frames.KFrame11;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ben
 */
public class GUI11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {
        public void run() {
            GUI11 gui = new GUI11();
        }
    }

    public GUI11() {
        KFrame11 frame = new KFrame11("Color Thing #3");
    }

}

    


