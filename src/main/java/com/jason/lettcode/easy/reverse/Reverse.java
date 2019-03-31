package com.jason.lettcode.easy.reverse;

/**
 * @author jason
 */ /*
     * @lc app=leetcode.cn id=7 lang=java
     *
     * [7] 整数反转
     *
     * https://leetcode-cn.com/problems/reverse-integer/description/
     *
     * algorithms Easy (32.20%) Total Accepted: 103.3K Total Submissions: 320.9K
     * Testcase Example: '123'
     *
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     *
     * 示例 1:
     *
     * 输入: 123 输出: 321
     *
     *
     * 示例 2:
     *
     * 输入: -123 输出: -321
     *
     *
     * 示例 3:
     *
     * 输入: 120 输出: 21
     *
     *
     * 注意:
     *
     * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     *
     */
public class Reverse {
    public int reverse(int x) {
        long temp = 0;
        while (x != 0) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }
        if (Integer.MIN_VALUE <= temp && temp <= Integer.MAX_VALUE) {
            return (int)temp;
        }
        return 0;
    }

    public static void main(String[] args) {
        Reverse reverse = new Reverse();

        System.out.println(reverse.reverse(123340));
    }
}
