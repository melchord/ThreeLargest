package source;

/**
 * Class which will handle all the logic of finding the largest three numbers in an
 * array and displaying them from lowest to largest
 * @author - Melchor Dominguez
 * @version - 11/4/2019
 */
public class ThreeLargest{
    
    /**
     * Main method that will handle all the logic and receive the original array to check.
     * @param array - Integer array of numbers in no particular order
     * @return int[3]  - ordered list of largest three numbers found the array
     */        
    public static int[] findThreeLargestNumbers(int[] array){
        //load an initial array with the minimum value of an integer
        int[] largest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        
        //check each number to see if it is one of the largest 
        for(int num: array){
            check(num, largest);
        }

        return largest;
    }
    
    /**
     * Helper function to determine if the current number is larger than any of the numbers
     * in the current array
     * @param num - number which needs to be checked 
     * @param largest - array of numbers where one will be replaced if it is smaller
     *              than num
     */
    public static void check(int num, int[] largest){
        //start at the smallest number and work up the list
        for(int i = largest.length - 1; i >= 0 ; i--){
            //if the current number is greater than an element in the array,shift the array
            if(num > largest[i]){
                shift(largest, num, i); 
                return; // stop the function if reached
            }
        }
    }

    /**
     * Helper function which will shift the array so that the current number
     * is in the correct position
     * @param largest - array that needs to be shifted
     * @param number - number which will be placed in the array
     */
    public static void shift(int[] largest, int num, int index){
        for(int i = 0; i <= index; i++){
            if(i == index){
                largest[i] = num; // put the number in the correct position
            }else{
                largest[i] = largest[i + 1]; // shift the number down to the left
            }
        }
    }
}
