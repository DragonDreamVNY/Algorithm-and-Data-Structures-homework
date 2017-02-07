/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * LIFO linkedstack class
 * @author k00223361 Vincent Lee 
 * Ref: http://algs4.cs.princeton.edu/13stacks/LinkedStack.java.html
 * Ref: https://www.cs.cmu.edu/~adamchik/15-121/lectures/Stacks%20and%20Queues/Stacks%20and%20Queues.html 
 * Ref: theory and usage: http://introcs.cs.princeton.edu/java/43stack/
*/

public class LinkedStack {
    private Node top;         // reference to the top node on the stack LIFO
    int     size;      // number of elements in/size of the stack
    private Node tempPtr; //temporary pointer for traversing Stack nodes to Print
    private Node searchPtr; //temporary pointer for traversing Stack's nodes for matching String
    
    
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
     
    public Student peek( ) {  // Return the top stack element
        if (isEmpty()) { 
            System.out.println("Stack is empty."); 
        }
	return top.getData();
    }
    
    public void push(Student studentObject) {   
    // Push a new object on top of the stack
        Node newFirst = new Node( ); //create a new Node object for the top
        newFirst.setData(studentObject);
        newFirst.setNext(top);
        top = newFirst; //top or first is now this Node's
        size++; //increase count or size of stack
    }

    public Student pop( ) {   
    // Pop off the top stack element
        Student oldFirst;
        if (isEmpty( )) {    
            System.out.println("Stack is empty."); 
            return null;
        }
        oldFirst = top.getData( );
        top = top.getNext( ); // adjust the top node, first node is assigned to the next node. oldFirst is garbage
        size--;
        return oldFirst;
    }
    
    public void clear(){
        top = null; //set the head or top reference to null
        size = 0;
    }
    
    public String printStack(){
        String output = "";
        tempPtr = top;
        while(tempPtr != null){
            output += tempPtr.getData();
            //move to next node
            tempPtr = tempPtr.getNext();
        }
        return output;
    } //end PrintStack
    
    public String searchStack(String searchTest) {
        String result = "";
        searchPtr = top; 
        
        while(searchPtr != null) {
            // checks if LastName ('lName') in Node is same value as User's Input
            if( ( (searchPtr.getData().getlName().toUpperCase()) ).equals(searchTest) ){
                System.out.println("Last Name is... "+ searchPtr.getData().getlName());
                result = searchPtr.getData().toString(); //will return this to print Student Details
                System.out.println("name found" + result);
                return result;
            } 
            else {
                System.err.println("no name found");
                searchPtr = searchPtr.getNext();  
            }
        } //end while 
        return result;
    }//end search
    

}//end LinkedStack class

//notes for future Vinny
// should put Print and Search functions into a Generics Iterator class