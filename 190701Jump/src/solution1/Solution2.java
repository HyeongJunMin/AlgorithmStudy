package solution1;

public class Solution2 {
	public int solution( int n ) {
		int ans = 1;	//������ ��뷮 == ���� �Ÿ�
		int dst = n;	//�����Ÿ�
		
		while(dst > 1) {	//�����Ÿ��� 1���� ũ�� �ݺ�, 1�Ǹ� ��
			if( (dst % 2) == 0 ) {	//2�� ������ ��������?
				dst /= 2;
			}else {	//�ƴϸ�?
				dst--;
				ans++;
			}
		}
		
		return ans;
	}
}
