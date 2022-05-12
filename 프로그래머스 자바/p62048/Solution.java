package programmers.p62048;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		int w = 12;
		int h = 8;
		System.out.println(a.solution(w, h));
		
	}
    public long solution(int w, int h) {
        long answer = 1;
        
        for (int i=1; i<=Math.min(w, h); i++) {
        	long result = 1;
        	if (w % i == 0 && h % i == 0) {
        		result = i;
        	}
        	answer = Math.max(answer, result);
        	
        }
        
        return (long)w * (long)h - (long)(w + h - answer);
    }
}