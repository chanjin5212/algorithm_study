package programmers.p77484;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/77484
class Solution {
	
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int count = 0;
        Set<Integer> winNums = Arrays.stream(lottos).boxed().collect(Collectors.toSet());
        for (int i : win_nums) {
        	if (winNums.contains(i)) {
        		count++;
        	}
        }
        int zero = 0;
        for (int i=0; i<lottos.length; i++) {
        	if (lottos[i] == 0) {
        		zero++;
        	}
        }
        
        int maxrank = 7 - (count + zero);
        int minrank = 7 - count;
        if (maxrank > 6) {
        	maxrank = 6;
        }
        if (minrank > 6) {
        	minrank = 6;
        }
        
        return new int[] {maxrank, minrank};
    }
}