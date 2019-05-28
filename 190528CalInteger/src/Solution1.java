
public class Solution1 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long a = x;
		long b = n;
		
		for( int i = 0 ; i < b ; i++ ) {
			answer[i] = a + (a * i);
		}
		
		return answer;
	}
}
