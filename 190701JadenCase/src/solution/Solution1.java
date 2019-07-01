package solution;

public class Solution1 {
	public String solution(String s) {
		String answer = "";

		int isCap = 1;
		for(int i = 0 ; i < s.length() ; i++) {
			if( isCap == 1) {
				answer += (s.toUpperCase().charAt(i) + "");
				isCap = 0;
			}else {
				answer += s.toLowerCase().charAt(i) + "" ;
				if(s.charAt(i) == ' ') {
					
					isCap = 1;
				}
			}
		}		
		return answer;
	}
}
