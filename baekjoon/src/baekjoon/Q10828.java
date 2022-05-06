package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/10828
public class Q10828 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i=0; i<n; i++) {
			String[] s = reader.readLine().split(" ");
			if (s[0].equals("push")) {
				stack.push(Integer.parseInt(s[1]));
			} else if (s[0].equals("pop")) {
				if (stack.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(stack.pop());
				}
			} else if (s[0].equals("size")) {
				System.out.println(stack.size());
			} else if (s[0].equals("empty")) {
				if (stack.empty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				
			} else if (s[0].equals("top")) {
				if (stack.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
				
			}
		}
		
	}

}
