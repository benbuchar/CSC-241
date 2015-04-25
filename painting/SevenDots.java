/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painting;

import java.awt.Color;
import javax.swing.SwingUtilities;
import painter.SPainter;
import shapes.SCircle;

/**
 *
 * @author Ben
 */
public class SevenDots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {

        @Override
        public void run() {
            SevenDots sevenDots = new SevenDots();
        }
    }

    public SevenDots() {
        SPainter ico = new SPainter("Seven Dots", 700, 400);
        ico.setBrushWidth(5);
        SCircle dot = new SCircle(20);
        paintYellowDot(ico, dot);
        paintPurpleDot(ico, dot);
        paintGreenDot(ico, dot);
        paintBlueDot(ico, dot);
        paintRedDot(ico, dot);
        paintOrangeDot(ico, dot);
        paintCyanDot(ico, dot);
    }

    private void paintYellowDot(SPainter ico, SCircle dot) {
        ico.setColor(Color.YELLOW);
        ico.paint(dot);
        ico.setColor(Color.BLACK);
        ico.draw(dot);
    }

    Color purple = new Color(128, 0, 128);

    private void paintPurpleDot(SPainter ico, SCircle dot) {
        ico.mlt(2 * dot.diameter());
        ico.setColor(purple);
        ico.paint(dot);
        ico.setColor(Color.BLACK);
        ico.draw(dot);
    }

    private void paintGreenDot(SPainter ico, SCircle dot) {
        ico.mlt(2 * dot.diameter());
        ico.setColor(Color.GREEN);
        ico.paint(dot);
        ico.setColor(Color.BLACK);
        ico.draw(dot);
    }

    private void paintBlueDot(SPainter ico, SCircle dot) {
        ico.mlt(2 * dot.diameter());
        ico.setColor(Color.BLUE);
        ico.paint(dot);
        ico.setColor(Color.BLACK);
        ico.draw(dot);
        ico.mrt(6 * dot.diameter());
    }

    private void paintRedDot(SPainter ico, SCircle dot) {
        ico.mrt(2 * dot.diameter());
        ico.setColor(Color.RED);
        ico.paint(dot);
        ico.setColor(Color.BLACK);
        ico.draw(dot);
    }

    private void paintOrangeDot(SPainter ico, SCircle dot) {
        ico.mrt(2 * dot.diameter());
        ico.setColor(Color.ORANGE);
        ico.paint(dot);
        ico.setColor(Color.BLACK);
        ico.draw(dot);
    }

    private void paintCyanDot(SPainter ico, SCircle dot) {
        ico.mrt(2 * dot.diameter());
        ico.setColor(Color.CYAN);
        ico.paint(dot);
        ico.setColor(Color.BLACK);
        ico.draw(dot);
    }

}
