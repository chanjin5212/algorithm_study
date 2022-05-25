package programmers.p72412;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	
	public static void main(String[] args) {
		
		Solution a = new Solution();
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		System.out.println(a.solution(info, query));
	}
	
	public List<Integer> solution(String[] info, String[] query) {
        List<Integer> answer = new ArrayList<>();
		Map<String, ArrayList<Integer>> map = new HashMap<>();
		
		for (String str : info) {
			String[] in = str.split(" ");
			for (int i=0; i<(1 << 4); i++) {
				StringBuilder sb = new StringBuilder();
				for (int j=0; j<4; j++) {
					if ((i & (1 << j)) > 0) {
						sb.append(in[j]);
					} else {
						sb.append("-");
					}
				}
				map.putIfAbsent(sb.toString(), new ArrayList<Integer>());
				map.get(sb.toString()).add(Integer.parseInt(in[4]));
			}			
			
		}
		
		for (List<Integer> list : map.values()) {
			Collections.sort(list);
		}
		
		for (String str : query) {
			String[] qu = str.split(" ");
			List<Integer> list = map.get(qu[0] + qu[2] + qu[4] + qu[6]);
			if (list != null) {
				answer.add(list.size() - lowerbound(list, Integer.parseInt(qu[7])));
			} else {
				answer.add(0);
			}
			
		}
		
		return answer;
    }

	private int lowerbound(List<Integer> list, int target) {
		
		int low = 0;
		int high = list.size();
		
		while (low < high) {
			int mid = (low + high) / 2;
			
			if (list.get(mid) >= target) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return high;
	}


}