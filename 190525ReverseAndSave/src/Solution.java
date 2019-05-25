
public class Solution {
	  public int[] solution(long n) {
	      String str = Long.toString(n);
	      int strLen = str.length();
	      int[] answer = new int[strLen];
	      
	      for( int i = strLen ; i > 0 ; i-- ) {
	    	   answer[strLen-i] = Integer.parseInt(str.charAt(i-1)+"");
	      }
	      
	      return answer;
	  }
}



/*

�ڿ��� ������ �迭�� �����
���� ����
�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. 
������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.

���� ����
n�� 10,000,000,000������ �ڿ����Դϴ�.

����� ��
n	return
12345	[5,4,3,2,1]
		
		
		
*/
		