package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/8958
public class Q8958 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<n; i++) {
			int sum = 0;
			int count = 0;
			String o = reader.readLine();
			for (int j=0; j<o.length(); j++) {
				if (o.charAt(j) == 'O') {
					count++;
					sum += count;
				} else if (o.charAt(j) == 'X') {
					count = 0;
				}
			}
			System.out.println(sum);
		}
	}
}
