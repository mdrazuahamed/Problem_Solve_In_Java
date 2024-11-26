package org.example;

import java.util.Arrays;

public class MaxNumberFinder {

    public static void main(String[] args) {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
        System.out.println("First max number = "+maxNumberFinder.findFirstMaxNumber(new Integer[]{8,10,3,20}));
        System.out.println("Second max number = "+maxNumberFinder.findSecondMaxNumber(new Integer[]{8,10,3,20}));
        System.out.println("Second max number = "+maxNumberFinder.findSecondMaximumWayTwo(new Integer[]{8,10,3,20}));

    }
    public Integer findFirstMaxNumber(Integer[] array) {
        Integer max=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public Integer findSecondMaxNumber(Integer[] array) {
        Integer temp;
        for(int i=0;i<array.length;i++) {
            for (int j =i+1;j<array.length;j++)
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        return array[1];
    }

    public Integer findSecondMaximumWayTwo(Integer [] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return array[array.length-2];

    }
}
