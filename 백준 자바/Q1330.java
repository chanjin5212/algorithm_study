package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1330
public class Q1330 {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		String[] str1 = str.split(" ");
		if (Integer.parseInt(str1[0]) > Integer.parseInt(str1[1])) {
			System.out.println(">");
		} else if (Integer.parseInt(str1[0]) < Integer.parseInt(str1[1])) {
			System.out.println("<");
		} else if (Integer.parseInt(str1[0]) == Integer.parseInt(str1[1])) {
			System.out.println("==");
		}
	}

}
