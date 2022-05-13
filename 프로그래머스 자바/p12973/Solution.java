package programmers.p12973;

import java.util.Stack;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		String s = "cdcd";
		System.out.println(a.solution(s));
		
	}
    public int solution(String s) {
        int answer = 0;
        Stack<String> stack = new Stack<String>();
        for (int i=0; i<s.length(); i++) {
        	if (!stack.isEmpty() && stack.peek().equals(String.valueOf(s.charAt(i)))) {
        		stack.pop();
        	} else {
        		stack.push(String.valueOf(s.charAt(i)));
        	}
        }
        
        if (stack.size() == 0) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        
        return answer;
    }
}