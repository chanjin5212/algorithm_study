package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1546
public class Q1546 {
	
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] score = reader.readLine().split(" ");
		int[] score1 = new int[n];
		for (int i=0; i<n; i++) {
			score1[i] = Integer.parseInt(score[i]);
		}
		Arrays.sort(score1);
		double sum = 0;
		for (int i=0; i<n; i++) {
			sum += ((double)score1[i] / score1[score1.length-1]) * 100;
		}
		System.out.println(sum/n);
	}

}
