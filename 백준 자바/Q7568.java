package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//https://www.acmicpc.net/problem/7568
public class Q7568 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for (int i=0; i<n; i++) {
			ArrayList<Integer> num = new ArrayList<Integer>();
			String[] s = reader.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			num.add(x);
			num.add(y);
			list.add(num);
		}
		
		

		for (int i=0; i<n; i++) {
			int count = 1;
			for (int j=0; j<n; j++) {
				if (list.get(i).get(0) < list.get(j).get(0) && list.get(i).get(1) < list.get(j).get(1)) {
					count++;
				}
			}
			System.out.println(count);
		}
		
		
	}

}
