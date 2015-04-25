/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Ben
 */
public class Julle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> animals = createAnimalList();
        displayAnimals("The animal names ... ", animals);
        LinkedList<Integer> lengths = lengths(animals);
        displayLengths("The lengths of the animal names ...", lengths);
        LinkedList<String> reverseAnimals = reverse(animals);
        displayAnimals("The animal names in reverse order ...", reverseAnimals);
        LinkedList<Double> reals = randomList(77);
        displayReals("The real numbers ... ", reals);
        Double minimum = minimum(reals);
        System.out.println("The minimum number = " + minimum);
        sort(reals);
        displayReals("The real numbers in ascending order ... ", reals);
    }

    private static LinkedList<String> createAnimalList() {
        LinkedList<String> list = new LinkedList<String>();
        list.add("aardvark");
        list.add("bear");
        list.add("crocodile");
        list.add("dove");
        list.add("elephant");
        list.add("finch");
        list.add("giraffe");
        list.add("hyena");
        list.add("iguana");
        list.add("jackalope");
        list.add("bat");
        list.add("walrus");
        list.add("lobster");
        list.add("squirrel");
        list.add("antelope");
        list.add("reindeer");
        list.add("gopher");
        list.add("treefrog");
        list.add("rattlesnake");
        list.add("cuttlefish");
        list.add("dragon");
        list.add("vulture");
        list.add("jellyfish");

        return list;
    }

    private static void displayAnimals(String input, LinkedList<String> animals) {
        System.out.println();
        System.out.println(input);
        System.out.print("< ");
        for (String s : animals) {
            System.out.print(s + " ");
        }
        System.out.print(">");
    }

    private static LinkedList<Integer> lengths(LinkedList<String> animals) {
        LinkedList list = new LinkedList<Integer>();
        for (String s : animals) {
            list.add(s.length());
        }
        return list;
    }

    private static void displayLengths(String input, LinkedList<Integer> lengths) {
        System.out.println();
        System.out.println(input);
        System.out.print("< ");
        for (Integer i : lengths) {
            System.out.print(i + " ");
        }
        System.out.print(">");
    }

    static int index = 0;
    private static LinkedList<String> reverse(LinkedList<String> animals) {
        if(index<=12){
            String first = animals.get(index);
            animals.set(index, animals.get(animals.size()-1-index));
            animals.set(animals.size()-1-index, first);
            index++;
            return reverse(animals);
        } else {
            return animals;
        }


    }

    private static LinkedList<Double> randomList(int i) {
        LinkedList<Double> list = new LinkedList<Double>();
        Random random = new Random();
        for (int j = 0; j < i; j++) {
            Double randomDouble = 1000.00 * random.nextDouble();
            Double doubleOneDecimal = Math.floor(randomDouble) / 10.0;
            list.add(doubleOneDecimal);
        }
        return list;
    }

    private static void displayReals(String input, LinkedList<Double> reals) {
        System.out.println();
        System.out.println(input);
        System.out.print("< ");
        for (Double d : reals) {
            System.out.print(d + " ");
        }
        System.out.print(">");
        System.out.println();
    }

    private static void sort(LinkedList<Double> reals) {
        LinkedList<Double> unsortedReals = new LinkedList<>();
        for (int i = 0; i < reals.size(); i++) {
            unsortedReals.add(reals.get(i));     
        }
        int index = 0;
        while(index<reals.size()){
            Double min = minimum(unsortedReals);
            reals.set(index, min);
            unsortedReals.set(unsortedReals.indexOf(min), 5000.0);
            index++; 
        }   
    }

    private static Double minimum(LinkedList<Double> reals) {
        Double minimum = 9000.0;
        for (int i = 0; i < reals.size(); i++) {
            if (reals.get(i)<=minimum) {
               minimum = reals.get(i);             
            }
                       
        }
        return minimum;     
    }

}
