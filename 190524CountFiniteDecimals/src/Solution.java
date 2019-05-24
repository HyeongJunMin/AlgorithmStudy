public class Solution {
	
	int numberOfPrime(int n) {
		int answer = 0;
				
		//판단값 선언
		boolean isPrime = true;
		
		//i는 2부터 n까지 1씩 증가한다.
		for( int i = 2 ; i <= n ; i++ ) {
			
			//판단값 초기화
			isPrime = true;
			
			//j는 2^2부터 i까지 1씩 증가한다.
			//2^2, 3^3, 4^4, 5^5, 6^6 ...
			for( int j = 2 ; j * j <= i ; j++ ) {
				
				//i를 j로 나누었을 때, 나누어 떨어지면? 판단값을 false로 변경하고 반복 중단
				//false인 경우는 언제인가요?
				//i=4, j=2 
				//i=6, j=2
				//i=8, j=2  
				//i=9, j=2,3 j*j = 4
				//왜 j를 제곱값으로 쓰나요? > j가 약수가 아니라면 j*j도 약수가 아니기 때문에
				if( i % j == 0 ) {
					isPrime = false;
					break;
				}
			}
			//판단값이 true인 경우? i는 소수이므로 소수 개수 +1
			if( isPrime ) {
				answer++;
			}
		}
		
		
		return answer ;
	}
}
