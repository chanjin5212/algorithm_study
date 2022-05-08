package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/10773
public class Q10773 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(reader.readLine());
		
		Stack<Integer> num = new Stack<Integer>();
		
		for (int i=0; i<k; i++) {
			int n = Integer.parseInt(reader.readLine());
			if (n == 0) {
				num.pop();
			} else {
				num.push(n);
			}
		}
		int sum = 0;
		for (int i=0; i<num.size(); i++) {
			sum += num.get(i);
		}
		System.out.println(sum);
	}

}
