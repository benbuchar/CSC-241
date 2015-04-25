/*
 * GUI2, like GUI1, is a program to create on lonely frame. GUI2, however, 
 * establishes a frame class with an eye towards subesquent development.
 */

package gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ben
 */
public class GUI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }
    private static class ThreadForGUI implements Runnable{
        @Override
        public void run(){
            GUI2 gui = new GUI2();
        }
    }
    public GUI2(){
        KFrame frame = new KFrame("GUI2");
    }
    
//modelling the featured frame of the GUI
    
    private class KFrame extends JFrame{
        public KFrame(String title){
            super(title);
            setSize(500,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

}
