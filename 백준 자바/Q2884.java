package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2884
public class Q2884 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] h = reader.readLine().split(" ");
		int a = Integer.parseInt(h[0]);
		int b = Integer.parseInt(h[1]);
		
		if (b - 45 < 0) {
			a--;
			b = b + 60 - 45;
		} else if (b - 45 >= 0) {
			b = b - 45;
		}
		
		if (a < 0) {
			a = 23;
		}
		System.out.printf("%d %d\n", a, b);
	}

}
