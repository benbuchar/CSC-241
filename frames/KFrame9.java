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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import painter.SPainter;
import shapes.SRectangle;
import shapes.SSquare;

/**
 *
 * @author Ben
 */
public class KFrame9 extends JFrame implements ActionListener {

    JButton blueButton;
    JButton greenButton;
    JButton plumButton;
    JButton yellowButton;
    JButton redButton;
    JButton orangeButton;
    JButton cyanButton;
    JButton colorButton;
    SRectangle rectangle;
    JTextField input;
    JPanel reflector;
    SPainter ico;
    HashMap<String, Color> map;

    public KFrame9(String title) {
        super(title);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponents(getContentPane());
        addListeners();
        establishColorMap();
        setVisible(true);
    }

    public void addComponents(Container contentPane) {
        blueButton = new JButton("Blue");
        greenButton = new JButton("Green");
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
       
        reflector = new JPanel();       
        input = new JTextField();
        
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(reflector, BorderLayout.CENTER);
        contentPane.add(input, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
    }

    public void addListeners() {
        blueButton.addActionListener(this);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        yellowButton.addActionListener(this);
        cyanButton.addActionListener(this);
        plumButton.addActionListener(this);
        colorButton.addActionListener(this);
        orangeButton.addActionListener(this);
        input.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (event.getSource() instanceof JTextField) {
            input.setText("");
        }
        if (command.equalsIgnoreCase("Blue")) {
            reflector.setBackground(Color.BLUE);
        } else if (command.equalsIgnoreCase("Green")) {         
            reflector.setBackground(Color.GREEN);
        } else if (command.equalsIgnoreCase("Plum")) {
            reflector.setBackground(new Color(128,0,128));
        } else if (command.equalsIgnoreCase("Yellow")) {
            reflector.setBackground(Color.YELLOW);
        } else if (command.equalsIgnoreCase("Red")) {
            reflector.setBackground(Color.RED);
        } else if (command.equalsIgnoreCase("Orange")) {
            reflector.setBackground(Color.ORANGE);
        } else if (command.equalsIgnoreCase("Cyan")) {
            reflector.setBackground(Color.CYAN);
        } else if (command.equalsIgnoreCase("Color")) {
            reflector.setBackground(getColor(map,new Random()));
        }

    }

    private static Color getColor(HashMap<String, Color> map, Random r) {
        Color color = null;
        Set<String> set = map.keySet();
        int randomInt = r.nextInt(set.size());
        int index = 0;
        for (String s : set) {
            if (index == randomInt) {
                return map.get(s);
            } else {
                index++;
            }
        }
        return color;
    }

    private void establishColorMap() {
        map = new HashMap<String, Color>();
        map.put("Blue", Color.BLUE);
        map.put("Green", Color.GREEN);
        map.put("Plum", new Color(128,0,128));
        map.put("Yellow", Color.YELLOW);
        map.put("Red", Color.RED);
        map.put("Orange", Color.ORANGE);
        map.put("Cyan", Color.CYAN);
    }

}
