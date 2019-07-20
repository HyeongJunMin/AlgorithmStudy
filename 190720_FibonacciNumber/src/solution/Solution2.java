package solution;

public class Solution2 {
	public int solution(int n) {
		int answer = 0;
		long arr[] = new long[n+1];
		
		arr[0] = 0;
		arr[1] = 1;
				
		long k = 0;
		for(int i = 2 ; i <= n ; i++ ) {
			k = arr[i-2] + arr[i-1];
			arr[i] = k % 1234567;
		}
		
		answer = (int)(arr[n] % 1234567);
		
		return answer;
	}
}
