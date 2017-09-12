/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.util.*;

/**
 *
 * @author Muhammad Adnan Mohib
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Size of the Array: ");
        int sizeOfArray = in.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray; i++){
            System.out.println("Number " + (i+1) + " : ");
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Enter a number to find: ");
        int number = in.nextInt();
        boolean flag = false;
       int max;
       int min;
        for(int i=0; i<sizeOfArray; i++)
        {
            if(arr[i] == number)
            {
                System.out.println("Number Found at " + (i+1) + " Position");
                flag = true;
            }
        }
        if(flag == false)
        {
            System.out.println("Number Not Found ");
        }
    }
    
}
