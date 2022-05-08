package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

////https://www.acmicpc.net/problem/1157
public class Q1157 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String str = reader.readLine();
		str = str.toUpperCase();
		
		int[] count = new int[26];
		
		for (int i=0; i<str.length(); i++) {
			count[str.charAt(i) - 'A']++;
		}
		int max = -1;
		char c = '?';
		for (int i=0; i<count.length; i++) {
			if (count[i] > max) {
				max = count[i];
				c = (char)(i + (int)'A');
			} else if (count[i] == max) {
				c = '?';
			}
		}
		System.out.println(c);
	}

}
