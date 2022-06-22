package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//https://www.acmicpc.net/problem/1012
public class Q1012 {
	
	static boolean[][] check;
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		for (int i=0; i<t; i++) {
			String[] a = reader.readLine().split(" ");
			int m = Integer.parseInt(a[0]);
			int n = Integer.parseInt(a[1]);
			int k = Integer.parseInt(a[2]);
			check = new boolean[m][n];
			int[][] cabbage = new int[m][n];
			for (int j=0; j<k; j++) {
				a = reader.readLine().split(" ");
				cabbage[Integer.parseInt(a[0])][Integer.parseInt(a[1])] = 1;
			}
			int count = 0;
			for (int j=0; j<m; j++) {
				for (int o=0; o<n; o++) {
					if (cabbage[j][o] == 1 && !check[j][o]) {
						bfs_cheese(j, o, m, n, cabbage);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static void bfs_cheese(int startX, int startY, int m, int n, int[][] cabbage) {
		
		Queue<int[]> queue = new LinkedList<int[]>();
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
				if (cabbage[x][y] == 1 && !check[x][y]) {
					queue.offer(new int[] {x, y});
					check[x][y] = true;
				}
			}
		}
	}
}
