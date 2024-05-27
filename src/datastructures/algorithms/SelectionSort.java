package datastructures.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(8, 9, 5, 2, 10));
        System.out.println(selectionSort(arr)); // output: [2, 5, 8, 9, 10]
    }

    public static List<Integer> selectionSort(List<Integer> list) {
        int loop = list.size();

        List<Integer> sortedArr = new ArrayList<>();
        for (int i = 0; i < loop; i++){
            int smaller = lowestIndex(list);
            sortedArr.add(list.get(smaller));
            list.remove(smaller);
        }
        return sortedArr;
    }

    public static int lowestIndex(List<Integer> list) {
        int lowest = list.get(0);
        int lowestIndex = 0;

        for (int i = 1; i < list.size(); i++){
            if(list.get(i) < lowest){
                lowest = list.get(i);
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
}
