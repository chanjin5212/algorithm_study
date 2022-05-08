package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/1874
public class Q1874 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int start = 0;
		for (int i=0; i<n; i++) {
			int value = Integer.parseInt(reader.readLine());
			
			if (value > start) {
				for (int j=start+1; j<=value; j++) {
					stack.push(j);
					sb.append("+").append("\n");
				}
				start = value;				
			} else if (stack.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		
		System.out.println(sb);
	}

}
