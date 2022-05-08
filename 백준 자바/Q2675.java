package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2675
public class Q2675 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		for (int i=0; i<t; i++) {
			String[] r = reader.readLine().split(" ");
			for (int j=0; j<r[1].length(); j++) {
				for (int k=0; k<Integer.parseInt(r[0]); k++) {
					System.out.print(r[1].charAt(j));
				}
			}
			System.out.println();
		}
		
	}

}
