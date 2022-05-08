package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1436
public class Q1436 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		int count = 1;
		int a = 666;
		while (count < n) {
			
			if (String.valueOf(++a).contains("666")) {
				count++;
			}
		}
		
		System.out.println(a);
	}

}
