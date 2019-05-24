
public class Solution3 {
	public int solution(int n) {
		int answer = 0;
		
		//n이 될 때 까지 1씩 증가시키면서 계산한다.
		//증가된 값이 이전에 추가되어있던 값으로 나눠진다면? break
		//나눠지지 않는다면? add
		
		boolean isPrime = true;
		
		for( int i = 2 ; i <= n ; i++ ) {
			
			//
			isPrime = true;
			for( int j = 2 ; j * j <= i ; j++ ) {
				if( i % j == 0 ) {
					isPrime = false;
					break;
				}
			}
			
			if( isPrime ) {
				answer++;
			}
		}
		
		
		return answer ;
	}
}
