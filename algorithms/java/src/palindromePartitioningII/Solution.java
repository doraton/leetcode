package palindromePartitioningII;

import java.util.Arrays;

/*
132
 */
public class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        char[] charArray = s.toCharArray();
        for (int right = 0; right < n; right++) {
            for (int left = 0; left <= right; left++) {
                if (charArray[left] == charArray[right] && ((right-left <= 2) || isPalindrome[left+1][right-1])) {
                    isPalindrome[left][right] = true;
                }
            }
        }
        int[] dp = new int[n];
        Arrays.fill(dp,n);
        for (int i = 0; i < n; i++) {
            if (isPalindrome[0][i]) {
                dp[i] = 0;
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (isPalindrome[j+1][i]) {
                    dp[i] = Math.min(dp[i],dp[j]+1);
                }
            }
        }
        return dp[n-1];
    }
}
