
public class Solution3 {
	//예쁘게 짤 생각 하지 말고 정답 맞출 생각을 하세요!
	
	  public int[] solution(int[] arr) {
	        int[] answer = {};

	        int min = arr[0];

	        //최소값 서치
	        for( int i = 0 ; i < arr.length ; i++) {
	            if (min > arr[i]) {
	                min = arr[i];
	            }
	        }

	        //입력받은 배열 길이가 1이면? -1 반환
	        if (arr.length == 1) {
	            answer = new int[]{-1};
	        } else {
	        	//아니면? 최소값 1개 빼야함
	            answer = new int[arr.length - 1];
	            int i = 0;
	            
	            for (int num : arr) {
	                if (num != min) {
	                    answer[i] = num;
	                    i++;
	                }
	            }
	        }

	        return answer;
	  }
}
