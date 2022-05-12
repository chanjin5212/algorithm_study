package programmers.p12899;



class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		for (int i=1; i<50; i++) {
			System.out.println(a.solution(i));					
		}
	}
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        int[] numbers = {4, 1, 2};
        while (n > 0) {
        	int a = n % 3;
        	n = n / 3;
        	
        	if (a == 0) {
        		n--;
        	}
        	
        	sb.insert(0, numbers[a]);
        	
        }
        
        return sb.toString();
    }
}