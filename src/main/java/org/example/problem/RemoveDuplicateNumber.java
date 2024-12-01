package org.example.problem;

import java.util.*;

public class RemoveDuplicateNumber {
    public static void main(String[] args) {
        RemoveDuplicateNumber removeDuplicateNumber = new RemoveDuplicateNumber();
        Integer[] outputArray = removeDuplicateNumber.removeDuplicateNumberFromArray(new Integer[]{10,1,1,2,3,8,5,6,6,9,9,10});
        System.out.println(Arrays.toString(outputArray));
        removeDuplicateNumber.removeDuplicateNumberFromArrayByHashSet(new Integer[]{2,5,5,15,16,16,18});
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
        System.out.println(Arrays.toString(array));
        Integer[] newArray = new Integer[array.length];
        for(int i=0; i<array.length-1; i++) {
            if(array[i] != array[i+1]){
                array[j]= array[i+1];
                j++;
            }
            array[0]=array[0];
        }
    return array;
    }

    public void removeDuplicateNumberFromArrayByHashMap(Integer[] array){
        Map<Integer, Integer> values = new HashMap<>();
        for(int i=0; i<array.length;i++) {
            if (values.containsKey(array[i])) {
                values.put(array[i],values.get(array[i])+1);
            }
            else values.put(array[i],1);
        }
        values.forEach((key,value)-> System.out.println(key));
    }

    public void removeDuplicateNumberFromArrayByHashSet(Integer[] array) {
        Set<Integer> values = new HashSet<>();
        for(Integer i=0; i<array.length; i++) {
            values.add(array[i]);
        }
        values.forEach(element-> System.out.println(element));
    }
}
