package programmers.p60057;

import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public int solution(String s) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (s.length() == 1) {
        	answer = 1;
        	return answer;
        } else {
        	for (int i=1; i<=s.length()/2; i++) {
        		String result = "";
        		int j = 0;
        		int count = 1;
        		while (true) {
        			if (j+2*i >= s.length()) {
        				if (s.substring(j, j+i).equals(s.substring(j+i, s.length()))) {
        					count++;
        					result += count + s.substring(j, j+i);
        				} else {
        					if (count == 1) {
        						result += s.substring(j, j+i) + s.substring(j+i, s.length());
        					} else {
        						result += count + s.substring(j, j+i) + s.substring(j+i, s.length());
        					}
        				}
        				break;
        			} else {
        				if (s.substring(j, j+i).equals(s.substring(j+i, j+2*i))) {
        					count++;
        				} else {
        					if (count == 1) {
        						result += s.substring(j, j+i);
        					} else {
        						result += count + s.substring(j, j+i);
        						count = 1;
        					}
        				}
        			}
        			
        			
        			j = j + i;
        		}
        		list.add(result.length());
        	}        	
        }
        answer = Collections.min(list);
        return answer;
    }
}