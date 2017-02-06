/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * LIFO linkedstack class
 * @author DragonDream
 * Ref: http://algs4.cs.princeton.edu/13stacks/LinkedStack.java.html
 * Ref: https://www.cs.cmu.edu/~adamchik/15-121/lectures/Stacks%20and%20Queues/Stacks%20and%20Queues.html 

*/

public class LinkedStack {
    private Node top;         // reference to the top node on the stack LIFO
    private int size;      // number of elements in/size of the stack
    
    public LinkedStack( ) { // Initialize empty stack
        top = null;
        size = 0;
        
    }

  
    
    public int size( ) {              
	// Returns the current stack size
        return size;
    }
    
     public boolean isEmpty() {       
    // Returns true if the stack is empty
        if (top == null)
            return true;
         else
            return false;
    }
     
    public Object top( ) {  // Return the top stack element
        if (isEmpty( )) { System.out.println("Stack is empty."); }
        
	return top.getData( );
    }
    
    public void push(Object obj) {   
    // Push a new object on top of the stack
        Node nodePlus = new Node( );
        nodePlus.setData(obj);
        nodePlus.setNext(top);
        top = nodePlus;
        size++;
    }

    public Object pop( ) {   
    // Pop off the top stack element
        Object temp;
        if (isEmpty( ))
        {    System.out.println("Stack is empty.");		}
        temp = top.getData( );
        top = top.getNext( );       // adjust the top node
        size--;
        return temp;
    }
    
    

    

    
    
}//end LinkedStack class