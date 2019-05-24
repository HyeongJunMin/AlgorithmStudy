
public class Solution {
	public String solution(int n) {
		String answer ="";
		
		switch( n % 2 ) {
			//짝수인 경우
			case 0:
				for(int i = 0 ; i < n/2 ; i++) {
					answer += "수박";
				}
				break;
			//홀수인 경우
			case 1:
				for(int i = 0 ; i < (n/2) ; i++) {
					answer += "수박";
				}
				answer += "수";
				break;
		
		
		}
		
		return answer;
	}
}
