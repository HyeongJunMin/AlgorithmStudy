package solution;

public class Solution1 {
	public int solution(int[] arr) {
		int answer = 1;
		int[] indv = new int[100]; //���� ���μ����� ���
		int[] result = new int[100];	// ��Ż ���μ����� ���
		
		for(int i = 0 ; i < 100; i++) {
			result[i] = 0;
		}
		
		for(int i : arr) {//�� ���� �� ���μ�����
			int n = i;//��
			int j = 2;//����
			
			while(n > 1) {
				if( (n%j) == 0) {//i�� j�� ������ ��������
					System.out.println("n:" + n + "  j:" + j);
					indv[j]++;	//j ���� +1
					System.out.println("indv[" + j + "] : " +indv[j]);
					n /= j;
				}else {//����������� ������
					j++;
				}
			}
			
			for(int k = 0 ; k < 100 ; k++) {
				System.out.print(k + ": " + indv[k] + "  ");
				if( result[k] < indv[k] ) {//�� �� �� �ִ����� ����
					result[k] = indv[k];
					System.out.print("k: " + indv[k]);
				}
				indv[k] = 0;
			}
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			if(result[i] > 0) {
				System.out.print(result[i] + " ");
				answer *= (int)Math.pow(i, result[i]);
			}
		}
		
		
		return answer;
	}
}
