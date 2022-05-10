package programmers.p12910;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
        	if (arr[i] % divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        
        if (list.size() == 0) {
        	list.add(-1);
        }
        
        Collections.sort(list);
        
        Integer[] answer = list.toArray(new Integer[0]);
        
        return answer;
    }
}
