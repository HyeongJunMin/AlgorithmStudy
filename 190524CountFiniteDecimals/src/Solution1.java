
public class Solution1 {
	  public int solution(int n) {
	      int answer = 0;
	      long cnt = 1;
	      long limit = n;
	      
	      		for( long i = 2 ; i <= limit ; i++) {
				for(long j = 2 ; j < i ; j++) {
					if( i % j == 0 ) {
						cnt++;
						break;
					}
						
				}
			}      
	      answer = (int)(limit-cnt);
	      return answer;
	  }
}
