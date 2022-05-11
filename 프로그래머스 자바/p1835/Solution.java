package programmers.p1835;

import java.util.ArrayList;

public class Solution {
	
	private String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
	private boolean[] visited = new boolean[friends.length];
	private int count = 0;
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		int n = 2;
		String[] data = {"N~F=0", "R~T>2"};
		System.out.println(a.solution(n, data));
		
		
	}
	
    public int solution(int n, String[] data) {
        backtrack(new ArrayList<String>(), 0, data);
        int answer = count;
        return answer;
    }

	public void backtrack(ArrayList<String> permutation, int depth, String[] data) {
		if (depth == 8) {
			int count1 = 0;
			for (int i=0; i<data.length; i++) {
				String a = String.valueOf(data[i].charAt(0));
				String b = String.valueOf(data[i].charAt(2));
				String c = String.valueOf(data[i].charAt(3));
				int d = data[i].charAt(4) - 48;
				if (c.equals("=")) {
					if (Math.abs(permutation.indexOf(a) - permutation.indexOf(b)) == d+1) {
						count1++;
					} else {
						break;
					}
				} else if (c.equals(">")) {
					if (Math.abs(permutation.indexOf(a) - permutation.indexOf(b)) > d+1) {
						count1++;
					} else {
						break;
					}
					
				} else if (c.equals("<")) {
					if (Math.abs(permutation.indexOf(a) - permutation.indexOf(b)) < d+1) {
						count1++;
					} else {
						break;
					}
				}
				if (count1 == data.length) {
					count++;
				}
			}
			return;
		}
		
		for (int i=0; i<friends.length; i++) {
			if (!visited[i]) {
				permutation.add(friends[i]);
				visited[i] = true;
				backtrack(permutation, depth + 1, data);
				visited[i] = false;
				permutation.remove(friends[i]);
			}
		}
		
	}
}