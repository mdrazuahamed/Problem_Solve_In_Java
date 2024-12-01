package org.example.problem;

import java.util.concurrent.ForkJoinWorkerThread;

public class Reverse {
    public Integer getReverseNumber(Integer number) {
        Integer reverse =0;
        while (number !=0) {
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        return reverse;
    }

    public String getReverseString(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse().toString();
    }

}
