/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testers;

import datatype.BinaryTree;
import datatype.BinaryTreeCreationException;

/**
 *
 * @author Ben
 */
public class MyBinaryTreeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testLR();
    }

    private static void testLR() {
        System.out.println("Creating tree ...");
        BinaryTree<String,String> tree = new BinaryTree<>();
        System.out.println("Adding elements directionally ...");
        
        try{
            tree.addLR("red", null, "");
            tree.addLR("blue", null, "l");
            tree.addLR("green", null, "r");
            tree.addLR("black", null, "ll");
            tree.addLR("white", null, "lr");
            tree.addLR("purple", null, "rl");
            tree.addLR("yellow", null, "rr");
            tree.addLR("orange", null, "lll");
            tree.addLR("indigo", null, "llr");
            tree.addLR("aqua", null, "lrl");
            tree.addLR("tangerine", null, "lrr");
            tree.addLR("pink", null, "rll");
            tree.addLR("ghostwhite", null, "rlr");
            tree.addLR("gray", null, "rrl");
            tree.addLR("brown", null, "rrr");
            tree.addLR("gainsboro", null, "llll");     
        } catch (BinaryTreeCreationException ex){
            ex.printStackTrace();      
        }
        
        System.out.println("PREORDER ...");
        tree.preorder();
        System.out.println("INORDER ...");
        tree.inorder();
        System.out.println("POSTORDER ...");
        tree.postorder();
    }

}
