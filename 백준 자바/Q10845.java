package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//https://www.acmicpc.net/problem/10845
public class Q10845 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		int a = -1;
		for (int i=0; i<n; i++) {
			String[] s = reader.readLine().split(" ");
			if (s[0].equals("push")) {
				queue.add(Integer.parseInt(s[1]));
				a = Integer.parseInt(s[1]);
			} else if (s[0].equals("pop")) {
				if (queue.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(queue.poll());
				}
			} else if (s[0].equals("size")) {
				System.out.println(queue.size());
			} else if (s[0].equals("empty")) {
				if (queue.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				
			} else if (s[0].equals("front")) {
				if (queue.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(queue.peek());
				}
				
			} else if (s[0].equals("back")) {
				if (queue.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(a);
				}
				
			}
		}
		
	}

}
