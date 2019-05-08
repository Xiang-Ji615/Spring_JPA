package main.java.spring.helloworld.util;

import java.util.Arrays;

public class MinCoins {

	public static void main(String[] args) {
		int[] coins = {2,5,7};
		int target = 27;
		int[][] dp = new int[coins.length][target+1];
		for(int[] ele : dp){
            Arrays.fill(ele, Integer.MAX_VALUE-1);
        }
		dp[0][0] = 0;
		for(int i=coins[0];i<dp[0].length;i++){
            if(i >= coins[0] && i%coins[0] == 0)
                dp[0][i] = 1 + dp[0][i - coins[0]];
        }
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				if(j >= coins[i])
					dp[i][j] = Math.min(dp[i-1][j], dp[i][j-coins[i]] + 1);
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		
		for(int[] ele : dp){
			System.out.println(Arrays.toString(ele));
		}
		
		System.out.println(dp[dp.length-1][dp[0].length-1]);
	}

}
