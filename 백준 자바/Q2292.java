package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//https://www.acmicpc.net/problem/2292
public class Q2292 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int i = 6;
		int a = 1;
		int j = 1;
		while (j < n) {
			j = j + i;
			list.add(j);
			a++;
			i = 6 * a;
		}
		int count = 1;
		for (int t=0; t<list.size(); t++) {
			if (n > list.get(t)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
