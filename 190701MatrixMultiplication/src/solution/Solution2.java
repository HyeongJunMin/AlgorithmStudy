package solution;

public class Solution2 {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		//������ �ʱ�ȭ
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		//��� ��� ����
		//�������� ��ũ�� ��ŭ �ݺ��Ǹ�, X����� ���� ����Ŵ
		for(int i = 0 ; i < arr1.length ; i++) {
			//�������� ��ũ�� ��ŭ �ݺ��Ǹ�, Y����� ���� ����Ŵ
			for(int j = 0 ; j < arr2[0].length ; j++) {
				//�� ��Ҹ� ���ϱ� ���� �ݺ��Ǹ�, X����� ���� Y����� ���� ����Ŵ
				for(int k = 0 ; k < arr1[0].length ; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		return answer;
	}

}
