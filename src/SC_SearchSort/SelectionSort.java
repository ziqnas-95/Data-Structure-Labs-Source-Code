package SC_SearchSort;

import java.util.Arrays;

public class SelectionSort {
    /** The method for sorting the numbers */
    /**
     * 
     * @param list : array to be sorted
     * 
     * How it works : 
     *  the program will iterate through the array
     *  first it will set the first element as the minimum value
     *  and will compare the other elements in the array whether it is the smallest value
     *  if there are smaller values, then set that as the current minimum value (w/ index)
     *  swap the places of the current iteration with the smallest item
     * 
     */
    public static void selectionSort(double[] list) {
        
        for (int i = 0; i < list.length - 1; i++) {
            
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) { // this line plays a crucial role in determining whether the array is sorted front/backwards
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        double[] list = {-2, 4.5, 5, 1, 2, -3.3};
        selectionSort(list);
        
        System.out.println("FRONT SORTED");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        
        System.out.println("\n\nBACK SORTED");
        for (int i = list.length-1; i > -1; i--)
            System.out.print(list[i] + " ");
        
        
    }
}