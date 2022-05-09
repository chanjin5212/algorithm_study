package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/2108
public class Q2108 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		int[] numList = new int[n];
		double sum = 0;
		for (int i=0; i<n; i++) {
			int a = Integer.parseInt(reader.readLine());
			numList[i] = a;
			sum += a;
		}
		
		Arrays.sort(numList);
		
		int count = 0;
		int max = -1;
		boolean check = false;
		int mod = numList[0];
		
		for (int i=0; i<n-1; i++) {
			if (numList[i] == numList[i+1]) {
				count++;
			} else {
				count = 0;
			}
			
			if (max < count) {
				max = count;
				mod = numList[i];
				check = true;
			} else if (max == count && check == true) {
				mod = numList[i];
				check = false;
			}
		}
		
		
		System.out.println(Math.round(sum / n));
		System.out.println(numList[(n-1) / 2]);
		System.out.println(mod);
		System.out.println(numList[n-1] - numList[0]);
		
		
		
	}

}
