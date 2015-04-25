/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datatype;

/**
 *
 * @author Ben
 */
public class BinaryTreeCreationException extends Exception{
    
    //Creates a new instance of BinaryTreeCreationException without detail message.
    public BinaryTreeCreationException(){
    }
    
    //constructs an instance of BinaryTreeCreationException with the specified detail message.
    public BinaryTreeCreationException(String msg){
        super(msg);
    }
}
