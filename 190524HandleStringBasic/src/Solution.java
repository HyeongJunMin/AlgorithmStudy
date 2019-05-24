public class Solution {
	public boolean solution(String s) {
		boolean answer = true;
		int strLen = s.length();
		
		switch(strLen) {
		case 4:
		case 6:
			for(int i = 0 ; i < strLen ; i++ ) {
				if( s.charAt(i) < '0' || s.charAt(i) > '9' ) {
					answer = false;
					break;
				}
			}
			break;
		default :
			answer = false;
			break;
		}	
			
		
		return answer;
	}
}
