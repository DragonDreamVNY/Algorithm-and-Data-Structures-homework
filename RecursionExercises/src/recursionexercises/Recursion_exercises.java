package recursion_exercises;

/**
 *
 * @author DragonDream
 */
public class Recursion_exercises {
    
 
    public static void main(String[] args) {
        
        power(3, 4);
        System.out.println( power(3,4) );
    }
    
    public static int power(int base, int exp){
            if(exp == 1) { return base; } // any number to the power of 1 is itself
            else if (exp == 0) { return 1; } //EXAMPLE any number to the power of 0 is 1.
                    
            else {
               // ( power(base, exp = 1) ) * power(base, exp-1); //calls itself
                return exp; 
            }
            
    }//end power
}

