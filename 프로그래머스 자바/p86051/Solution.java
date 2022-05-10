package programmers.p86051;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(a.solution(numbers));
		
	}
	
    public int solution(int[] numbers) {
        
        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        
        int sum = 0;
        for (int i=0; i<numList.length; i++) {
        	boolean tf = false;
        	for (int j=0; j<numbers.length; j++) {
        		if (numbers[j] == numList[i]) {
        			tf = true;
        		}
        	}
        	if (!tf) {
        		sum += numList[i];
        	}
        }
        
        return sum;
    }
}
