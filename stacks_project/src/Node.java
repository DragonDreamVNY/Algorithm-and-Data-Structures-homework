

/**
 *
 * @author k00223361 Vincent Lee
 */
// ref: https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/linked%20lists.html
// ref: http://www.datadisk.co.uk/html_docs/java/data_structures.htm
public class Node {
    private Student data;  // element stored in this node, many examples use String or int
    private Node next; // reference to the next node in the list
    
   // Notes: constructor method
   // Node(Object e, Node n) { 
   //   element = e; 
   //   next = n; 
   // }
    
    //initialize empty node
    public Node() { }     
    
    // newStudentElement is the new Student Object which doesn't contains an arrayList (phew!) 
    // MainFrame insert gves 10 input dialogs -> Student Class, creates new Student instant -> 
    public Node(Student newStudentData, Node newFirst) { 
        data = newStudentData;
        next = newFirst;
    }  
    
    
    //update method --setElement--
    public void setData(Student newData){ 
        data = newData;  // newElement
    }

    public void setNext(Node newNext) { 
        next = newNext; 
    }

    // accessor methods --getElement--
    public Student getData( ) {
        return data; //returns this element
    }

    public Node getNext( ) { 
        return next; 
    }

}// end Node

