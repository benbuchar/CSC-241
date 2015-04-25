/*
 * frame for the GUI6 program.
 */

package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ben
 */
public class KFrame6 extends JFrame implements ActionListener{
    
    private JButton blueButton;
    private JButton redButton;
    private JButton greenButton;
    private JButton yellowButton;
    private JPanel reflector;
    
    public KFrame6(String title) {
        super(title);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(getContentPane());
        addListeners();
        setVisible(true);
    }
    
    private void addComponents(Container contentPane){
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        yellowButton = new JButton("Yellow");
        reflector = new JPanel();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(blueButton,BorderLayout.NORTH);
        contentPane.add(redButton,BorderLayout.SOUTH);
        contentPane.add(greenButton,BorderLayout.EAST);
        contentPane.add(yellowButton,BorderLayout.WEST);
        contentPane.add(reflector,BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }
    
    //Add listeners to the frame
    private void addListeners(){
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        yellowButton.addActionListener(this);
    }

    //This method serves to implement the ActionListener interface
     @Override
     public void actionPerformed(ActionEvent event){
         String command = event.getActionCommand();
         if (command.equals("Red")){
             reflector.setBackground(Color.RED);
         } else if (command.equals("Blue")){
             reflector.setBackground(Color.BLUE);
         } else if (command.equals("Green")){
             reflector.setBackground(Color.GREEN);
         } else if (command.equals("Yellow")){
             reflector.setBackground(Color.YELLOW);
         }
     }
}
