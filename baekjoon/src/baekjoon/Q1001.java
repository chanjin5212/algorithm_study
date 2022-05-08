package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1001
public class Q1001 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		String[] str1 = str.split(" ");
		int a = Integer.parseInt(str1[0]);
		int b = Integer.parseInt(str1[1]);
		System.out.println(a - b);
		
	}

}
