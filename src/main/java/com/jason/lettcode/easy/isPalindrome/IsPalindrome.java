package com.jason.lettcode.easy.isPalindrome;
/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 *
 * https://leetcode-cn.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (56.08%)
 * Total Accepted:    89.8K
 * Total Submissions: 160.2K
 * Testcase Example:  '121'
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 
 * 示例 1:
 * 
 * 输入: 121
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 
 * 
 * 示例 3:
 * 
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 
 * 
 * 进阶:
 * 
 * 你能不将整数转为字符串来解决这个问题吗？
 * 
 */
public class IsPalindrome {

    public boolean isPalindrome(int x) {
     if(x < 0){
        return false;
     }
     //0是回文数
     if(x == 0){
         return true;
     }
     //0结尾
     if(x % 10 == 0){
         return false;
     } 
     int tmp = 0;
     //保存输入的数据
     int inputX = x;
     while(x != 0 ){
         tmp = tmp * 10 +  x % 10;
         x  = x /10;
     }
     return inputX == tmp;
    }

    public static void main(String[] args) {

        IsPalindrome isPalindrome = new IsPalindrome();
        System.out.println(isPalindrome.isPalindrome(121));
    }
    
}
