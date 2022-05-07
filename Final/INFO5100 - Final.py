#!/usr/bin/env python
# coding: utf-8


# Question1: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
# An input string is valid if:
# Open brackets must be closed by the same type of brackets.
# Open brackets must be closed in the correct order.


def is_valid(str):
    stack = []
    for s in str:
        if s == "(" or s == "[" or s == "{":
            stack.append(s)
        elif len(stack) == 0:
            return False
        elif s == ")" and stack[-1] == "(" or s == "]" and stack[-1] == "[" or s == "}" and stack[-1] == "{":
            stack.pop()

    return len(stack) == 0  

test = is_valid("")
print(test)


# Question2: String Compression: Implement a method to perform basic string compression using the counts of 
# repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string 
# would not become smaller than the original string, your method should return the original string. You can 
# assume the string has only uppercase and lowercase letters (a - z).



def str_comp(s):
    cnt = 1
    res = []
    for i in range(len(s)):
        if i == 0:
            res.append(s[i])
            res.append(str(cnt)) 
        if i > 0 and s[i] == s[i - 1]:
            cnt += 1 
            res.pop()
            res.append(str(cnt))
        if i > 0 and s[i] != s[i - 1]:
            cnt = 1 
            res.append(s[i])
            res.append(str(cnt))
    
    res = "".join(res)
    return res if len(res) < len(s) else s 

test = str_comp("aaabcccccaaa")
print(test)



# Question 3: Given a string s, find the length of the longest substring without repeating characters.
# s = "bbbbb" output = 3
# s = "pwwkew" output = 1



def longest_substring(string):
    if not string:
        return 0
        
    total = 0 
    left = 0 
    num_map = dict()
    for right in range(len(string)):
        if string[right] in num_map:
            left = num_map[string[right]] + 1
        num_map[string[right]] = right
        total = max(total, right - left + 1)  

    return total 

test = longest_substring("bbbbb")
print(test)


# Question 4: Given an integer n, return any array containing n unique integers such that they add up to 0.


def sum_to_zero(n):
    res = []
    pairs = n // 2  
    for i in range(1, pairs + 1):
        res.append(i)
        res.append(-i)
    if n % 2 != 0:
        res.append(0)
    
    return res 

test = sum_to_zero(3)
print(test)


# Question 5: Given an integer array nums and an integer k, return the kth largest element in the array.


def find_kth_largest(nums, k):
    nums.sort()
    return nums[len(nums) - k]

test = find_kth_largest([3,2,3,1,2,4,5,5,6], 4)
print(test)

