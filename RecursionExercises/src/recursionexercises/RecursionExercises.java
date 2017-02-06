/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionexercises;

/**
 *
 * @author DragonDream
 */
public class RecursionExercises {
int a = 100;
int b =75;

        
    private static int findGCD(int n1, int n2) {
    //base case
        if(n2 == 0){
            return n1;
        }
        return findGCD(n2, n1%n2);
        
    }
    
    private static int findLCD(int n1, int n2) {
    //base case
        if(n1 % n2 == 0){
            return n1;
        }
        return findLCD(n1 + n1, n2);
        
    }
    
}// end class
