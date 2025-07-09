/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A_IMPORTANT;

import java.util.Arrays;

/**
 *
 * @author Haziq Nasaruddin
 */
public class Searching {
    
    public static int binarySearch(int[] list, int key) {

        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low
        
    }
    
    
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
            return i;
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        
        int[] list = {-3, 1, 0, 4, 2, -5, 90, 22, 3, 75, 323};
        bubbleSort(list);
        //Arrays.sort(list);
        System.out.println("Found at index : " + binarySearch(list, 3));
        for (int x : list){
            System.out.print(x + " ");
        }
        
        System.out.println(linearSearch(list, 2));
    }
    
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            // Array may be sorted and next pass not needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; // Next pass still needed
                }
            }
        }
    }
    
    
    
}
