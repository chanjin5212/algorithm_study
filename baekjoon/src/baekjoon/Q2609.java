package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2609
public class Q2609 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = reader.readLine().split(" ");
		
		int a = 0;
		int b = 0;
		if (Integer.parseInt(s[0]) >= Integer.parseInt(s[1])) {
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);			
		} else {			
			a = Integer.parseInt(s[1]);
			b = Integer.parseInt(s[0]);			
		}
		
		int a1 = a; //24 //6
		int b1 = b; //18 //18
		
		while (b1 != 0) {
			a1 = a1 % b1;
			
			int temp = a1;
			a1 = b1;
			b1 = temp;
			
		}
		
		System.out.println(a1);
		System.out.println(a * b / a1);
		
	}

}
