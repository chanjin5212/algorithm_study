package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

//https://www.acmicpc.net/problem/1920
public class Q1920 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		Set<String> nlist = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toSet());
		
		
		int m = Integer.parseInt(reader.readLine());
		String[] mlist = reader.readLine().split(" ");
		for (String s : mlist) {
			System.out.println(nlist.contains(s) ? 1 : 0);
		}
			
	}

}
