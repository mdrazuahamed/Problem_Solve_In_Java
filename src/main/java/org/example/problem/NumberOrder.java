package org.example.problem;

import java.util.Arrays;

public class NumberOrder {
    public static void main(String[] args) {
        NumberOrder Order =new NumberOrder();
        int[] orderedArray = Order.getAscendingOrder(new int[]{20,50,30,15});
        System.out.println(Arrays.toString(orderedArray));

        int[] orderedArray1 = Order.getDecendingOrder(new int[]{20,50,30,15});
        System.out.println(Arrays.toString(orderedArray1));
    }
    public int[] getAscendingOrder(int[] array) {
        Integer temp;
        for(int i=0;i<array.length;i++) {
            for (int j =i+1;j<array.length;j++)
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        return array;
    }

    public int[] getDecendingOrder(int[] array) {
        Integer temp;
        for(int i=0;i<array.length;i++) {
            for (int j =i+1;j<array.length;j++)
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        return array;
    }
}
