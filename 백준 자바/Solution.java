package baekjoon;

class Solution {

    private static int answer;

    public static void main(String[] args) {
        Solution a = new Solution();
        int n = 3;
        int rooks = 2;
        System.out.println(a.solution(n, rooks));
    }

    public int solution(int n, int rooks) {
        int[][] tri = new int[n][];
        for (int i=1; i<=n; i++) {
            tri[i-1] = new int[i*2 -1];
        }

        backtrack(tri, 0, rooks, 0);

        return answer;
    }

    private void backtrack(int[][] tri, int row, int rooks, int depth) {
        if (depth == rooks) {
            answer++;
        } else {
            for (int i=row; i<tri.length; i++) {
                for (int j=0; j<tri[i].length; j++) {
                    if (isValid(tri, i, j)) {
                        tri[i][j] = 1;
                        backtrack(tri, i+1, rooks, depth + 1);
                        tri[i][j] = 0;
                    }
                }
            }
        }


    }

    private boolean isValid(int[][] tri, int row, int col) {
        // 위 왼쪽
        // col - diff * 2, col - diff * 2 - 1
        // 위 오른쪽
        // col, col + 1
        for (int i=0; i<row; i++) {
            int diff = Math.abs(row - i);
            // 위 왼쪽 검사
            int y = col % 2 == 1 ? col + 1 : col;
            int[] up = {y - diff * 2, y - diff * 2 - 1};
            for (int j : up) {
                if (0 <= j && j < tri[i].length && tri[i][j] == 1)
                    return false;
            }
            // 오른쪽 위 검사
            y = col % 2 == 1 ? col - 1 : col;
            int[] up2 = {y, y + 1};
            for (int j : up2) {
                if (0 <= j && j < tri[i].length && tri[i][j] == 1)
                    return false;
            }
        }

        return true;
    }
}