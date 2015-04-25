/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

/**
 *
 * @author Ben
 */
public class SpecialPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 1; i < 999; i++) {
            for (int j = 2; j < 1000; j++) {
                if (i < j) {
                    double a = ((Math.pow(i, 2)) + (Math.pow(j, 2)) + 1) / (i * j);
                    if ((a == Math.floor(a))) {
                        System.out.println(i + " " + j);
                    }
                }

            }

        }

    }

}
