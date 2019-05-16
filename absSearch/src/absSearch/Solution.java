package absSearch;

public class Solution {
    public int[] solution(int[] answers) {
		int[] answer = {};
				
		// 수포자 123 배열 초기화
		int arrLength = answers.length;
		// 수포자 123 답안 배열 선언
		int[] ptt1 = new int[arrLength];
		int[] ptt2 = new int[arrLength];
		int[] ptt3 = new int[arrLength];
		int[] ptt3Num = {3,1,2,4,5};
    	int i = 0;
		int chc = 1;
		int chc3 = 3;
		int chcNum = ( ( arrLength % 2 ) == 0 ) ? 1 : 0 ; //정답 배열 길이 짝-홀 구분
        for(i = 0; i < arrLength ; i++) {
        	ptt1[i] = chc++;
        	if(chc == 6)
        		chc = 1 ;
        }	//수포자 13 답안 배열 초기화
        
        chc = 1 ;
        int chc2=0;
        ptt2[0]=2;
        switch(chcNum) {
        case 0:	//길이가 짝수인 경우
        	for(i = 1; i < arrLength ; i = i + 2 ) {
        		ptt3[i-1]=ptt3Num[chc2];
        		ptt3[i]=ptt3Num[chc2++];
        		if(chc2==5)
        			chc2=0;
        		switch(chc) {
        		case 1 :	case 3 :	case 4 :	case 5 :
        		ptt2[i] = chc++;
        		ptt2[i+1] = 2;
        		break;
        		case 2 :
        		break;        		
        		}
        		if(chc == 6)
        			chc=1;
        		if(chc == 2)
        			chc=3;        		
        	}
        	ptt3[arrLength-1]=ptt3Num[chc2];
        	break;
        case 1:	//길이가 홀수인 경우
        	for(i = 1 ; i < arrLength-1 ; i = i + 2 ) {
        		ptt3[i-1]=ptt3Num[chc2];
        		ptt3[i]=ptt3Num[chc2++];
        		if(chc2==5)
        			chc2=0;
        		switch(chc) {
        		case 1 :	case 3 :	case 4 :	case 5 :
        		ptt2[i] = chc++;
        		ptt2[i+1] = 2;
        		break;
        		case 2 :
        		break;        		
        		}
        		if(chc == 6)
        			chc=1;
        		if(chc == 2)
        			chc=3;
        	}
        	ptt3[i-1]=ptt3Num[chc2];
    		ptt3[i]=ptt3Num[chc2++];
        	ptt2[arrLength-1]=chc;
        	break;
        }        
		
		//	수포자 123 정답 수 계산
        int crr[] = {0, 0, 0};
		int crri=0;
		for(int k : answers) {
			if(ptt1[crri] == k)
				crr[0]++;
			if(ptt2[crri] == k)
				crr[1]++;
			if(ptt2[crri] == k)
				crr[2]++;
			crri++;
		}
		int crrLen=3;
		for(int k : crr)
			if(k == 0) 
				crrLen--;
		
				
		System.out.println("crrLen : "+crrLen);
		
		answer = new int[crrLen];
		for( int k = 0 ; k < crrLen ; k++ ) {
			answer[k] = crr[k];
		}
		System.out.println(answer[0]);
		for(int l : ptt1)
			System.out.println(l);
		int temp=0;
		
		switch(crrLen) {
		case 1:
			answer[0]=1;
			break;
		case 2:
			if(answer[0] < answer[1]) {
				answer[0]=1;
				answer[1]=2;
				answer[2]=3;
				temp = answer[0];
				answer[0] = answer[1];
				answer[1] = temp;
			}
			break;
		case 3:
			if(answer[0] < answer[1]) {
				temp = answer[0];
				answer[0] = answer[1];
				answer[1] = temp;
			} else if(answer[0] < answer[2]) {
				temp = answer[0];
				answer[0] = answer[2];
				answer[2] = temp;				
			}
			if(answer[1] < answer[2]) {
				temp = answer[1];
				answer[1] = answer[2];
				answer[2] = temp;				
			}
			break;
		}
		System.out.println("crrLen : "+crrLen);
		
		
        return answer;
    }
}
/*
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 
수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]

입출력 예 설명
입출력 예 #1
수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2
모든 사람이 2문제씩을 맞췄습니다.
/**/