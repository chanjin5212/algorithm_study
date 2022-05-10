package programmers.p42888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(Arrays.toString(a.solution(record)));
		
	}
    public String[] solution(String[] record) {
        
        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<record.length; i++) {
        	String[] s = record[i].split(" ");
        	if (s[0].equals("Enter")) {
        		map.put(s[1], s[2]);
        	} else if (s[0].equals("Change")) {
        		map.put(s[1], s[2]);
        	}
        }
        
        for (int i=0; i<record.length; i++) {
        	String[] s = record[i].split(" ");
        	if (s[0].equals("Enter")) {
        		String name = map.get(s[1]);
        		list.add(String.format("%s님이 들어왔습니다.", name));
        	} else if (s[0].equals("Leave")) {
        		String name = map.get(s[1]);
        		list.add(String.format("%s님이 나갔습니다.", name));
        	}
        }
        
        String[] answer = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}
