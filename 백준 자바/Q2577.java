package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2577
public class Q2577 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(reader.readLine());
		int b = Integer.parseInt(reader.readLine());
		int c = Integer.parseInt(reader.readLine());
		
		String d = Integer.toString(a * b * c);
		
		int[] count = new int[10];
		
		for (int i=0; i<d.length(); i++) {
			count[d.charAt(i) - '0']++;
		}
		for (int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
