package lvl_one;

public class Greedy {
	//https://programmers.co.kr/learn/courses/30/lessons/42862
	/*
	 * 일부 학생이 체육복을 도난당했다. 
	 * 여벌의 체육복이 있는 학생들이 빌려줄 수 있다.
	 * 학생들의 번호는 체격 순으로 매겨져 있어서 바로 앞번호나 바로 뒷번호만 체육복을 빌려줄 수 있다.
	 * 전체 학생의 수 = n
	 * 체육복을 도난당한 학생의 번호 배열 = lost
	 * 여벌의 체육복이 있는 학생의 번호 배열 = reserve
	 * [목표] 체육수업을 들을 수 있는 학생의 최댓값 return
	 * 
	 * 제한사항
	 * -전체 학생의 수는 2~30명
	 * -체육복을 도난당한 학생의 수는 1명 이상 n명 이하이며 중복번호는 없음
	 * -여벌의 체육복이 있는 학생의 수는 1~n명이며 중복 없음
	 * -여벌의 체육복이 있는 학생만이 다른 학생에게 빌려줄 수 있음.
	 * -여벌 체육복을 가져온 학생이 도난 당했을 수도 있읍. 이 학생은 체육복이 하나만 남았기 때문에 빌려주기 불가
	 * 
	 * 입출력 예
	 * n	lost	reserve	return
	 * 5	{2,4}	{1,3,5}	5
	 * 5	{2,4}	{3}		4
	 * 3	{3}		{1}		2
	 */ 
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int getNew = 0;
		int lostLength = lost.length;
		int reserveLength = reserve.length;
		int[] lost1 = lost;
		int[] reserve1 = reserve;
		for (int i = 0; i < lostLength; i++) {
			if(i==0) {
				if( (lost1[i]-1) == reserve[i]) {
        			getNew++;        			//체육복 빌린사람 수 +1
        			reserve1[i]=0;         			//체육복 빌려준놈은 0
        			continue;
				}else if(  (lost1[i]+1) == reserve[i]  ) {
					
				}
					
			}
		}
		// 총 참가 인원 = (전체인원-체육복안가져온놈)+빌린놈
		answer = (n - lostLength) + getNew;
		return answer;
	}
}
//		0101	0010	0001	0000	0000

/*
 * 0001	1110
 * 0010	1101
 * 0011	1100
 * 0100	1011
 * 0101	1010
 * 0110	1001
 * 0111	1000
 * 1000	0111
 * 1001	0110
 * 1010	0101
 * 1011	0100
 * 1100	0011
 * 1101	0010
 * 1110	0001
 * 1111	0000
 * 
 * 
 * 
 * 
 * /**/
