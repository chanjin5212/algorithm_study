package programmers.p67256;

class Solution {
	
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 10;
        int right = 12;
        
        for (int i=0; i<numbers.length; i++) {
        	if (numbers[i] == 0) {
        		numbers[i] = 11;
        	}
        	if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer += "L";
        		left = numbers[i];
        	} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer += "R";
        		right = numbers[i];
        	} else {
        		int leftR;
        		int leftC;
        		if (left % 3 == 0) {
        			leftR = left / 3;
        			leftC = 3;
        		} else {
        			leftR = left / 3 + 1;
        			leftC = left % 3;
        		}
        		int rightR;
        		int rightC;
        		if (right % 3 == 0) {
        			rightR = right / 3;
        			rightC = 3;
        		} else {
        			rightR = right / 3 + 1;
        			rightC = right % 3;
        		}
        		
        		int numberR;
        		int numberC;
        		if (numbers[i] % 3 == 0) {
        			numberR = numbers[i] / 3;
        			numberC = 3;
        		} else {
        			numberR = numbers[i] / 3 + 1;
        			numberC = numbers[i] % 3;
        		}
        		
        		int leftValue = Math.abs(numberR-leftR) + Math.abs(numberC-leftC);
        		int rightValue = Math.abs(numberR-rightR) + Math.abs(numberC-rightC);
        		
        		if (leftValue > rightValue) {
        			answer += "R";
        			right = numbers[i];
        		} else if (leftValue < rightValue) {
        			answer += "L";
        			left = numbers[i];
        		} else {
        			if (hand.equals("right")) {
        				answer += "R";
            			right = numbers[i];
        			} else if (hand.equals("left")) {
        				answer += "L";
            			left = numbers[i];
        			}
        		}
        		
        	}
        }
        
        
        return answer;
    }
}
