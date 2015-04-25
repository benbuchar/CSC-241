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
public class BinaryTree<K, V> implements BinaryTreeADT<K, V> {

    private K key;
    private V value;
    private BinaryTree<K, V> lchild;
    private BinaryTree<K, V> rchild;

    public BinaryTree() {
        key = null;
    }

    /**
     * Returns the value of a BinaryTree object.
     * @return 
     */
    public V value() {
        return value;
    }

    /**
     * Sets the value of a BinaryTree object to the
     * specified value.
     * @param value 
     */
    public void setValue(V value) {
        this.value = value;
    }

    /**
     * Determines if a BinaryTree object has a value 
     * for key or not.
     * @return 
     */
    public boolean empty() {
        return key == null;
    }

    /**
     * Returns the height of a BinaryTree object.
     * @return 
     */
    public int height() {
        if (empty()) {
            return 0;
        } else {
            return 1 + max(lchild.height(), rchild.height());
        }
    }

    /**
     * Determines which input number is larger in value.
     * @param a
     * @param b
     * @return 
     */
    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Displays elements in a BinaryTree object based on 
     * the pre-order algorithm: visit, left, right.
     */
    public void preorder() {
        if (!empty()) {
            visit();
            lchild.preorder();
            rchild.preorder();
        }
    }

    /**
     * Displays elements in a BinaryTree object based on
     * the in-order algorithm: left, visit, right.
     */
    public void inorder() {
        if (!empty()) {
            lchild.inorder();
            visit();
            rchild.inorder();
        }
    }

    /**
     * Displays elements in a BinaryTree object based on
     * the post-order algorithm: left, right, visit.
     */
    public void postorder() {
        if (!empty()) {
            lchild.postorder();
            rchild.postorder();
            visit();
        }
    }

    /**
     * Adds elements to a BinaryTree object lexicographically
     * if printed lexicographically.
     * @param key
     * @param value 
     */
    public void addST(K key, V value) {
        if (empty()) {
            sprout(key, value);
        } else {
            Comparable cey = (Comparable) key;
            Comparable t = (Comparable) this.key;
            if (cey.compareTo(t) < 0) {
                lchild.addST(key, value);
            } else if (cey.compareTo(t) > 0) {
                rchild.addST(key, value);
            }
        }
    }
/**
 * Adds elements to a BinaryTree object non-deterministically.
 * @param key
 * @param value 
 */
    public void addND(K key, V value) {
        if (empty()) {
            sprout(key, value);
        } else if (Math.random() < 0.5) {
            lchild.addND(key, value);
        } else {
            rchild.addND(key, value);
        }
    }

    /**
     * Adds elements to a BinaryTree object in a specified
     * order: beginning, left or right.
     * @param key
     * @param value
     * @param dir
     * @throws BinaryTreeCreationException 
     */
    public void addLR(K key, V value, String dir) throws BinaryTreeCreationException {
        if (dir.equals("")) {
            sprout(key, value);
        } else if (dir.substring(0, 1).equalsIgnoreCase("L")) {
            lchild.addLR(key, value, dir.substring(1));
        } else if (dir.substring(0, 1).equalsIgnoreCase("R")) {
            rchild.addLR(key, value, dir.substring(1));
        } else {
            throw new BinaryTreeCreationException();
        }
    }
    
    /**
     * Returns the value of the specified key.
     * @param key
     * @return 
     */
    public V get(K key) {
        BinaryTree<K,V> t = find(key);
        return t.value;
    }
    
    /**
     * Searches a BinaryTree object for an element
     * containing the specified key.
     * @param key
     * @return 
     */
    public BinaryTree<K,V>find(K key){
        if(empty()){
            return null;
        } else if (this.key.equals(key)){
            return this;
        } else {
            BinaryTree<K,V> l = lchild.find(key);
            if(l !=null) {return l;}
            BinaryTree<K,V> r = rchild.find(key);
            if(r!=null) { return r;}
            return null;
        }
    }
    
    /**
     * Searches a BinaryTree object for an element
     * containing the specified key. If found, returns
     * true.
     * @param key
     * @return 
     */
    public boolean member(K key){
        if(empty()){
            return false;
        } else if( this.key.equals(key)){
            return true;
        } else {
            return(lchild.member(key) | rchild.member(key));
        }
    }
    
    /**
     * Displays the key and value of an element
     * in a BinaryTree object.
     */
    public void visit(){
        String rep;
        if(value==null){
            rep = "---";
        } else {
            rep = value.toString();
        }
        String s = "[" + key + ":" + rep + "]";
        System.out.println(s);
    }
    
    /**
     * Creates a BinaryTree object with other BinaryTree
     * objects as children.
     * @param key
     * @param value 
     */
    public void sprout(K key, V value){
        this.key = key;
        this.value = value;
        this.lchild = new BinaryTree<K,V>();
        this.rchild = new BinaryTree<K,V>();
    }



}
