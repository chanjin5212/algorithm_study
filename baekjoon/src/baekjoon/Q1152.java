package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

////https://www.acmicpc.net/problem/1152
public class Q1152 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		
		String[] str1 = str.trim().split(" ");
		System.out.println(str1.length);
	}

}
