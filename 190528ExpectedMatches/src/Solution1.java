
public class Solution1 {
	public int solution(int n, int a, int b) {
		int answer = 0;
		int userA = a;
		int userB = b;
		
		while(userA > 0) {
			answer++;
			userA = (userA + 1)/2;
			userB = (userB + 1)/2;
			if(userA == userB)
				return answer;
		}

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("Hello Java");

		return answer;
	}
}
