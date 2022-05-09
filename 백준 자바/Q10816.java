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
		StringBuilder sb = new StringBuilder();

		s = reader.readLine().split(" ");
		for (int i=0; i<m; i++) {
			sb.append(map.getOrDefault(Integer.parseInt(s[i]), 0)).append(' ');
		}
		
		System.out.println(sb);
		
		
		
		
	}

}
