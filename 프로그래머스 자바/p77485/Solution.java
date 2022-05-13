package programmers.p77485;

import java.util.ArrayList;

class Solution {

    public Integer[] solution(int rows, int columns, int[][] queries) {
        int[][] result = new int[rows][columns];
        int n = 1;
        for (int i=0; i<rows; i++) {
        	for (int j=0; j<columns; j++) {
        		result[i][j] = n++;
        	}
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<queries.length; i++) {
        	int prev = result[queries[i][0]-1][queries[i][1]-1];
        	int small = prev;
        	int x = queries[i][0]-1;
        	int y = queries[i][1]-1;
        	int[][] steps = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        	
        	for (int[] j : steps) {
        		while (true) {
        			int nx = x + j[0];
        			int ny = y + j[1];
        			if (nx >= queries[i][0]-1 && nx < queries[i][2] && ny >= queries[i][1]-1 && ny < queries[i][3]) {
        				int temp = result[nx][ny];
        				result[nx][ny] = prev;
        				prev = temp;
        				x = nx;
        				y = ny;
        				if (small > prev) {
        					small = prev;
        				}
        			} else {
        				break;
        			}
        		}
        	}
        	list.add(small);
        }
        return list.toArray(new Integer[0]);
    }
}