import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution1 {
	public static void main(String[] args) {

	}
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
		int cnt = 0;
		int arrLen = arr.length;
				
		List<Integer> answerList = new ArrayList<Integer>();
		
		for(int i : arr)
			answerList.add(i);
		
		Collections.sort(answerList);
		
		for(int i = 0 ; i < arrLen ; i++ ) {
			if(answerList.get(i) == answerList.get(0)) {
				cnt++;
			}
		}
		System.out.println(arrLen - cnt);
		if( (arrLen - cnt) == 1 ) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[arrLen - cnt];
			Collections.reverse(answerList);
			for(int i = 0 ; i < arrLen - cnt ; i++) {
				answer[i] = answerList.get(i);
			}
		}
		
		
		
		return answer;
	}
}

/*

���� ���� �� �����ϱ�

���� ����
������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, 
solution�� �ϼ����ּ���. 
��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

���� ����
arr�� ���� 1 �̻��� �迭�Դϴ�.
�ε��� i, j�� ���� i �� j�̸� arr[i] �� arr[j] �Դϴ�.

����� ��
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
		
	*/	
		
		