/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import painter.SPainter;
import shapes.SSquare;
//
///**
// *
// * @author Ben
// */
public class KFrame10 extends JFrame implements ActionListener {
    JPanel reflector;
    SPainter painter = null;
    SSquare square;
    JButton blueButton;
    JButton greenButton;
    JButton plumButton;
    JButton yellowButton;
    JButton redButton;
    JButton orangeButton;
    JButton cyanButton;
    JButton colorButton;
    JTextField input;
    HashMap<String,Color> map;
    
    public KFrame10(String title){
        super(title);
        setSize(800,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(getContentPane());
        addListeners();
        setVisible(true);
        establishColorMap();
        setLocationRelativeTo(null);
    }

    private void establishColorMap() {
        map = new HashMap<>();
        map.put("Blue", Color.BLUE);
        map.put("Green", Color.GREEN);
        map.put("Plum", new Color(128,0,128));
        map.put("Yellow", Color.YELLOW);
        map.put("Red", Color.RED);
        map.put("Orange", Color.ORANGE);
        map.put("Cyan", Color.CYAN);
    }

    private void addComponents(Container contentPane) {
        blueButton = new JButton("Blue");
        greenButton= new JButton("Green");
        plumButton = new JButton("Plum");
        yellowButton = new JButton("Yellow");
        redButton = new JButton("Red");
        orangeButton = new JButton("Orange");
        cyanButton = new JButton("Cyan");
        colorButton = new JButton("Color");
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(blueButton);
        controlPanel.add(greenButton);
        controlPanel.add(plumButton);
        controlPanel.add(yellowButton);
        controlPanel.add(redButton);
        controlPanel.add(orangeButton);
        controlPanel.add(cyanButton);
        controlPanel.add(colorButton);
        
        input = new JTextField();
        
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel,BorderLayout.NORTH);
        contentPane.add(painter,BorderLayout.CENTER);
        contentPane.add(input,BorderLayout.SOUTH);
        setLocationRelativeTo(null);
    }

    private void addListeners() {
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);
        plumButton.addActionListener(this);
        yellowButton.addActionListener(this);
        redButton.addActionListener(this);
        orangeButton.addActionListener(this);
        cyanButton.addActionListener(this);
        colorButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent event){
        if(painter == null){
            painter = new SPainter(reflector);
            square = new SSquare(2000);
        } 
        String text = event.getActionCommand().toLowerCase();
        if(event.getSource() == JTextField){
        input.setText("");
    }
        interpretPrimitiveCommand(text.toLowerCase());
    }
    
    private void interpretPrimitiveCommand(String command){
        if(command.equalsIgnoreCase("color")){
            command = randomColorName();
        }
        try{
            Color color = map.get(command);
            painter.setColor(color);
            painter.paint(square);
            sleep(1000);
            painter.setColor(Color.WHITE);
            painter.paint(square);
        } catch(Exception ex){
            reflector.setBackground(Color.BLACK);
        }
    }
    private void sleep(int n){
        try{
            Thread.sleep(n);
        } catch(InterruptedException ex){
            Logger.getLogger(KFrame10.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private String randomColorName() {
        Set<String> set = map.keySet();
        int index = 0;
        Random rand = new Random();
        int randomInt = rand.nextInt(set.size());
        for(String s: set){
            if(index==randomInt){
                return s;
            } else {
                index++;
            }
        }
        return "";
    }
}
