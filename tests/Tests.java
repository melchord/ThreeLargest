package tests;

import source.ThreeLargest;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Junit tests for class which will find the three largest numbers in an unsorted integer array
 * and return the numbers from smallest to largest
 * @author - Melchor Dominguez
 * @version - 11/11/2019
 */
public class Tests{
    
    @Test    
    public void TestCase1(){
        int[] expected = {7, 8, 55};
        assertTrue(compare(ThreeLargest.findThreeLargestNumbers(new int[] {55, 7, 8}), expected));
    }

    @Test
    public void TestCase2(){
        int[] expected = {11, 43, 55};
        assertTrue(
            compare(ThreeLargest.findThreeLargestNumbers(new int[] {55, 43, 11, 3, -3, 10}), expected));
    }

    @Test
    public void TestCase3(){
        int[] expected = {-2, -1, 7};
        assertTrue(
            compare(ThreeLargest.findThreeLargestNumbers(new int[] {-1, -2, -3, -7, 7, -541, -18}), expected));
    }

    @Test
    public void TestCase4(){
        int[] expected = {23, 35, 54};
        assertTrue(
            compare(ThreeLargest.findThreeLargestNumbers(new int[] {2, 23,  5, 6, 15, 54, 20, 35}), expected)); 
    }
    
    /**
     * Helper function to determine if the two arrays are equal
     * @param arr1 - first array for compare
     * @param arr2 - second array to compare
     * @return true - if all the values in the arrays are in the correct order and match
     *          false - the arrays do not equally match 
     */
    public boolean compare(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }

}
