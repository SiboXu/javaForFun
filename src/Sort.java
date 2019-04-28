public class Sort {

    // Find the smallest value first.
    private static int findTheSmallest(int[] input, int start){
        int smallest = input[start];
        int smallestIndex = start;
        for (int n = start; n< input.length; n++) {
            if (input[n] < smallest) {
                smallestIndex = n;
                n += 1;
            }
        }
        return smallestIndex;
    }

    // Swap the smallest value with the first value of the list.
    private static void swap(int[] input, int start, int smallestIndex){
        int temp = input[start];
        input[start] = input[smallestIndex];
        input[smallestIndex] = temp;
    }

    //This is the first try of sorting.
    public static void sortNew(int[] x, int start) {
        //System.out.println(findTheSmallest(x));
        if (start < x.length) {
            int small = findTheSmallest(x, start);
            swap(x, start, small);
            sortNew(x, start + 1);
        }
    }

    //This part is to get the recursion.
    // New we start from the index of 0, and continue by plus 1.
    public static void realSort(int[] x){
        sortNew(x, 0);
        }
    }

