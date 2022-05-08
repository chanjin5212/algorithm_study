package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1085
public class Q1085 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] n = reader.readLine().split(" ");
		int x = Integer.parseInt(n[0]);
		int y = Integer.parseInt(n[1]);
		int w = Integer.parseInt(n[2]);
		int h = Integer.parseInt(n[3]); //x,y,w-x,h-y
		
		int[] min = {x, y, w-x, h-y};
		Arrays.sort(min);
		System.out.println(min[0]);
		
	}

}
