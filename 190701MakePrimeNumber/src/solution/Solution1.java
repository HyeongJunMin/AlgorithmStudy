package solution;

public class Solution1 {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0;
        int isPrime = 0;
        // [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
        System.out.println("Hello Java");
        
        for(int i = 0 ; i < nums.length - 2 ; i++) {//1��° ����. �� ���� �� ���� �ݺ�(������2������)
        	for(int j = (i+1) ; j < nums.length - 1 ; j++ ) {//2��° ����. �Ǿ��̶� �ǵڻ��� �� ���� �ݺ�
        		for(int k = (j+1) ; k < nums.length ; k++ ) {
        			temp = nums[i] + nums[j] + nums[k];
        			for(int l = 2 ; l < (temp/2) ; l++) {
        				if(temp % l == 0) {
        					isPrime = 1;
        					break;//�Ҽ��ƴ�
        				}
        			}
        			if(isPrime == 0) {//���ڰ� �Ҽ��̸�?
        				answer ++;
        			}
    				isPrime = 0;
        		}
        	}
        }
        
        return answer;
    }
}
