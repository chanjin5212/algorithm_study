package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1929
public class Q1929 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = reader.readLine().split(" ");
		
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		
		boolean[] arr = new boolean[n + 1];
		arr[0] = arr[1] = false;
		for (int i=2; i<n+1; i++) {
			arr[i] = true;
		}
		
		for (int i=2; i*i<n+1; i++) {
			for (int j=i*i; j<n+1; j+=i) {
				arr[j] = false;
			}
		}
		
		for (int i=m; i<n+1; i++) {
			if(arr[i]) {
				System.out.println(i);
			}
		}
		
		
	}

}
