package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//https://www.acmicpc.net/problem/10026
public class Q10026 {
    static boolean[][] visited_cheese;
    static String[][] RGB;
    static String[][] RB;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());
        visited_cheese = new boolean[n][n];
        RGB = new String[n][n];
        RB = new String[n][n];
        for (int i=0; i<n; i++) {
            String strRGB = reader.readLine();
            String strRB = strRGB.replace("G", "R");
            for (int j=0; j<n; j++) {
                RGB[i][j] = String.valueOf(strRGB.charAt(j));
                RB[i][j] = String.valueOf(strRB.charAt(j));
            }
        }

        int cnt = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (!visited_cheese[i][j]) {
                    bfs_cheese(i, j, RGB);
                    cnt++;
                }
            }
        }
        System.out.print(cnt + " ");

        cnt = 0;
        visited_cheese = new boolean[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (!visited_cheese[i][j]) {
                    bfs_cheese(i, j, RB);
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }

    private static void bfs_cheese(int x, int y, String[][] res) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        visited_cheese[x][y] = true;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i=0; i<4; i++) {
                int nextX = temp[0] + dx[i];
                int nextY = temp[1] + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
                    continue;
                }

                if (res[nextX][nextY].equals(res[x][y]) && !visited_cheese[nextX][nextY]) {
                    queue.offer(new int[] {nextX, nextY});
                    visited_cheese[nextX][nextY] = true;
                }
            }

        }
    }
}
