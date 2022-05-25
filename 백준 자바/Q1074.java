package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1074
public class Q1074 {
	
	
	private static int result = 0;
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int n = (int)Math.pow(2, Integer.parseInt(str[0]));
		int r = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		z(n, r, c);
		System.out.println(result);
		
	}
	private static void z(int size, int r, int c) {
		
		if (size == 1) {
			return;
		}
		
		if(r < size/2 && c < size/2) {
			z(size/2, r, c);
		}
		else if(r < size/2 && c >= size/2) {
			result += size * size / 4;
			z(size/2, r, c - size/2);
		}
		else if(r >= size/2 && c < size/2) {
			result += (size * size / 4) * 2;
			z(size/2, r - size/2, c);
		}
		else {
			result += (size * size / 4) * 3;
			z(size/2, r - size/2, c - size/2);
		}
	}

}
