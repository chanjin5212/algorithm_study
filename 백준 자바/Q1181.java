package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1181
public class Q1181 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] word = new String[n];
		for (int i=0; i<word.length; i++) {
			word[i] = reader.readLine();
		}
		
		for (int i=0; i<word.length-1; i++) {
			for (int j=0; j<word.length-1-i; j++) {
				if (word[j].length() > word[j+1].length()) {
					String a = word[j];
					word[j] = word[j+1];
					word[j+1] = a;
				} else if (word[j].length() == word[j+1].length()) {
					String[] b = {word[j], word[j+1]};
					Arrays.sort(b);
					word[j] = b[0];
					word[j+1] = b[1];
				}
			}
		}
		String[] result = Arrays.stream(word).distinct().toArray(String[]::new);
		for (int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
