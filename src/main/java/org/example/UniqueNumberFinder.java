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


//        int unique=0;
//        int temp;
//        for(int i=0;i<numArray.length;i++) {
//            for(int j=i+1;j<numArray.length;j++) {
//                if (numArray[i]>numArray[j]) {
//                    temp = numArray[i];
//                    numArray[i] = numArray[j];
//                    numArray[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numArray));
//        for(int i=0; i< numArray.length-1;i=i+2){
//            if(numArray[i] == numArray[i+1])
//                continue;
//            else
//                unique=numArray[i];
//
//        }
//        System.out.println(unique);
    }


}
