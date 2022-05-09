package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/4153
public class Q4153 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] s = reader.readLine().split(" ");
			int[] list = new int[3];
			for (int i=0; i<3; i++) {
				if (Integer.parseInt(s[i]) == 0) {
					return;
				}
				list[i] = Integer.parseInt(s[i]);
			}
			Arrays.sort(list);
			if (list[0] * list[0] + list[1] * list[1] == list[2] * list[2]) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		}
		
	}

}
