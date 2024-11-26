package org.example;

public class LargestPrimeFactor {


    public static void main(String[] args) {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        long numberToFindFrom = 40000;
        System.out.println(largestPrimeFactor.findLargestPrimeFactor(numberToFindFrom));
    }
    public long findLargestPrimeFactor(long number) {
        long largestPrimeFactorNumber = 0;
        for(int i = (int)Math.sqrt(number);i>=1;i--) {
            if(number%i==0){
                long factor1=i; long factor2 = number/i;
                if(isPrime(factor1) && isPrime(factor2)) {
                    largestPrimeFactorNumber= Math.max(factor1,factor2);
                    break;
                }
                if(isPrime(factor1)) {
                    largestPrimeFactorNumber = factor1;
                    break;
                }
                if(isPrime(factor2)) {
                    largestPrimeFactorNumber = factor2;
                    break;
                }
            }
        }
        return largestPrimeFactorNumber;
    }


    static boolean isPrime(long number) {
        int flag = 0;
        if(number==0 || number ==1) {
            flag=1;
        }
        for(int i= 2;i<=number/2;i++) {
            if(number%i==0) {
                flag = 1;
                break;
            }
        }
        if(flag==0)
            return true;
        else return false;
    }
}
