public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        int[] sortedArray = { -22, -15, 1, 7, 20, 35, 55};

        System.out.println(binarySearch(sortedArray, -22));

    }

    // linear search returns the index of the searched value
    public static int linearSearch(int[] intArray, int searchedValue){
        // Traverse the array until the searched value is found or we reach the end of the array
        // O(n)

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == searchedValue){
                return i;
            }
        }
        return -1; // if the value not found in the array
    }

    public static int binarySearch(int[] intArray, int searchedValue){
        // Data must be sorted
        // Divide and conquer: selects the element in the middle of the array and compares it against the searched value
        // if element == searchedValue -> return index
        // element > searchedValue -> search the left half of the array
        // element < searchedValue -> search the right half of the array
        // O(log n)



    }


}
