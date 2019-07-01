package solution;

public class Solution2 {
	public String solution(String s) {
		String answer = "";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		
		boolean isCap = true;
		
		for(int i = 0 ; i < ch.length ; i ++) {
			if(isCap) {
				if(ch[i] >= 65 && ch[i] <= 122)
					ch[i] = (char) (ch[i] - 32);
				isCap = false;
			}else {
				if(ch[i] == ' ') {
					isCap = true;
				}
			}
		}
		
		for(char c : ch) {
			answer += (c)+"";
		}
		
		return answer;
	}
}
