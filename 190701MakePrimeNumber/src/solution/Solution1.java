package solution;

public class Solution1 {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0;
        int isPrime = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for(int i = 0 ; i < nums.length - 2 ; i++) {//1번째 숫자. 각 숫자 한 번씩 반복(마지막2개빼고)
        	for(int j = (i+1) ; j < nums.length - 1 ; j++ ) {//2번째 숫자. 맨앞이랑 맨뒤빼고 한 번씩 반복
        		for(int k = (j+1) ; k < nums.length ; k++ ) {
        			temp = nums[i] + nums[j] + nums[k];
        			for(int l = 2 ; l < (temp/2) ; l++) {
        				if(temp % l == 0) {
        					isPrime = 1;
        					break;//소수아님
        				}
        			}
        			if(isPrime == 0) {//숫자가 소수이면?
        				answer ++;
        			}
    				isPrime = 0;
        		}
        	}
        }
        
        return answer;
    }
}
