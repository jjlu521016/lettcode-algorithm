package com.jason.lettcode.easy.isPalindrome;

/**
 * 判断字符串是否为回文
 * 输入： abcba
 * 输出：true
 */
public class IsPalindromeForChar {
    /**
     * 将字符串从中间分开，从字符串的首尾比较，有一个不同的就返回false。
     * @param text
     * @return
     */
    public boolean isPalindrome(String text) {
        if (text.length() == 0) {
            return false;
        }
        if (text.length() == 1) {
            return true;
        }
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if(text.toCharArray()[i] != text.toCharArray()[length -i -1] ){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        IsPalindromeForChar isPalindrome = new IsPalindromeForChar();
        System.out.println(isPalindrome.isPalindrome("abca"));
    }
}
