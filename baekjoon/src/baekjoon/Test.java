package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String a = reader.readLine().toUpperCase();
		
		if (a.equals("N")) {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}
	}
}
