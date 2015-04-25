/*
 * GUI4 places some dead buttons in the frame using a BorderLayout manager.
 */

package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ben
 */
public class GUI4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }
    
    private static class ThreadForGUI implements Runnable {
        @Override
        public void run(){
            GUI4 gui = new GUI4();
        }
    }
    
    public GUI4() {
        KFrame frame = new KFrame("GUI 4");
    }

    //modeling the featured frame of the GUI
    
    public class KFrame extends JFrame {
        
        private JButton blueButton;
        private JButton redButton;
        private JButton greenButton;
        private JButton yellowButton;
        private JLabel colorLabel;
        
        public KFrame(String title){
            super(title);
            setSize(500,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            addComponents(getContentPane());
            setVisible(true);
        }
        
        private void addComponents(Container contentPane){
            blueButton = new JButton("Blue");
            redButton = new JButton("Red");
            greenButton = new JButton("Green");
            yellowButton = new JButton("Yellow");
            colorLabel = new JLabel("Press a button ...",
                         SwingConstants.CENTER);
            contentPane.setLayout(new BorderLayout());
            contentPane.add(blueButton,BorderLayout.NORTH);
            contentPane.add(redButton,BorderLayout.SOUTH);
            contentPane.add(greenButton,BorderLayout.EAST);
            contentPane.add(yellowButton,BorderLayout.WEST);
            contentPane.add(colorLabel,BorderLayout.CENTER);
            setLocationRelativeTo(null);
        }
    }
}
