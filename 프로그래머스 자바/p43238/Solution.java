package programmers.p43238;

import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long low = 1;
        long high = Arrays.stream(times).max().getAsInt() * (long)n;
        while (low < high) {
        	long mid = (low + high) / 2;
        	long sum = 0;
        	for (int t : times) {
        		sum += mid / t;
        	}
        	if (sum >= n) {
        		high = mid;
        	} else {
        		low = mid + 1;
        	}
        	
        }
        
        return high;
    }
}
