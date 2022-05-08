package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

//https://www.acmicpc.net/problem/1966
public class Q1966 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<t; i++) {
			String[] s = reader.readLine().split(" ");
			int m = Integer.parseInt(s[0]);
			int n = Integer.parseInt(s[1]);
			String[] a = reader.readLine().split(" ");
			Queue<Integer> list = new LinkedList<Integer>();
			for (int j = 0; j < m; j++) {
				list.add(Integer.parseInt(a[j]));
			}
			int count = 0;
			while(true) {
				if (list.peek() == Collections.max(list) && n == 0) {
					list.poll();
					count++;
					break;
				} else if (list.peek() == Collections.max(list)) {
					list.poll();
					count++;
					n--;
				} else if (list.peek() < Collections.max(list) && n == 0) {
					list.add(list.poll());
					n = list.size()-1;
				} else if (list.peek() < Collections.max(list)) {
					list.add(list.poll());
					n--;
				}
			}
			System.out.println(count);
			
		}
	
		
	}

}
