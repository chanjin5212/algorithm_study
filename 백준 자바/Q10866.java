package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

//https://www.acmicpc.net/problem/10866
public class Q10866 {
	
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		
		Deque<Integer> deque = new LinkedList<Integer>();
		for (int i=0; i<n; i++) {
			String[] s = reader.readLine().split(" ");
			if (s[0].equals("push_front")) {
				deque.addFirst(Integer.parseInt(s[1]));
			} else if (s[0].equals("push_back")) {
				deque.addLast(Integer.parseInt(s[1]));
			} else if (s[0].equals("pop_front")) {
				if (deque.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(deque.pollFirst());
				}
			} else if (s[0].equals("pop_back")) {
				if (deque.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(deque.pollLast());
				}
			} else if (s[0].equals("size")) {
				System.out.println(deque.size());
			} else if (s[0].equals("empty")) {
				if (deque.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
				
			} else if (s[0].equals("front")) {
				if (deque.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(deque.peekFirst());
				}
				
			} else if (s[0].equals("back")) {
				if (deque.size() == 0) {
					System.out.println("-1");
				} else {
					System.out.println(deque.peekLast());
				}
				
			}
		}
		
	}

}
