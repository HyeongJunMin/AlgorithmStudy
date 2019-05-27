
public class Solution2 {
	public int solution(long num) {
		int cnt = 0;
		
		for( int i = 0 ; i < 500 ; i++ ) {
			if(num == 1) {
				break;
			}
			
			if( num % 2 == 0 ) {
				num = num/2;
			}else {
				num = (num*3) + 1;
			}
			cnt++;
		}
		
		if(cnt >= 500)
			cnt = -1;
		
		return cnt;
	}
}
