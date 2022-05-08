package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/4949
public class Q4949 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			Stack<String> stack = new Stack<String>();
			String s = reader.readLine();
			if (s.charAt(0) == '.') {
				break;
			}
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) == '.' && stack.size() == 0) {
					System.out.println("yes");
					break;
				} else if (s.charAt(i) == '[' || s.charAt(i) == '(') {
					stack.push(String.valueOf(s.charAt(i)));
				} else if (s.charAt(i) == ')') {
					if (stack.size() == 0 || !stack.peek().equals("(")) {
						System.out.println("no");
						break;
					} else {
						stack.pop(); 
					}
				} else if (s.charAt(i) == ']') {
					if (stack.size() == 0 || !stack.peek().equals("[")) {
						System.out.println("no");
						break;
					} else {
						stack.pop();
					}
					
				} else if (s.charAt(i) == '.' && stack.size() != 0) {
					System.out.println("no");
					break;
				}
			}
			
		}
		
	}

}
