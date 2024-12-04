package org.example.problem;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int value = binarySearch.binarySearchValue(new int[]{30,40,60,20,70},21);
        System.out.println(value);
    }
    public int binarySearchValue(int[] values, int searchValue) {
        NumberOrder numberOrder = new NumberOrder();
        int[] array = numberOrder.getAscendingOrder(values);
        System.out.println(Arrays.toString(array));
        int left=0, mid=0;
        int right = array.length-1;
        System.out.println(right);

        while(left<=right) {
            mid = (left+right)/2;
            if(searchValue==array[mid]) {
                return array[mid];
            }
            else if(searchValue>array[mid]) {
                left = mid +1;
            }
            else
                right = mid-1;

        }
        return -1;

    }
}
