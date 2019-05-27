import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		Solution s = new Solution();
		long dd = 1183372;
		System.out.println(s.solution(dd));
	}
	
	
	public long solution ( long n ) {
		String str = "";
		String[] strArr = Long.toString(n).split("");
		
		List<String> tempList = new ArrayList<String>(Arrays.asList(strArr));
				
		Collections.sort(tempList);
		
		Collections.reverse(tempList);
				
		for(String a : tempList)
			str += a;
		
		return Long.parseLong(str) ;
	}
}
/*

���� ������������ ��ġ�ϱ�
���� ����
�Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

���� ����
n�� 1�̻� 8000000000 ������ �ڿ����Դϴ�.

����� ��
n	return
118372	873211

*/

