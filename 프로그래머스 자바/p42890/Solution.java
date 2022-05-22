package programmers.p42890;

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
	
	private static ArrayList<ArrayList<Integer>> check = new ArrayList<ArrayList<Integer>>(); 
	
    public int solution(String[][] relation) {
        int answer = 0;
        
        for (int i=0; i<relation[0].length; i++) {
        	boolean[] visited = new boolean[relation[0].length];
        	backtrack(0, 0, i+1, relation, visited);
        }
        
        answer = check.size();
        return answer;
    }

	private void backtrack(int start, int depth, int end, String[][] relation, boolean[] visited) {
		if (depth == end) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i=0; i<relation[0].length; i++) {
				if (visited[i]) {
					list.add(i);
				}
			}
			
			HashSet<String> set = new HashSet<String>();
			for (int i=0; i<relation.length; i++) {
				String str = "";
				for (int j=0; j<list.size(); j++) {
					str += relation[i][list.get(j)];
				}
				set.add(str);
			}
			
			if (set.size() == relation.length) {
				boolean flag = true;
				for (int i=0; i<check.size(); i++) {
					int count = 0;
					for (int j=0; j<check.get(i).size(); j++) {
						if (list.contains(check.get(i).get(j))) {
							count++;
						}
					}
					if (check.get(i).size() == count) {
						flag = false;
						break;
					}
				}
				if (flag) {
					check.add(list);
				}
				
			}
			
			
		} else {
			for (int i=start; i<relation[0].length; i++) {
				visited[i] = true;
				backtrack(i+1, depth + 1, end, relation, visited);
				visited[i] = false;
			}
		}
		
	}
}