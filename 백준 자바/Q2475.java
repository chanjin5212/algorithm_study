package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2475
public class Q2475 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] n = reader.readLine().split(" ");
		
		int sum = 0;
		for (int i=0; i<n.length; i++) {
			sum += Integer.parseInt(n[i]) * Integer.parseInt(n[i]);
		}
		
		System.out.println(sum % 10);
	}

}
