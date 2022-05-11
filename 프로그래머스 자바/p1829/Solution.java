package programmers.p1829;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

//https://programmers.co.kr/learn/courses/30/lessons/1829
class Solution {
	
	static boolean[][] check;
	static int m;
	static int n;
	static int count = 1;
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		m = 6;
		n = 4;
		int[][] d = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		int[][] f = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};
		
		System.out.println(Arrays.toString(a.solution(m, n, d)));
		System.out.println(Arrays.toString(a.solution(m, n, f)));
		
	}
	
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] answer = new int[2];
        check = new boolean[m][n];
        int count_num = 0;
        int color = 0;
        this.m = m;
        this.n = n;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<m; i++) {
        	for (int j=0; j<n; j++) {
        		if (picture[i][j] != 0 && !check[i][j]) {
        			bfs(i, j, picture);
        			count_num++;
        			color = picture[i][j];
        			if (count > map.getOrDefault(color, 0)) {
        				map.put(color, count);        	
        			}

        		}
        	}
        }
        
        numberOfArea = count_num;
        maxSizeOfOneArea = Collections.max(map.values());
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        
        return answer;
    }

	private static void bfs(int startX, int startY, int[][] picture) {
		Queue<int[]> queue = new LinkedList<int[]>();
		count = 1;
		queue.offer(new int[] {startX, startY});
		
		check[startX][startY] = true;
		
		int[] a = {0, 0, 1, -1};
		int[] b = {1, -1, 0, 0};
		
		while (!queue.isEmpty()) {
			
			int[] poll = queue.poll();
			
			for (int i=0; i<4; i++) {
				int x = poll[0] + a[i];
				int y = poll[1] + b[i];
				
				if (x < 0 || x >= m || y < 0 || y >= n) {
					continue;
				}
				if (picture[x][y] == picture[startX][startY] && !check[x][y]) {
					queue.offer(new int[] {x, y});
					check[x][y] = true;
					count++;
				}
				
			}
			
			
			
		}
		
	}
}








