package programmers.p72411;

import java.util.*;

public class Solution {
	
	private static boolean[] visited;
	
	public ArrayList<String> solution(String[] orders, int[] course) {
		ArrayList<String> answer = new ArrayList<String>();
		
		for (int i=0; i<orders.length; i++) {
			char[] chars = orders[i].toCharArray();
			Arrays.sort(chars);
			orders[i] = String.valueOf(chars);
		}
		
		for (int i : course) {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int max = 0;
			
			for (String order : orders) {
				visited = new boolean[order.length()];
				ArrayList<String> combinations = new ArrayList<String>();
				backtrack(0, i, 0, order, combinations);
				
				for (String comb : combinations) {
					map.put(comb, map.getOrDefault(comb, 0) + 1);
					max = Math.max(max, map.get(comb));
				}
			}
			
			for (String key : map.keySet()) {
				int value = map.get(key);
				
				if (value >=2 && value == max) {
					answer.add(key);
				}
			}
			
			
		}
		
		Collections.sort(answer);
        return answer;
    }

	private void backtrack(int start, int n, int depth, String order, ArrayList<String> combinations) {
		
		if (depth == n) {
			StringBuilder sb = new StringBuilder();
			for (int i=0; i<visited.length; i++) {
				if(visited[i]) {
					sb.append(order.charAt(i));
				}
			}
			
			combinations.add(sb.toString());
			
		} else {
			for (int i=start; i<visited.length; i++) {
				visited[i] = true;
				backtrack(start, n, depth + 1, order, combinations);
				visited[i] = false;
			}
		}
		
	}

}