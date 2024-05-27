package datastructures.algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myList = {2, 3, 5, 11, 22};

        System.out.println(binarySearch(myList, 11)); // 3
        System.out.println(binarySearch(myList, 9)); // null
    }

    private static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

}
