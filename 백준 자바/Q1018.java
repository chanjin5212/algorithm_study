package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// https://www.acmicpc.net/problem/1018
public class Q1018 {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] input = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		char[][] bw = new char[input[0]][input[1]];
		for (int i = 0; i < input[0]; i++) {
			String s = reader.readLine();
			for (int j = 0; j < s.length(); j++) {
				bw[i][j] = s.charAt(j);
			}
		}
		char[] b = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
		char[] w = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};
		int x = 0;
		int y = 0;
		int count = 100;
		//8 X 8 크기의 체스판을 모두 체크하기 위해 y + 8 = input[1] 일때 y=0으로 초기화 하면서 x++를 한다.
		while (x + 7 < input[0]) {
			int count1 = 0;
			for (int i = x; i < x + 8; i++) {
				for (int j = y; j < y + 8; j++) { 
					if ((i - x) % 2 == 0) {
						if (bw[i][j] != b[j-y]) {
							count1++;
						}
					} else {
						if (bw[i][j] != w[j-y]) {
							count1++;
						}
					}
				}
			}

			//count1이 32보다 크면 그 체크한 반대의 경우가 더 작은횟수이므로 else로 간다.
			if (count1 <= 32) {
				if (count > count1) {
					count = count1;
				}
			} else {
				if (count > 64 - count1) {
					count = 64 - count1;
				}
			}
			
			if (y + 8 == input[1]) {
				y = 0;
				x++;
			} else {
				y++;
			}
			
		}
		System.out.println(count);

	}

}
