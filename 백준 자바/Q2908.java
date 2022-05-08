package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2908
public class Q2908 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] num = reader.readLine().split(" ");
		int a = (num[0].charAt(2) - '0') * 100 + (num[0].charAt(1) - '0') * 10 + (num[0].charAt(0) - '0');
		int b = (num[1].charAt(2) - '0') * 100 + (num[1].charAt(1) - '0') * 10 + (num[1].charAt(0) - '0');
		
		if (a > b) {
			System.out.println(a);
		} else if (b > a) {
			System.out.println(b);
		}
		
	}

}
