package programmers.p64061;

import java.util.ArrayList;
import java.util.Stack;

class Solution {

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        ArrayList<Stack<Integer>> list = new ArrayList<Stack<Integer>>();
        for (int i=0; i<board[0].length; i++) {
        	Stack<Integer> stack = new Stack<Integer>();
        	for (int j=board.length-1; j>=0; j--) {
        		if (board[j][i] != 0) {
        			stack.push(board[j][i]);        			
        		}
        	}
        	list.add(stack);
    	}
        Stack<Integer> moveDelete = new Stack<Integer>();

        for (int i=0; i<moves.length; i++) {
        	if (!moveDelete.isEmpty() && !list.get(moves[i]-1).isEmpty() && moveDelete.peek() == list.get(moves[i]-1).peek()) {
        		list.get(moves[i]-1).pop();
        		moveDelete.pop();
        		answer += 2;
        	} else {
        		if (!list.get(moves[i]-1).isEmpty()) {
        			int a = list.get(moves[i]-1).pop();
        			moveDelete.push(a);
        		}        		
        	}
        	
        }
       
  
        return answer;
    }
}