/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_IMPORTANT;

/**
 *
 * @author Haziq Nasaruddin
 */
public class SortingImplementation {
    
    /**
     *  INSERTION SORT
     */
    public static void insertionSort(int[] list) {
        
        for (int i = 1; i < list.length; i++) {
            /** insert list[i] into a sorted sub list list[0..i-1] so that
                 list[0..i] is sorted. */
            int currentElement = list[i];
            int k;
            // For loop to check the position of the current element and where it should be inserted
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k]; // This will shift the larger elements to the right of the 
            }

            // Insert the current element into list[k+1]
            list[k + 1] = currentElement;
        }
    }
    
    
    /**
     *  BUBBLE SORT
     */
    public static void bubbleSort(int[] list) {

        for (int k = 0; k < list.length - 1 ; k++) {
            
            for (int i = 0; i < list.length - 1; i++) {
                
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                }
            }
        }
    }
    
    
    
    /**
     *  SELECTION SORT
     */
    public static <T extends Comparable<T>> void selectionSort(T[] list)
    {
        for (int i = 0; i < list.length-1; i++) {
          // Find the minimum in the list[i..list.length-1]
          T currentMin = list[i];
          int currentMinIndex = i;
          for (int j = i + 1; j < list.length; j++) {
            if (currentMin.compareTo(list[j]) > 0) {
              currentMin = list[j];
              currentMinIndex = j;
            }
          }
          
          swap(list, currentMinIndex, i);
        }
    }
    
    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2)
    {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }
    
    
    
    /**
     * MERGE SORT
     */
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

  /** Merge two sorted lists */
    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        // these are only here to check whether there are extra items in the array
        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        // these are only here to check whether there are extra items in the array
        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }
    
    
    
}
