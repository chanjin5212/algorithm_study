package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Q2805 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = reader.readLine().split(" ");
		
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		
		int[] tree = new int[N];
		
		int min = 0;
		int max = 0;
		
		String[] s1 = reader.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			tree[i] = Integer.parseInt(s1[i]);
			
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		while(min < max) {
			
			int mid = (min + max) / 2;
			long sum = 0;
			for(int treeHeight : tree) {
				
				if(treeHeight - mid > 0) { 
					sum += (treeHeight - mid);
				}
			}
			
 
			if(sum < M) {
				max = mid;
			}
			
			else {
				min = mid + 1;
			}
		}
		
		System.out.println(min - 1);
		
	}
}
