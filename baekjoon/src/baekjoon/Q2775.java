package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;


//https://www.acmicpc.net/problem/2775
public class Q2775 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] list = new int[15][15];
		
		for (int i=0; i<list.length; i++) {
			list[0][i] = i+1;
		}
		
		for (int i=1; i<list.length; i++) {
			for (int j=0; j<list.length; j++) {
				for (int k=0; k<j+1; k++) {
					list[i][j] += list[i-1][k];
				}
			}
		}
		int t = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<t; i++) {
			int a = Integer.parseInt(reader.readLine());
			int b = Integer.parseInt(reader.readLine());
			System.out.println(list[a][b-1]);
		}
		
	}

}








