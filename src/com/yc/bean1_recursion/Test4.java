package com.yc.bean1_recursion;

/**
 * �ж�һ���ַ����Ƿ�Ϊ����
 *
 * @author eden
 */
public class Test4 {

    //	�ж�һ���ַ����Ƿ�Ϊ����
    //	   "c"  => true
    //	  "bb"  => true
    //	 "bcb"  => true
    //	"abcba"  => true
    public static void main(String[] args) {
        System.out.println(isPalindrome("ab"));

        System.out.println(isPalindrome("aba", 0, "aba".length() - 1));
    }

    /**
     * һֱ�ڽ�ȡ�ַ���
     *
     * @param string
     * @return
     */
    private static boolean isPalindrome(String string) {
        if (string.length() <= 1) {
            return true;
        } else if (string.charAt(0) != string.charAt(string.length() - 1)) {
            return false;
        } else {
            String t = string.substring(1, string.length() - 1);     //       String  ->  ����   ->  substring  () ->���ַ���   ->
            return isPalindrome(t);
        }
    }

    /**
     * ͬһ�ַ���
     *
     * @param string
     * @param low
     * @param high
     * @return
     */
    private static boolean isPalindrome(String string, int low, int high) {
        if (high <= low) {
            return true;
        } else if (string.charAt(low) != string.charAt(high)) {
            return false;
        } else {
            return isPalindrome(string, low + 1, high - 1);
        }
    }
}
