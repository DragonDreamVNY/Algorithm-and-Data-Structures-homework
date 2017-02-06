/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towersOfHanoi;

/**
 *
 * @author DragonDream
 */
public class TowersOfHanoi {
 final static int DISKS = 64;		// no of disks on tower 1
    /**
     * @param args the command line arguments
     */

      public static void main (String args[ ]){
         Move(DISKS, 1,3,2);
         System.exit(0);
      } // end of MAIN
   
   // Move : Move count disks from start to finish using temp for  temporary storage 
      public static void Move(int count, int start, int finish, int temp)
      {
         if (count > 1)
         {
            Move(count-1, start, temp, finish);
            System.out.println("Move a disk from " + start + " to " + finish);
            Move (count-1, temp, finish, start);
         }
         else
            System.out.println("Move a disk from " + start + " to " + finish); 
      } // end of MOVE

      // M(3,1,3,2)  count start finish temp
      // => m (2,1,2,3) //move 
      //    => is greater than 1, (1,2,3,2)
      //        => is greater than 1, m(1,1,3,2)
       //           => else move 1 -> 3
      
      //            job finished. 
      // getjob of size 1, then job of size 2 (, 
    
}
