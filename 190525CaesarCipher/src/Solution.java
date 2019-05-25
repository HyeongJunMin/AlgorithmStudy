
public class Solution {
	public String solution(String s, int n) {
		String answer = "";
		int strLen = s.length();
		char chTemp = '1';
		
		for ( int i = 0 ; i < strLen ; i++ ) {
			chTemp = s.charAt(i);
			//문자가 공백이면?
			if( chTemp == ' ') {
				answer += " ";
				
				//문자가 소문자면?  ( (소문자+이동숫자)-97 ) %26 +97
			}else if(chTemp >= 'a') {
				answer += (char)( ( (chTemp + n) -97 ) % 26 + 97 ) + "";
				
				//문자가 대문자이면?
			} else {
				answer += (char)( ( ((chTemp + n) -65 )% 26 ) + 65 ) + "";
			}
		}		
		
		return answer;
	}
}
