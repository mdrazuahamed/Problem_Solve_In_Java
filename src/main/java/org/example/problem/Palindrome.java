package org.example.problem;

public class Palindrome {
    static Reverse reverseNumber = new Reverse();
    public void isPalindromeNumber(Integer number) {
        if(number== reverseNumber.getReverseNumber(number)) {
            System.out.println("It is a palindrome Number");
        }
        else
            System.out.println("It is not aPalindrome number");
    }
    public void isPalindromeString(String string) {
        if(string.equals(reverseNumber.getReverseString(string))) {
            System.out.println("It is a palindrome");
        }
        else
            System.out.println("It is not a Palindrome");
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.isPalindromeNumber(121);
        palindrome.isPalindromeString("aba");
    }
}
