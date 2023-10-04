package application;

import algorithms.BinarySearch;

public class Program {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 11, 12};

        System.out.println(BinarySearch.binarySearch(arr, 3));
    }
}
