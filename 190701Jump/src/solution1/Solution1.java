package solution1;

public class Solution1 {
	public int solution( int n ) {
		int ans = 1;	//건전지 사용량 == 점프 거리
		int dst = 1;	//현재까지 온 거리
		int obj = n;	//목표까지 남은 거리
		//초기값은 1점프로 책정
		
		while ( dst < n ) {
			if ((dst) <= (obj - dst)) { // 지금까지 온 거리*2가 남은거리보다 작으면? 순간이동
				obj -= dst; // 남은 거리를 갱신
				dst *= 2;// 현재까지 온 거리를 갱신(누적)
				System.out.println("순이! 남은거리 : " + obj + "  , 온거리 : " + dst);
			} else { // 그게 아니면 점프
				dst++;
				ans++;//점프횟수 +1
				obj--;//남은거리 -1
				System.out.println("점프! 남은거리 : " + obj + "  , 온거리 : " + dst);
			}
		}
		
		
		return ans;
	}
}
