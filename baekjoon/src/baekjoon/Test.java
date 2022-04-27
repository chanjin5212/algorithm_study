package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		String list[] = reader.readLine().split(" ");
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i=0; i<list.length; i++) {
			list1.add(Integer.parseInt(list[i]));
		}
		
		boolean yn[] = new boolean[Collections.max(list1)+1];
		yn[0] = true;
		yn[1] = true;
		
		for (int i=2; i<Math.sqrt(Collections.max(list1)); i++) {
			for (int j=i*i; j<Collections.max(list1)+1; j+=i) {
				yn[j] = true;
			}
		}
		
		int count = 0;
		for (int i=0; i<n; i++) {
			if (!yn[list1.get(i)]) {
				count++;
			}
		}
		System.out.println(count);

	}
}
