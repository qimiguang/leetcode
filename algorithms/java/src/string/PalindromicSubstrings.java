package src.string;

/**
 * https://leetcode.com/problems/palindromic-substrings/description/
 * <p>
 * 647. Palindromic Substrings
 * <p>
 * Difficulty:Medium
 * <p>
 * Given a string, your task is to count how many palindromic substrings in this string.
 * <p>
 * The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
 * <p>
 * Example 1:
 * Input: "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2:
 * Input: "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 * Note:
 * The input string length won't exceed 1000
 */
// 左右对称就是回文字符串，如: noon(两个字符中心), level(一个字符中心) 等
// 本题是找出一个字符串中有多个 substring 是回文的
public class PalindromicSubstrings {

    public int countSubstrings(String S) {
        int N = S.length();
        int count = 0;
        for (int center = 0; center <= 2 * N - 1; ++center) {
            int left = center / 2;
            int right = left + center % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        return count;
    }

    public int countSubstrings2(String s) {
        if (s == null || s.length() == 0) return 0;

        int count = 0;
        for (int i = 0; i < s.length(); i++) { // i is the mid point
            // odd length;
            count += extendPalindrome(s, i, i);
            // even length
            count += extendPalindrome(s, i, i + 1);
        }

        return count;
    }

    private int extendPalindrome(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    // 判断一个 string 是否是回文的
    public static boolean check(String str) {
        if (null == str || "".equals(str)) {
            return false;
        }
        int i = 0;
        int j = str.length() - 1;
        String[] strings = str.split("");
        for (; i <= j; i++, j--) {
            if (!strings[i].equals(strings[j])) {
                return false;
            }
        }
        return true;
    }

}
