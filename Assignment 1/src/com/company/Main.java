package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "abaa";
        String t = "baaa";
        String x = "sdfaa";

        // test for Question 1
        System.out.println(isPalindrome(s));

        // test for Question 2
        System.out.println(isUnique(s));

        // test for Question 3
        System.out.println(isUnique(x));

        // test for Question 4
        System.out.println(isAnagram(s, t));

        // test for Question 5
        System.out.println(isLeap(2009));

        // test for Question 6
        System.out.println(phoneBill(150));

        // test for Question 7
        System.out.println(canConstruct("ab","aab"));

        // test for Question 8
        System.out.println(gradeMeaning("A"));

        // test for Question 9
        book aBook = new book("Harry Potter", 03034, "Fantasy Fiction", 34.56);
        System.out.println(aBook.getName() + " " + aBook.getBookId() + " " + aBook.getGenre() + " " + aBook.getPrice());

        // test for Question 10
        Box aBox = new Box(10.5, 10, 10);
        System.out.println(aBox.calcVolume());

    }

    // Question 1 - return true if palindrome
    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        return true;
    }

    // Question 2 - return true if contains duplicate
    public static boolean isUnique(String s){
        HashSet<Character> set = new HashSet<>();
        for (int i = 0, j = s.length() - 1; i < j; i++){
            set.add(s.charAt(i));
        }
        if (set.size() == s.length()){
            return false;
        } else{
            return true;
        }
    }

    // Question 3 - same as Question 2

    // Question 4 - return true if are anagrams
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    // Question 5 - return true if leap year
    public static boolean isLeap(int x){
        if (x % 100 == 0){
            if (x % 400 == 0){
                return true;
            }else{
                return false;
            }
        }else{
            if (x % 4 == 0){
                return true;
            }else{
                return false;
            }
        }
    }

    // Question 6 - calculate monthly telephone bill
    public static float phoneBill(int calls){
        float total = 0;
        int switchNum = 0;
        if (calls <= 100){
            switchNum = 0;
        } else if (calls > 100 && calls <= 150) {
            switchNum = 1;
        } else if (calls > 150 && calls <= 200) {
            switchNum = 2;
        } else {
            switchNum = 3;
        }

        switch (switchNum){
            case 0:
                total = 200;
                break;
            case 1:
                total = 200 + (calls - 100) * 0.6f;
                break;
            case 2:
                total = 200 + 50 * 0.6f + (calls - 150) * 0.5f;
                break;
            case 3:
                total = 200 + 50 * 0.6f + 50 * 0.5f + (calls - 200) * 0.4f;
                break;
        }
        return total;
    }

    // Question 7 - return true if ransomNote can be constructed from magazine
    public static boolean canConstruct(String ransomNote, String magazine) {
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c);
            if (index == -1) {
                return false;
            }
            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }
        return true;
    }

    // Question 8 - return meaning of a grade
    public static String gradeMeaning(String grade){
        if (grade == "A"){
            return "Excellent";
        } else if (grade == "B"){
            return "Good";
        } else if (grade == "C"){
            return "Average";
        } else if (grade == "D"){
            return "Deficient";
        } else{
            return "Failing";
        }
    }
}


























