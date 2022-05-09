package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1978
public class Q1978 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		String[] num = reader.readLine().split(" ");
		
		int count = 0;
		for (int i=0; i<n; i++) {
			if (number(Integer.parseInt(num[i]))) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	public static boolean number(int a) {
		if (a == 1) {
			return false;
		} else {
			for (int i=2; i<a; i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
