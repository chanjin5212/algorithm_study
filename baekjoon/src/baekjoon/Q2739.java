package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2739
public class Q2739 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		
		for (int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n * i);
		}
		
	}

}
