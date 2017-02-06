package recursion_exercises;

/**
 * @author DragonDream
 */
public class GreatestCommonDenom {
    gcd(100,75);
    
    public int gcd(int m, int n){
        if(m == n) { return m; }
        else if(m > n ) { 
            gcd(m - n, n);
            return n;
        } 
        else {
            gcd(n);
            return n;
        }// end else
          
    
    }    
    
}
