package programmers.p12910;

import java.util.ArrayList;

public class Solution {
	public Integer[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        for (int i=1; i<arr.length; i++) {
        	if (arr[i-1] != arr[i]) {
        		list.add(arr[i]);
        	}
        }
            
        Integer[] answer1 = list.toArray(new Integer[0]);
        
        return answer1;
    }
}
