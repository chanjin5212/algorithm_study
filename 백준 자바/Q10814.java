package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//https://www.acmicpc.net/problem/10814
public class Q10814 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		String[][] list = new String[n][2];
		
		for (int i=0; i<n; i++) {
			String[] s = reader.readLine().split(" ");
			list[i][0] = s[0];
			list[i][1] = s[1];
		}
		
		Arrays.sort(list, new Comparator<String[]>() {
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
			
		});
		
		for (int i=0; i<n; i++) {
			System.out.println(list[i][0] + " " + list[i][1]);
		}
		
	}

}
