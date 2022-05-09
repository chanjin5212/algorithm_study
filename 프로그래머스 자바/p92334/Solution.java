package programmers.p92334;

import java.util.HashMap;
import java.util.HashSet;

//https://programmers.co.kr/learn/courses/30/lessons/92334
class Solution {
	
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, Integer> num = new HashMap<String, Integer>();
        for (int i=0; i<id_list.length; i++) {
        	num.put(id_list[i], 0);
        }
        
        HashMap<String, Integer> numreport = new HashMap<String, Integer>();
        HashMap<String, HashSet<String>> report1 = new HashMap<String, HashSet<String>>();
        for (int i=0; i<report.length; i++) {
        	HashSet<String> set = new HashSet<String>();
        	if (report1.get(report[i].split(" ")[0]) != null) {
        		set = report1.get(report[i].split(" ")[0]);
        		set.add(report[i].split(" ")[1]);
        		report1.put(report[i].split(" ")[0], set); 
        	} else {
        		set.add(report[i].split(" ")[1]);
        		report1.put(report[i].split(" ")[0], set);
        	}
        }
        
        for (String s : report1.keySet()) {
        	for (String a : report1.get(s)) {
        		numreport.put(a, numreport.getOrDefault(a, 0) + 1);
        	}
        }
        
        for (String s : report1.keySet()) {
        	for (String a : report1.get(s)) {
        		if (numreport.get(a) >= k) {
        			num.put(s, num.get(s) + 1);
        		}
        	}
        }
        for (int i=0; i<id_list.length; i++) {
        	answer[i] = num.get(id_list[i]);
        }
        
        return answer;
        
    }
}