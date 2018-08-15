package src.string;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/partition-labels/description/
 * <p>
 * A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.
 * <p>
 * Example 1:
 * Input: S = "ababcbacadefegdehijhklij"
 * Output: [9,7,8]
 * Explanation:
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 * Note:
 * <p>
 * S will have length in range [1, 500].
 * S will consist of lowercase letters ('a' to 'z') only.
 */
public class PartitionLabels {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> list = partitionLabels(s);
        System.out.println(list);
    }

    public static List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        List<Integer> list = new ArrayList<Integer>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            end = Math.max(end, last[c - 'a']);
            if (i == end) {
                list.add(end + 1 - start);
                start = i + 1;
            }
        }

        return list;
    }

}
