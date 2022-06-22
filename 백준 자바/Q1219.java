package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1219 {
    static int n;
    static int[] money;
    static int end;
    static List<List<Node>> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        n = Integer.parseInt(str[0]);
        int start = Integer.parseInt(str[1]);
        end = Integer.parseInt(str[2]);
        int m = Integer.parseInt(str[3]);
        for (int i=0; i<n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i=0; i<m; i++) {
            int[] ints = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            list.get(ints[0]).add(new Node(ints[1], -1 * ints[2]));
        }
        money = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[] d = bellman(start);
        if (d[end] == Long.MIN_VALUE) {
            System.out.println("gg");
        } else if (d[end] == Long.MAX_VALUE) {
            System.out.println("Gee");
        } else {
            System.out.println(d[end]);
        }
    }
    private static long[] bellman(int start) {
        long[] distances = new long[n];
        Arrays.fill(distances, Long.MIN_VALUE);
        distances[start] = money[start];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (distances[j] == Long.MIN_VALUE) continue;
                for (Node node : list.get(j)) {
                    long cost = distances[j] + node.distance + money[node.index];
                    if (distances[node.index] < cost) {
                        distances[node.index] = cost;
                        if (i == n-1) {
                            distances[node.index] = Long.MAX_VALUE;
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(distances));
        }
        return distances;
    }
    static class Node {
        int index, distance;
        public Node (int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    }
}
