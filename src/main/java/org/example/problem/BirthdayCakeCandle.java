package org.example.problem;

import java.util.Arrays;

public class BirthdayCakeCandle {
    public static void main(String[] args) {
        BirthdayCakeCandle birthdayCakeCandle = new BirthdayCakeCandle();
        birthdayCakeCandle.countTallest(new int[]{70,20,50,50,50});
    }
    public void countTallest(int[] array) {
        NumberOrder numberOrder = new NumberOrder();
        int[] sortedarray = numberOrder.getDecendingOrder(array);
        int count = 1;
        System.out.println(Arrays.toString(sortedarray));
        for(int i=0; i<sortedarray.length;i++) {
            if(sortedarray[i]==sortedarray[i+1])
                count++;
            else break;
        }
        System.out.println(count);
    }
}
