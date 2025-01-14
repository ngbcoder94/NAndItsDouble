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

                        //Now I need to check if I am on the first index of arr
                        if(i == 0){
                                set.add(arr[i]);    //If so, just add arr[i] to the set.
                        }
                        else{
                                int arrVal = arr[i];    //Store the value of arr[i]. 

                                //Check if I have seen 2*arr[i].
                                if(set.contains((2*arrVal)) == true){
                                        
                                        //If so, check if i != j.
                                        if(i != arrVal){
                                                
                                                //Now I need to check the condition 0 <= i AND j < arr.length.
                                                if(i >= 0 && (2*arrVal) < arr.length){
                                                        
                                                        return true;     //If I pass all the conditions above, return true.
                                                }
                                        }
                                }
                                else{
                                        
                                        //If I fall in here, I just need to add arr[i] to the set and keep moving.
                                        set.add(arrVal);
                                }
                        }
                }

                //If I get to the end of the array and haven't returned false already...
                //...then there doesn't exist two indicies that meet the problems conditions and I need to return false.
                return false;
        }

        public static void main(String[] args){

                int[] helperData = {10, 2, 5, 3};            //Create some test data.

                NAndItsDouble tmpObj = new NAndItsDouble();      //Create an instance of the object for testing.
                
                System.out.println(tmpObj.checkIfExists(helperData));
        }
}
