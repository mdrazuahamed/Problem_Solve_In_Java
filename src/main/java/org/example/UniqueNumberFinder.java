package org.example;

import java.util.Arrays;

public class UniqueNumberFinder {
    public static void main(String[] args) {
        int[] numArray = {1,2,3,3,2,1,6};
        int[] uniqueIndex={0,0,0,0,0,0,0};
        for(int i=0;i<numArray.length;i++) {
             for(int j=0;j<numArray.length;j++) {
                 if (i==j) {
                     continue;
                 }
                 if(numArray[i]==numArray[j])
                     uniqueIndex[i]=1;
             }
        }
        for(int i=0;i<uniqueIndex.length;i++) {
            if(uniqueIndex[i]==0) {
                System.out.println("unique number is " + numArray[i]);
            }
        }
    }


}
