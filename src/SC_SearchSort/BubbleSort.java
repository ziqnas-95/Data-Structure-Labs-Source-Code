package SC_SearchSort;

public class BubbleSort {
    /** Bubble sort method */
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

    /** A test method */
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println("");
        
        bubbleSort(list);
        
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println("");
    }
  }