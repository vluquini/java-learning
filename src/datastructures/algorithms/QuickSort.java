package datastructures.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(quickSort(Arrays.asList(10, 1, 8, 15, 13,5, 2, 3)));
    }

    public static List<Integer> quickSort(List<Integer> list){
        // base case
        if (list.size() < 2)
            return list;
        // recursive case
        int mid = list.size() / 2;
        Integer pivot = list.get(mid);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i == mid) continue; // skip the pivot element
            // add element to the corresponding list
            if (list.get(i) <= pivot) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        // recursively sort the left and right lists
        List<Integer> sortedLeft = quickSort(left);
        List<Integer> sortedRight = quickSort(right);
        // combine the sorted lists
        List<Integer> sorted = new ArrayList<>(sortedLeft);
        sorted.add(pivot);
        sorted.addAll(sortedRight);

        return sorted;
    }
}
