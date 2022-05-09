package programmers.p77484;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/77484
class Solution {
	
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
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
        int rank = 0;
        switch (count+zero) {
        	case 2:
        		rank = 5;
        		break;
        	case 3:
        		rank = 4;
        		break;
        	case 4:
        		rank = 3;
        		break;
        	case 5:
        		rank = 2;
        		break;
        	case 6:
        		rank = 1;
        		break;
        	default: 
        		rank = 6;
        		break;
        }
        answer[0] = rank;
        switch (count) {
        	case 2:
        		rank = 5;
        		break;
        	case 3:
        		rank = 4;
        		break;
        	case 4:
        		rank = 3;
        		break;
        	case 5:
        		rank = 2;
        		break;
        	case 6:
        		rank = 1;
        		break;
        	default: 
        		rank = 6;
        		break;
        }
        answer[1] = rank;
        return answer;
    }
}