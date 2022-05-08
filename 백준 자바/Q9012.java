package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/9012
public class Q9012 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<t; i++) {
			Stack<String> stack = new Stack<String>();
			String s = reader.readLine();
			for (int j=0; j<s.length(); j++) {
				if (s.charAt(j) == '(') {
					stack.push(String.valueOf(s.charAt(j)));
				} else if (s.charAt(j) == ')') {
					if (stack.size() == 0 || !stack.peek().equals("(")) {
						System.out.println("NO");
						break;
					} else {
						stack.pop();
					}
				}

				if (j == s.length()-1 && stack.size() != 0) {
					System.out.println("NO");
				} else if (j == s.length()-1 && stack.size() == 0) { 
					System.out.println("YES");
				}
			}
			
		}
		
	}

}
