package programmers.p72412;

import java.util.ArrayList;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		System.out.println(a.solution(info, query));
	}
	
	public ArrayList<Integer> solution(String[] info, String[] query) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<String[]> list = new ArrayList<String[]>();
        for (int i=0; i<info.length; i++) {
        	String[] a = info[i].split(" ");
        	list.add(a);
        }
        
        int[] index = {0, 2, 4, 6, 7};
        for (int i=0; i<query.length; i++) {
        	int count2 = 0;
        	String[] b = query[i].split(" ");
        	for (int j=0; j<list.size(); j++) {
        		int count = 0;
        		for (int k=0; k<index.length-1; k++) {
        			if (list.get(j)[k].equals(b[index[k]]) || b[index[k]].equals("-")) {
        				count++;
        			}
        		}
        		if (count == 4) {
        			if (Integer.parseInt(list.get(j)[4]) >= Integer.parseInt(b[7])) {
        				count2++;
        			}
        		}
        	}
        	result.add(count2);
        }
        
        return result;
    }
}