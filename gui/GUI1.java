/*
 * GUI1 is a program to create one lonely frame.
 */

package gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ben
 */
public class GUI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());      
    }
    private static class ThreadForGUI implements Runnable {
        @Override
        public void run() {
            GUI1 gui = new GUI1();
        }
    }
    public GUI1 (){
        JFrame frame = new JFrame("GUI 1");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
