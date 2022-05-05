package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

//https://www.acmicpc.net/problem/10816
public class Q10816 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String[] s = reader.readLine().split(" ");
		for (int i=0; i<n; i++) {
			int num = Integer.parseInt(s[i]);
			if (map.get(num) == null) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num) + 1);
			}
		}
		
		int m = Integer.parseInt(reader.readLine());
		
		int[] list = new int[m];
		s = reader.readLine().split(" ");
		for (int i=0; i<m; i++) {
			int num = Integer.parseInt(s[i]);
			list[i] = num;
		}
		
		for (int i=0; i<m; i++) {
			if (i == m-1) {
				if (map.get(list[i]) == null) {
					System.out.print("0");
				} else {
					System.out.print(map.get(list[i]));
				}
			} else {
				if (map.get(list[i]) == null) {
					System.out.print("0 ");
				} else {
					System.out.print(map.get(list[i]) + " ");
				}
			}
		}
		
		
	}

}
