
public class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		long sml = 0, big = 0, dst = 0, sum = 0;

		if (a == b) {
			answer = b;
			return answer;
		} else if (a > b) {
			big = a;
			sml = b;
		} else {
			big = b;
			sml = a;
		}

		if( big < 0 && sml < 0 ) {	//두 수 모두 음수
			answer = (  ( (sml * (sml-1)) /2 ) - ( (big * (big + 1))/2 )  ) * -1 ;
		} else if( big > 0 && sml > 0 ) {	//두 수 모두 양수
			answer = (  ( (big * (big+1)) /2 ) - ( (sml * (sml - 1))/2 )  );
		} else {	// big == 양수, sml == 음수
			answer = (  ( (big * (big+1)) /2 ) - ( (sml * (sml - 1))/2 )  );
		}

		return answer;
	}
}
