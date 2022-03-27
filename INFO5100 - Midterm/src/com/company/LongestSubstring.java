package com.company;

import java.util.HashMap;

public class LongestSubstring {

    public int res = 0;
    public int left = 0;
    public HashMap<String, Integer> numMap;
    public int findLongestSubtring(String s){
        for (int right = 0; right < s.length(); right++){
            if (right == 0){
                res = 1;
                numMap.put(String.valueOf(s.charAt(right)), right);
                continue;
            }
            // Below bug I'm now sure how to fix. I'm a python programmer. Wanted to check if s.indexOf(right) is in s.substring(left, right - 1)
            if (s.substring(left, right - 1).contains(String.valueOf(s.charAt(right)))){
                numMap.put(String.valueOf(s.charAt(right)), right);
            } else {
                left = numMap.get(String.valueOf(s.charAt(right))) + 1;
                numMap.put(String.valueOf(s.charAt(right)), right);
            }

            if (right - left + 1 > res) res = right - left + 1;
        }
        return res;
    }

}
