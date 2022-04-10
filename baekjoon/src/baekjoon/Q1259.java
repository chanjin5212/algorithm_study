package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1259
public class Q1259 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String num = reader.readLine();
			if (num.equals("0")) {
				break;
			} else {
				int count = 0;
				for (int i=0; i<num.length()/2; i++) {
					if(num.charAt(i) != num.charAt(num.length()-i-1)) {
						count++;
					}
				}
				if (count == 0) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
		
	}

}
