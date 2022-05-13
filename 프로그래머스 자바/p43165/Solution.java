package programmers.p43165;


class Solution {
	static int answer = 0;
	public static void main(String[] args) {
		
		Solution a = new Solution();
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(a.solution(numbers, target));
		int[] number = {4, 1, 2, 1};
		target = 4;
		System.out.println(a.solution(number, target));
	}
    public int solution(int[] numbers, int target) {
        answer = 0;
        backtrack(numbers, 0, target, 0);
        return answer;
    }
	private void backtrack(int[] numbers, int depth, int target, int sum) {
		if (depth == numbers.length) {
			if (target == sum) {
				answer++;
			}
		} else {
			backtrack(numbers, depth+1, target, sum + numbers[depth]);
			backtrack(numbers, depth+1, target, sum - numbers[depth]);
		}
	}
}