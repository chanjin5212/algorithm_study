package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//https://www.acmicpc.net/problem/2751
public class Q2751 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(reader.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<n; i++) {
			list.add(Integer.parseInt(reader.readLine()));
		}
		
		Collections.sort(list);
		
		for (int i : list) {
			sb.append(i).append("\n");
		}
		
		System.out.println(sb);
		
	}

}
