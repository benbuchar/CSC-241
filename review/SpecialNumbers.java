/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class SpecialNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;

        int[] rands = new int[20];
        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            int n = rand.nextInt(900) + 100;
            rands[i] = n;
            System.out.print(n + " ");
        }
        for (int i = 0; i < 20; i++) {
            sum = sum + rands[i];
        }
        int mean = sum / 20;
        System.out.println();

        for (int i = 0; i < 20; i++) {
            if (rands[i] > mean) {
                System.out.print(rands[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            String n = Integer.toString(rands[i]);
            if (n.contains("1")) {
                System.out.print(rands[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            String n = Integer.toString(rands[i]);
            int a = n.charAt(0);
            int b = n.charAt(1);
            int c = n.charAt(2);
            if (a == c || a == b || b == c) {
                if (!(a==b&&a==c)) {
                    System.out.print(n + " ");
                }

            }

        }

    }

}
