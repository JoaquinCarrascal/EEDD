package ejercicio3;

import java.util.Arrays;

public class ejercicio3 {

    public static void main(String[] args) {
        
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        // Insert an element in 3rd position of the array (index->2, value->5)
        
        int Index_position = 2;
        int newValue    = 5;
        
        System.out.println("Original Array : "+Arrays.toString(my_array));
        my_array[Index_position] = newValue;
        System.out.println("New Array: "+Arrays.toString(my_array));
    }
}