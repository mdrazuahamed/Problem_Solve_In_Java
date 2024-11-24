package org.example;
public class EvenFibonacciSum {
    public static void main(String[] args) {
        EvenFibonacciSum evenFibonacciSum = new EvenFibonacciSum();
        System.out.println(evenFibonacciSum.evenFibonacciSumCalculator((long)40));
    }

    public Long evenFibonacciSumCalculator(Long limit) {
        long evenFibonacci1=0, evenFibonacci2=2;
        long sum = evenFibonacci1 + evenFibonacci2;
        while(evenFibonacci2<=limit) {
            long evenFebonacci3 = 4*evenFibonacci2 + evenFibonacci1;
            if(evenFebonacci3>limit)
                break;
            evenFibonacci1 = evenFibonacci2;
            evenFibonacci2 =evenFebonacci3;
            sum +=evenFibonacci2;
        }
        return sum;
    }
}
