package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2438
public class Q2438 {
	
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<n; i++) {
			for (int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
