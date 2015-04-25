/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trees;

import datatype.BinaryTree;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ben
 */
public class FrequencyCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
         myTest();   
        
        
    }

    private static void myTest() throws FileNotFoundException {
        File file = new File("futureFoeScenarios.txt");
        Scanner fileSc = new Scanner(file);
        BinaryTree<String,Integer> tree = new BinaryTree<>();
        while(fileSc.hasNext()){
            String token = fileSc.next().toLowerCase().replaceAll("[\\W]", "");
            if(!tree.member(token)){
                tree.addST(token,1);
            } else {
                tree.find(token).setValue(tree.find(token).value()+1);
            }
        } 
        tree.inorder();
    }
}
