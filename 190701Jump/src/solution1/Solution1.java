package solution1;

public class Solution1 {
	public int solution( int n ) {
		int ans = 1;	//������ ��뷮 == ���� �Ÿ�
		int dst = 1;	//������� �� �Ÿ�
		int obj = n;	//��ǥ���� ���� �Ÿ�
		//�ʱⰪ�� 1������ å��
		
		while ( dst < n ) {
			if ((dst) <= (obj - dst)) { // ���ݱ��� �� �Ÿ�*2�� �����Ÿ����� ������? �����̵�
				obj -= dst; // ���� �Ÿ��� ����
				dst *= 2;// ������� �� �Ÿ��� ����(����)
				System.out.println("����! �����Ÿ� : " + obj + "  , �°Ÿ� : " + dst);
			} else { // �װ� �ƴϸ� ����
				dst++;
				ans++;//����Ƚ�� +1
				obj--;//�����Ÿ� -1
				System.out.println("����! �����Ÿ� : " + obj + "  , �°Ÿ� : " + dst);
			}
		}
		
		
		return ans;
	}
}
