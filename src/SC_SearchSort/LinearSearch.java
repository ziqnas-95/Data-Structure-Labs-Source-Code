package SC_SearchSort;

public class LinearSearch {
    /** The method for finding a key in the list */
    /**
     * 
     * @param list : the array to traverse through
     * @param key : the value to be searched in the array
     * @return  the index of the searched value given that the key is inside the array
     *          -1 if value is not found in the array
     */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] list = {4, 5, 1, 2, 9, -3};
        
        System.out.println(linearSearch(list, 2));
    }
}
