package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1003
public class Q1003 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(reader.readLine());
			if (n == 0) {
				System.out.println("1 " + "0");
				continue;
			}
			int[] dp = new int[n+1];
			dp[0] = 0;
			dp[1] = 1;
			for (int j=2; j<n+1; j++) {
				if (j % 2 == 0) {
					dp[j] = dp[j-1] + dp[j-2];
				} else {
					dp[j] = dp[j-1] + dp[j-2];
				}
			}
			System.out.println(dp[n-1] + " " + dp[n]); 
		}
		
		
	}

}
