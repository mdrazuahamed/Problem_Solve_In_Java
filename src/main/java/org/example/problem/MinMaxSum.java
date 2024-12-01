package org.example.problem;

import java.util.HashMap;
import java.util.Map;

public class MinMaxSum {

    public static void main(String[] args) {
        Integer[]numbers = {1,2,3,4,5};
        MinMaxSum minMaxSum = new MinMaxSum();
        Map<Integer, Integer> minMaxSumResult = minMaxSum.minMaxCalculator(numbers);
        minMaxSumResult.forEach((key, value) -> System.out.println(key + ": " + value));
    }
    public Map<Integer, Integer> minMaxCalculator(Integer[] numbers) {
        Integer sum = 0;
        Integer reference = numbers[1];
        Integer min = 0;
        Integer max = 0;
        Map<Integer, Integer> minMaxSum = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if (numbers[i] > reference)
                max= numbers[i];
            else if (numbers[i]<reference) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min + " max = "+max);
        minMaxSum.put(sum-min,sum-max);
        return minMaxSum;
    }
}
