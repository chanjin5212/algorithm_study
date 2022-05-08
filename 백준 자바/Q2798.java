package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2798
public class Q2798 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] a = reader.readLine().split(" ");
		
		int n = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
		
		int[] list = new int[n];
		String[] s = reader.readLine().split(" ");
		for (int i=0; i<n; i++) {
			list[i] = Integer.parseInt(s[i]);
		}
		
		int sum = 0;
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				for (int k=j+1; k<n; k++) {
					if (list[i] + list[j] + list[k] <= m && list[i] + list[j] + list[k] > sum) {
						sum = list[i] + list[j] + list[k];
					}
				}
			}
		}
		
		System.out.println(sum);
		
		
		
		
	}

}









