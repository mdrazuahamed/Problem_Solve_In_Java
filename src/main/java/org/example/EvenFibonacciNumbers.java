package org.example;


public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int i = 2;
        int number;
        int temp=1;
        int sum=0;
        while(i>1){
            if(i<=temp){
                continue;
            }
            temp = i+temp;
            sum = sum+temp;
            i++;
            if(sum>=4000000)
                break;
        }
        System.out.println("sum="+sum+"number"+i);
    }
}
