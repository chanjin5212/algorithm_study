package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/2562
public class Q2562 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[] list = new int[9];
		int[] list1 = new int[9];		
		for (int i=0; i<9; i++) {
			list[i] = Integer.parseInt(reader.readLine()); 
			list1[i] = list[i]; 
		}
		Arrays.sort(list);
		int count = 1;
		for (int i=0; i<list.length; i++) {
			if (list[list.length-1] == list1[i]) {
				break;
			} else {
				count++;
			}
		}
		System.out.println(list[list.length-1]);
		System.out.println(count);
	}
}
