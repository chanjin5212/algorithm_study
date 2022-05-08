package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2231
public class Q2231 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		int result = 0;
		for (int i=0; i<n; i++) {
			String s = i + "";
			int sum = 0;
			sum += i;
			for (int j=0; j<s.length(); j++) {
				sum += s.charAt(j) - '0';
				
				
			}
			if (sum == n) {
				result = i;
				break;
			}
			
		}
		System.out.println(result);
		
	}

}
