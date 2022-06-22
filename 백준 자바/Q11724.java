package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//https://www.acmicpc.net/problem/11724
public class Q11724 {
    static int n;
    static boolean[] visited_cheese;
    static int[][] com;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        com = new int[n][n];
        visited_cheese = new boolean[n];
        for (int i=0; i<m; i++) {
            input = reader.readLine().split(" ");
            com[Integer.parseInt(input[0])-1][Integer.parseInt(input[1])-1] = com[Integer.parseInt(input[1])-1][Integer.parseInt(input[0])-1] = 1;
        }
        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (!visited_cheese[i]) {
                bfs_cheese(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    private static void bfs_cheese(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited_cheese[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i=0; i<n; i++) {
                if (com[now][i] == 1 && !visited_cheese[i]) {
                    queue.offer(i);
                    visited_cheese[i] = true;
                }
            }
        }
    }
}
