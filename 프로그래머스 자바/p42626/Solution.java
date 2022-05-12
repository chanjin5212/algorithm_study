package programmers.p42626;

import java.util.PriorityQueue;

class Solution {
	
    public int solution(int[] scoville, int K) {
        
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i=0; i<scoville.length; i++) {
        	queue.add(scoville[i]);
        }
        int count = 0;
        while (queue.peek() < K) {
        	if (queue.size() == 1) {
        		break;
        	} else {
        		int a = queue.poll();
        		int b = queue.poll();
        		int c = a + (b*2);
        		queue.add(c);
        		count++;
        	}
        }
        if (queue.peek() < K) {
        	count = -1;
        }
        return count;
    }
}