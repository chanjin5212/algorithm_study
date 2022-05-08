package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2839
public class Q2839 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		
		int count = 0;
		while (true) {
			if (n % 5 == 0 && n > 0) {
				System.out.println((n / 5) + count);
				break;
			} else if (n == 0) {
				System.out.println(count);
				break;
			} else if (n < 0) {
				System.out.println(-1);
				break;
			}
			n -= 3;
			count++;
		}
		
		
	}

}
