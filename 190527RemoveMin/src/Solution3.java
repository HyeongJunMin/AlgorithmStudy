
public class Solution3 {
	//���ڰ� © ���� ���� ���� ���� ���� ������ �ϼ���!
	
	  public int[] solution(int[] arr) {
	        int[] answer = {};

	        int min = arr[0];

	        //�ּҰ� ��ġ
	        for( int i = 0 ; i < arr.length ; i++) {
	            if (min > arr[i]) {
	                min = arr[i];
	            }
	        }

	        //�Է¹��� �迭 ���̰� 1�̸�? -1 ��ȯ
	        if (arr.length == 1) {
	            answer = new int[]{-1};
	        } else {
	        	//�ƴϸ�? �ּҰ� 1�� ������
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
