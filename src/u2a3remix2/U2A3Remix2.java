/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2a3remix2;

/**
 *
 * @author Jack
 */
import java.util.Scanner;
public class U2A3Remix2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //define variables
        Scanner keyedInput = new Scanner (System.in);
   	 
    	String [ ] friends = new String [5];
   	//collect values
    	System.out.println("Enter the names of ten friends:");
    	for (int i = 0; i <= 4; i = i + 1)
    	{
        	friends[i] = keyedInput.nextLine();
    	}
   	//output values 
    	System.out.println("The 2nd, 3rd and 4th names listed were:");
    	System.out.println("Fourth: " + friends[1]);
    	System.out.println("Seventh: " + friends[2]);
        System.out.println("Seventh: " + friends[3]);
    }
    
}
