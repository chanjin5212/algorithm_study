package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1008
public class Q1008 {
	
	public static void main(String[] args) throws IOException {
		
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		String[] str1 = str.split(" ");
		double a = (double)Integer.parseInt(str1[0]);
		double b = (double)Integer.parseInt(str1[1]);
		System.out.println(a / b);
		
	}

}
