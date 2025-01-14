/*
 * This is the NAndItsDouble class that I will use to solve the Leetcode problem. 
 *
 * Date: 01/11/2025
 * Author: Nick Burkett
 *
 * Status: WIP
 */

import java.io.*;       //Need to import a library for the hashmap.
import java.util.*;     //Needed for the hashmap.

public class NAndItsDouble{

        /*
         * Here is my function checkIfExists that will be used to solve this Leetcode problem.
         *
         * @param int[] arr - array passed in that I must search through.
         * @return boolean - return if two indicies exist that fall in line with the problem requirments. 
         */
        public boolean checkIfExists(int[] arr){
                
                HashSet<Integer> set = new HashSet<>();     //Need to initialize a hashset to store items in arr[].

                //Now I need to loop through the array and start the process of looking.
                for(int i = 0; i < arr.length; i++){
                        
                        //Need to check the edge case of arr.length = 0 or arr.length = 1. 
                        if(arr.length == 0 || arr.length == 1){
                                
                                return false;   //If arr.length is 0 or 1, then just return false.
                        }
                }
        }

        public static void main(String[] args){

                HashSet<Integer> set = new HashSet<>();

                set.add(1); 
                set.add(2);
                set.add(12);
                set.add(5);

                System.out.println(set.contains(5));
        }
}
