
import java.util.ArrayList;

/**
 *
 * @author k00223361 Vincent Lee
 */
public class Student {
    // params
    private int studID;
    private String fName;
    private String lName;
    private int age;
    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    private int grade5;
    private int grade6;
    
    /*--- setters student Data---*/
    
    public void setID(int newID){ this.studID = newID; }
    public void setfName(String newfirstName){ this.fName = newfirstName; }   
    public void setlName(String newlastName){ this.lName = newlastName; }  
    public void setAge(int newAge){ this.age = newAge; }  
    public void setGrade1(int newGrade1){ this.grade1 = newGrade1; }
    public void setGrade2(int newGrade2){ this.grade2 = newGrade2; }
    public void setGrade3(int newGrade3){ this.grade3 = newGrade3; }
    public void setGrade4(int newGrade4){ this.grade1 = newGrade4; }
    public void setGrade5(int newGrade5){ this.grade2 = newGrade5; }
    public void setGrade6(int newGrade6){ this.grade3 = newGrade6; }
    
    
    /*--- getters student Data---*/
    public int getID(){ return studID; } 
    public String getfName(){ return fName; }
    public String getlName(){ return lName; }  
    public int getAge(){ return age; } 
    public int getGrade1(){ return grade1; }
    public int getGrade2(){ return grade2; }
    public int getGrade3(){ return grade3; }
    public int getGrade4(){ return grade4; }
    public int getGrade5(){ return grade5; }
    public int getGrade6(){ return grade6; }
    
/*
    //1 default constructor
    public student(){
        this.studID = 0;
        this.fName = "";
        this.lName = "";
        this.age = 0;
        this.grade1 = 0;
        this.grade2 = 0;
        this.grade3 = 0;
        this.grade4 = 0;
        this.grade5 = 0;
        this.grade6 = 0;
   }//with default values for new object instances
*/   
    
   
    // constructor with setter
    public Student(int studentID, String firstName, String lastName, int someAge, int someGrade1, int someGrade2, int someGrade3, int someGrade4, int someGrade5, int someGrade6){
        this.studID = studentID;
        this.fName = firstName;
        this.lName = lastName;
        this.age = someAge;
        this.grade1 = someGrade1;
        this.grade2 = someGrade2;
        this.grade3 = someGrade3;
        this.grade4 = someGrade4;
        this.grade5 = someGrade5;
        this.grade6 = someGrade6;
    }
    
    @Override 
    public String toString(){
        return "\nID: " + this.studID + "\t Name: " + this.fName + " " + this.lName + "\t" + "age: " + this.age
                + "\n" + this.grade1 + "\t" + this.grade2 + "\t" + this.grade3 + "\t" + this.grade4 + "\t" + this.grade5 + "\t" +this.grade6 +"\n";
    }
    
/*
    // constructor methods have same name as Class : student is not the same as Student/ get params from input
    public Student(int studentID, String firstName, String lastName, int someAge, int someGrade1, int someGrade2, int someGrade3, int someGrade4, int someGrade5, int someGrade6) {
        // create an array list ( dynamic size, and index starts at 0 )
        
        

        ArrayList studentList = new ArrayList(); // Could set an initial capacity here inside (), although don't have to, as arrayList is dynamic
        System.out.println("Initial size of arrayList: " + studentList.size());
        
        // add elements to the array list. Capacity increases automatically to match the increasing size of arrayList
        studentList.add(studentID);  
        studentList.add(firstName);
        studentList.add(lastName);
        studentList.add(someAge);
        studentList.add(someGrade1);
        studentList.add(someGrade2);
        studentList.add(someGrade3);
        studentList.add(someGrade4);
        studentList.add(someGrade5);
        studentList.add(someGrade6);
        System.out.println("Size of arraylist after additions: " + studentList.size());

        // display the array list
        System.out.println("Contents of array List: " + studentList);

    }//end constructor method
*/  
// Ref: https://www.tutorialspoint.com/java/java_arraylist_class.htm
// http://stackoverflow.com/questions/8896758/initial-size-for-the-arraylist


/*    
    public void removeStudentArray(){
    // Remove elements from the array list
      studentList.remove("F");
      studentList.remove(2);
      System.out.println("Size of arrayList after deletions: " + studentList.size());
      System.out.println("Contents of array List: " + studentList);
    }
*/
    
    
} //end Student Class
