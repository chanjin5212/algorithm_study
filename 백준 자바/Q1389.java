package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1389 {
	
	private static int[][] check;
	private static boolean[] visited_cheese;
	private static int n;
	private static int m;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		check = new int[n+1][n+1];
		for (int i=0; i<m; i++) {
			str = reader.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			check[x][y] = check[y][x] = 1;
		}
		int min = 100000000;
		int min_num = 0;
		for (int i=1; i<=n; i++) {
			int s = bfs_cheese(i);
			if (min > s) {
				min = s;
				min_num = i;
			}
		}
		System.out.println(min_num);
	}

	private static int bfs_cheese(int i) {
		List<Integer> list = new ArrayList<Integer>();
		for (int a=1; a<=n; a++) {
			visited_cheese = new boolean[n+1];
			if (a == i) {
				continue;
			} else {
				Queue<Integer> queue = new LinkedList<>();
				queue.offer(i);
				visited_cheese[i] = true;
				int level = 1;
				loop:while(!queue.isEmpty()) {
					int size = queue.size();
					for (int j=0; j<size; j++) {
						int temp = queue.poll();
						for (int k=1; k<=n; k++) {
							if (check[temp][k] == 1 && !visited_cheese[k]) {
								if (k == a) {
									list.add(level);
									break loop;
								}
								queue.offer(k);
								visited_cheese[k] = true;
							}
						}
					}
					level++;
				}
			}
		}
		return list.stream().mapToInt(Integer::intValue).sum();
	}
}
