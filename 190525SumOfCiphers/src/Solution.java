
public class Solution {
	public int solution(int n) {
		int answer = 0;
		String intStr = n+"";
		int strLen = intStr.length();
		
		for( int i = 0 ; i < strLen ; i++) {
			answer += Integer.parseInt(intStr.charAt(i) + ""); 
		}
		

		return answer;
	}
}


/*

�ڸ��� ���ϱ�
���� ����
�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� 
solution �Լ��� ����� �ּ���.
������� N = 123�̸� 
1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

���ѻ���
N�� ���� : 100,000,000 ������ �ڿ���

����� ��
N	answer
123	6
987	24

����� �� ����
����� �� #1
������ ���ÿ� �����ϴ�.

����� �� #2
9 + 8 + 7 = 24�̹Ƿ� 24�� return �ϸ� �˴ϴ�.


*/