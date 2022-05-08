package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2920
public class Q2920 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] num = reader.readLine().split(" ");
		int[] num1 = new int[num.length];
   		for (int i=0; i<num.length; i++) {
			num1[i] = Integer.parseInt(num[i]);
		}
		
   		int[] num2 = {1, 2, 3, 4, 5, 6, 7, 8};
   		int[] num3 = {8, 7, 6, 5, 4, 3, 2, 1};
   		
   		int count1 = 0;
   		int count2 = 0;
   		for (int i=0; i<num1.length; i++) {
   			if (num1[i] == num2[i]) {
   				count1++;
   			}
   			if (num1[i] == num3[i]) {
   				count2++;
   			}
   		}
   		if (count1 == 8) {
   			System.out.println("ascending");
   		} else if (count2 == 8) {
   			System.out.println("descending");
   		} else {
   			System.out.println("mixed");
   		}	
	}

}
