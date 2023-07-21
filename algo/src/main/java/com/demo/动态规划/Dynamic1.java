package com.demo.动态规划;

import java.util.Arrays;

public class Dynamic1 {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(sequenceSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    // 爬楼梯解法
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }

    // 最大子序和 [-2,1,-3,4,-1,2,1,-5,4] 输出 6
    public static int sequenceSum(int[] nums){
        int max = 0;
        if (nums.length == 0) {
            return max;
        }
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                dp[i] = nums[i];
            }else {
                dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }


}
