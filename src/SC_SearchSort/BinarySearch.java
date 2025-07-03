package SC_SearchSort;

import java.util.Arrays;

public class BinarySearch {
  /** Use binary search to find the key in the list */
    /**
     * 
     * @param list : the sorted array to search through 
     * @param key : the value we want to find in the array
     * @return index of the key in the array if found, will return
     */
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

  public static void main(String[] args) {
    int[] list = {-3, 1, 0, 4, 2, -5, 90, 22, 3, 75, 323};
    Arrays.sort(list);
    System.out.println("Found at index : " + binarySearch(list, 5));
    for (int x : list){
        System.out.print(x + " ");
    }
  }
}