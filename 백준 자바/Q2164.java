package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


//https://www.acmicpc.net/problem/2164
public class Q2164 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		Queue<Integer> num = new LinkedList<Integer>();
		
		for (int i=1; i<=n; i++) {
			num.add(i);
		}
		
		while (num.size() != 1) {
			num.poll();
			num.add(num.poll());
		}
		
		System.out.println(num.peek());
		
		
	}

}
