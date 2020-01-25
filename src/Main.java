public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        int[] sortedArray = { -22, -15, 1, 7, 20, 35, 55};

        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, -22));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, -15));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, 1));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, 7));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, 20));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, 35));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, 55));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, 99));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, 0));
        System.out.println(binarySearchRecursion(sortedArray, 0, sortedArray.length, -33));
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
        // Array must be sorted
        // Divide and conquer: selects the element in the middle of the array and compares it against the searched value
        // if element == searchedValue -> return index
        // element > searchedValue -> search the left half of the array
        // element < searchedValue -> search the right half of the array
        // O(log n)

        int start = 0;
        int end = intArray.length;

        while (start < end){
            int midpoint = (start + end) / 2;

            // value at midpoint matches searchedValue
            if (intArray[midpoint] == searchedValue){
                return midpoint;

            // value at midpoint is greater than the searched value (must now search left half of the array)
            } else if (intArray[midpoint] > searchedValue){
                end = midpoint;

            // value at midpoint is less than the searched value (must now search right half of the array)
            } else {
                start = midpoint + 1;
            }
        }
        return -1; // value not found
    }

    public static int binarySearchRecursion(int[] intArray, int start, int end, int searchedValue){
        int midpoint = (start + end) / 2;

        if (start == end){
            return -1;
        }

        if (intArray[midpoint] == searchedValue){
            return midpoint;

        } else if (intArray[midpoint] > searchedValue){
            return binarySearchRecursion(intArray, start, midpoint, searchedValue);

        } else {
            return binarySearchRecursion(intArray, midpoint + 1, end, searchedValue);
        }
    }
}

