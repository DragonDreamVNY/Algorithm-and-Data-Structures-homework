

/**
 *
 * @author DragonDream
 */
//ref: https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html
public class Node {
    private Object data;  // element stored in this node
    private Node next; // reference to the next node in the list

   // Notes: constructor method
   // Node(Object e, Node n) { 
   //   element =e; 
   //   next = n; 
   // }
    
    //initialize empty node
    public Node() { }     
    
    // newStudentElement is the new Student Object which contains an arrayList (phew!) 
    // MainFrame insert gves 10 input dialogs -> Student Class, creates new Student called newS -> 
    public Node(Object newStudentElement, Node nextNode) { 
        data = newStudentElement;
        next = nextNode;
    }  
    
    
    //update method --setElement--
    public void setData(Object newData){ 
        data = newData;  // newElement
    }

    public void setNext(Node newNext) { 
        next = newNext; 
    }

    // accessor methods --getElement--
    public Object getData( ) {
        return data; //returns this element
    }

    public Node getNext( ) { 
        return next; 
    }


}// end Node

