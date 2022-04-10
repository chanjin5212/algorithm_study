package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2439
public class Q2439 {
	
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		for (int i=0; i<n; i++) {
			for (int j=i; j<n-1; j++) {
				System.out.print(" ");
			}
			for (int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
