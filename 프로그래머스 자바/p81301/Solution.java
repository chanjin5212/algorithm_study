package programmers.p81301;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		String s = "one4seveneight";
		System.out.println(a.solution(s));
		
	}
    public int solution(String s) {
        int answer = 0;
        
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<num.length; i++) {
        	s = s.replaceAll(str[i], num[i]);
        }
        answer = Integer.parseInt(s);
        
        return answer;
    }
}