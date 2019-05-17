
public class Solution_Backup1 {
	public int[] solution(int []arr) {
        int[] answer = new int[111];
        int[] arrNew = arr;
        int arrLen = arrNew.length;
        int i = 0;
        int cnt = 1;
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        answer[0] = arrNew[0];	//배열의 index 0 값은 고정
        for(i = 1 ; i < arrLen ; i++ ) {
        	if(arrNew[i] != arrNew[i-1]) {	//	입력받은 배열의[i]값이 answer배열의 [i-1]값과 같지 않으면 숫자 추가
        		answer[cnt] = arrNew[i];
        		cnt++;        		
        	}        		
        }
        
        int[] answer2 = new int[cnt];
        
        for(i = 0 ; i < cnt ; i++) {
        	answer2[i] = answer[i];
        }
        
        
        return answer2;
	}
}
