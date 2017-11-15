# ScalaClub
PROBLEM 3 :
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    Example:
    Given nums = [2, 7, 11, 15], target = 9,

    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
    
    
PROBLEM 4 :(Will be Going Dynamic now on words)

General math concept of Binomial Coefficient 
1) A binomial coefficient C(n, k) can be defined as the coefficient of X^k in the expansion of (1 + X)^n.

2) A binomial coefficient C(n, k) also gives the number of ways, disregarding order, that k objects can be chosen from 
among n objects; more formally, the number of k-element subsets (or k-combinations) of an n-element set.

For referral study : https://en.wikipedia.org/wiki/Binomial_coefficient
Focus on how the pascal triangle is created 

    Write a function that takes two parameters n and k and returns the value of Binomial Coefficient C(n, k). 
    For example, your function should return 6 for n = 4 and k = 2, and it should return 10 for n = 5 and k = 2.
    
    
PROBLEM 5 : LONGEST COMMON SUBSEQUENCE

LCS Problem Statement: Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”. So a string of length n has 2^n different possible subsequences.

    Examples:
    LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
    LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
    
    # Note  :  Restricted to solve dynamically.
    
PROBLEM 6 : Longest Palindrome String

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

   Example:

    Input: "babad"

    Output: "bab"

    Note: "aba" is also a valid answer.

Example:

    Input: "cbbd"

    Output: "bb"
