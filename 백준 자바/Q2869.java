package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2869
public class Q2869 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = reader.readLine().split(" ");
		double a = Integer.parseInt(s[0]);
		double b = Integer.parseInt(s[1]);
		double v = Integer.parseInt(s[2]);
		double c = (v-a) / (a-b);
		System.out.println((int)Math.ceil(c) + 1);
		
		
	}

}
