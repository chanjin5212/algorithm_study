package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1654
public class Q1654 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] str = reader.readLine().split(" ");
		int k = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		int[] nlist = new int[k];
		for (int i = 0; i < k; i++) {
			nlist[i] = Integer.parseInt(reader.readLine());
		}
		Arrays.sort(nlist);
		long min = 1;
		long max = nlist[k-1];
		while (min <= max) {
			int sum = 0;
			long mid = (min + max) / 2;
			for (int i=0; i<k; i++) {
				sum += nlist[i] / mid;
			}
			if (sum >= n) {
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		System.out.println(max);
		
	}
}
