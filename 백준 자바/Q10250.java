package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//https://www.acmicpc.net/problem/10250
public class Q10250 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<t; i++) {
			String[] s = reader.readLine().split(" ");
			int h = Integer.parseInt(s[0]);
			int w = Integer.parseInt(s[1]);
			int n = Integer.parseInt(s[2]);
			
			ArrayList<String> list = new ArrayList<String>();
			
			for (int j=1; j<=w; j++) {
				for (int k=1; k<=h; k++) {
					if (j < 10) {
						list.add(k + "0" + j);
					} else {
						list.add(k + "" + j);
					}
				}
			}
			System.out.println(list.get(n-1));
			
 		}
		
	}

}
