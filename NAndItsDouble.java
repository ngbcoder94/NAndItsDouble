/*
 * This is the NAndItsDouble class that I will use to solve the Leetcode problem. 
 *
 * Date: 01/11/2025
 * Author: Nick Burkett
 */

import java.io.*;       //Need to import a library for the hashmap.
import java.util.*;     //Needed for the hashmap.

public class NAndItsDouble{
                         
        public static void main(String[] args){

                HashSet<Integer> set = new HashSet<>();

                set.add(1); 
                set.add(2);
                set.add(12);
                set.add(5);

                System.out.println(set.contains(5));
        }
}
