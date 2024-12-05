package org.example.problem;

import java.util.Arrays;
import java.util.List;

public class IndexCount {
    public static List<Integer> countingSort(List<Integer> arr) {
        // Create a frequency array of size 100
        Integer[] frequency = new Integer[100];
        Arrays.fill(frequency, 0);

        // Count occurrences of each number in arr
        for (int num : arr) {
            frequency[num]++;
        }

        // Convert the frequency array to a List and return
        return Arrays.asList(frequency);
    }
}
