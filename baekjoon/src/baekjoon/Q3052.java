package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/3052
public class Q3052 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[10];
		for (int i=0; i<num.length; i++) {
			int n = Integer.parseInt(reader.readLine());
			num[i] = n % 42;
		}
		Arrays.sort(num);
		int count = 1;
		for (int i=0; i<num.length-1; i++) {
			if (num[i] != num[i+1]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
