/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class MultiwaySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Analyzing the Lyrics for Future Foe Scenarios by the Silversun Pickups . . .");
        System.out.println();
        File file = new File("FutureFoeScenarios.txt");
        Scanner sc = new Scanner(file);
        LinkedList<String> list = new LinkedList<>();

        System.out.println("Initial Order:");
        list = initialOrder(list, sc);
        int max = displayList1(list, 0);

        String[] queue1 = createQueue1(list, max);
        System.out.println();
        displayQueue(queue1, 1, "By Vowel Count");

        System.out.println();
        System.out.println("Order After First Pass:");
        list = reconstructList(list, queue1);
        displayList2(list);

        String[] queue2 = createQueue2(list, max);
        System.out.println();
        displayQueue(queue2, 2, "By Length and Vowel Count");

        System.out.println();
        System.out.println("Final Word Order:");
        list = reconstructList(list, queue2);
        displayList2(list);
    }

    private static LinkedList<String> initialOrder(LinkedList<String> list, Scanner sc) {
        while (sc.hasNext()) {
            String token = sc.next().toLowerCase().replaceAll("[\\W]", "");
            list.add(token);
        }
        return list;
    }

    private static int displayList1(LinkedList<String> list, int m) {
        int maxCounter = m;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxCounter) {
                maxCounter = list.get(i).length();
            }
            System.out.print(list.get(i) + " ");
        }
        return maxCounter;
    }

    private static String[] createQueue1(LinkedList<String> list, int max) {
        String[] queue1 = new String[max + 1];
        for (int i = 0; i < list.size(); i++) {
            String token = list.get(i);
            int vowelCount = 0;
            for (int j = 0; j < token.length(); j++) {
                if (checkVowel(token, j)) {
                    vowelCount = vowelCount + 1;
                }
            }
            if (queue1[vowelCount] == null) {
                queue1[vowelCount] = token;
            } else {
                queue1[vowelCount] = queue1[vowelCount] + " " + token;
            }

        }
        return queue1;

    }

    private static boolean checkVowel(String token, int j) {
        String c = token.substring(j, j + 1);
        if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u") || c.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    private static void displayQueue(String[] queue, int queueNum, String s) {
        System.out.println("Queue " + queueNum + " " + s + ":");
        for (int i = 1; i < queue.length; i++) {
            if (queue[i] != null) {
                System.out.println(i + ":" + " " + queue[i]);
            }
        }
    }

    private static LinkedList<String> reconstructList(LinkedList<String> list, String[] queue1) {
        list.clear();
        for (int i = 0; i < queue1.length; i++) {
            list.add(i, queue1[i]);
        }
        return list;
    }

    private static void displayList2(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    private static String[] createQueue2(LinkedList<String> list, int max) {
        String[] queue2 = new String[max + 1];
        for (int i = 0; i < list.size(); i++) {
            int index = 0;
            if (list.get(i) != null) {
                String[] splitLine = list.get(i).split(" ");
                for (int j = 0; j < splitLine.length; j++) {
                    index = splitLine[j].length();
                    if (queue2[index] == null) {
                        queue2[index] = splitLine[j];
                    } else {
                        queue2[index] = queue2[index] + " " + splitLine[j];
                    }
                }

            }

        }
        return queue2;
    }

}
