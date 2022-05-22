package programmers.p42583;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		
		int d = 100;
		int b = 100;
		int[] c = {10};
		System.out.println(a.solution(d, b, c));
		
	}
	
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int second = 1;
        int truck = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        Deque<Integer> time = new ArrayDeque<Integer>();
        while (true) {
        	if (truck >= truck_weights.length) {
        		break;
        	}
        	
        	if (!queue.isEmpty() && second - time.peek() == bridge_length) {
        		sum -= queue.poll();
        		time.poll();
        	}
        	
        	if (sum + truck_weights[truck] <= weight) {
        		queue.add(truck_weights[truck]);
        		time.add(second);
        		sum += truck_weights[truck];
        		truck++;
        	} 
        	
        	second++;
        }
        
	    second = time.pollLast() + bridge_length;
        
        
        return second;
    }
}