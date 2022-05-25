package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//https://www.acmicpc.net/problem/1107
public class Q1107 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(reader.readLine());
		int m = Integer.parseInt(reader.readLine());

		Set<String> set = new HashSet<String>();
		if (m > 0) {
			String[] num = reader.readLine().split(" ");
			for (String n : num) {
				set.add(n);
			}			
		}
		
		int t = Math.abs(number - 100);
		int max = number;
		int min = number;
		while(max <= 999999) {
			boolean flag = true;
			for (int i=0; i<String.valueOf(max).length(); i++) {
				if (set.contains(String.valueOf(String.valueOf(max).charAt(i)))) {
					flag = false;
					break;
				}
			}
			if (flag) {
				t = Math.min(t, max-number + String.valueOf(max).length());
				break;
			} else {
				max++;
			}
		}
		
		while(min >= 0) {
			boolean flag = true;
			for (int i=0; i<String.valueOf(min).length(); i++) {
				if (set.contains(String.valueOf(String.valueOf(min).charAt(i)))) {
					flag = false;
					break;
				}
			}
			if (flag) {
				t = Math.min(t, number-min + String.valueOf(min).length());
				break;
			} else {
				min--;
			}
		}
		
		System.out.println(t);
		
	}

}
