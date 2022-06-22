package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q9019 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i=0; i<t; i++) {
            String[] str = reader.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            String[] s = new String[10000];
            boolean[] visited_cheese = new boolean[10000];
            Arrays.fill(s, "");

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(a);
            visited_cheese[a] = true;
            while (!queue.isEmpty()) {
                int temp = queue.poll();
                int aD = (2*temp) % 10000;
                int aS = (temp == 0) ? 9999 : temp - 1;
                int aL = (temp % 1000) * 10 + (temp / 1000);
                int aR = (temp / 10) + (temp % 10) * 1000;

                if (!visited_cheese[aD]) {
                    queue.offer(aD);
                    visited_cheese[aD] = true;
                    s[aD] = s[temp] + "D";
                }

                if (!visited_cheese[aS]) {
                    queue.offer(aS);
                    visited_cheese[aS] = true;
                    s[aS] += s[temp] + "S";
                }
                if (!visited_cheese[aL]) {
                    queue.offer(aL);
                    visited_cheese[aL] = true;
                    s[aL] += s[temp] + "L";
                }
                if (!visited_cheese[aR]) {
                    queue.offer(aR);
                    visited_cheese[aR] = true;
                    s[aR] += s[temp] + "R";
                }

            }
            System.out.println(s[b]);

        }
    }
}
