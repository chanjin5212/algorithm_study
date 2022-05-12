package programmers.p42586;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		System.out.println(Arrays.toString(a.solution(progresses, speeds)));
		
		int[] progresse = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		int[] speed = {10, 12, 10, 10, 10, 10, 10, 10, 10, 10};
		System.out.println(Arrays.toString(a.solution(progresse, speed)));
		
	}
	
    public Integer[] solution(int[] progresses, int[] speeds) {
       
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i=0; i<progresses.length; i++) {
        	double a = Math.ceil((double)(100 - progresses[i]) / (double)speeds[i]);
        	list.add((int)a);
        }
        System.out.println(list);
        int count = 0;
        int i = 0;
        int num = 0;
        while(!list.isEmpty()) {
        	if (i+1 > list.size()-1) {
        		if (count == 0) {
        			list.remove(0);
        			list1.add(1);
        		} else {
        			for (int j=0; j<=count; j++) {
        				list.remove(0);
        			}
        			list1.add(count+1);
        		}
        	} else {
        		if (count != 0) {
        			if (num >= list.get(i+1)) {
        				count++;
        				i++;
        			} else if (num < list.get(i+1)) {
            			for (int j=0; j<=count; j++) {
            				list.remove(0);
            			}
            			list1.add(count+1);
            			count = 0;
            			i= 0;
            		}
        		} else {
        			if (list.get(i) >= list.get(i+1)) {
        				count++;
        				num = list.get(i);
        				i++;
        			} else if (list.get(i) < list.get(i+1)) {
        				for (int j=0; j<=count; j++) {
        					list.remove(0);
        				}
        				list1.add(count+1);
        				count = 0;
        				i= 0;
        			}
        		}
        	}
        }
        
        return list1.toArray(new Integer[list1.size()]);
    }
    
}
