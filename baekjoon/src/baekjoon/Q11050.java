package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/11050
public class Q11050 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int a = 1;
		int b = 1;
		int c = 1;
		
		for (int i=1; i<=n; i++) {
			a = a*i;
		}
		
		for (int i=1; i<=k; i++) {
			b = b*i;
		}
		
		for (int i=1; i<=n-k; i++) {
			c = c*i;
		}
		
		System.out.println(a / (b*c));
		
	}

}
