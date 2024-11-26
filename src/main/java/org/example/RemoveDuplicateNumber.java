package org.example;

import java.util.Arrays;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        RemoveDuplicateNumber removeDuplicateNumber = new RemoveDuplicateNumber();
        Integer[] outputArray = removeDuplicateNumber.removeDuplicateNumberFromArray(new Integer[]{1,1,2,3,8,5,6,6,9,9,10});
        System.out.println(Arrays.toString(outputArray));
    }
    public Integer[] removeDuplicateNumberFromArray(Integer[] array) {
        Integer temp;
        for(int i=0;i<array.length;i++) {
            for (int j =i+1;j<array.length;j++)
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        int j=1;
        Integer[] newArray = new Integer[array.length];
        for(int i=0; i<array.length-1; i++) {
            if(array[i] != array[i+1]){
                newArray[j]= array[i+1];
                j++;
            }
            newArray[0]=array[0];
        }
    return newArray;
    }
}
