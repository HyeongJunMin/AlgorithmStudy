package solution;

public class Solution1 {
	  public int solution(int n) {
	      
		  //�Ǻ���ġ ������ n��° �Ϲ���
	      double gnrTerm = ( 1 / (Math.sqrt(5.0)) )
					* ( Math.pow( (( 1+Math.sqrt(5) )/2), n )
							- Math.pow( (( 1-Math.sqrt(5) )/2), n )
							);	      
	      
	      //����ȯ
	      
	      
	      //n��° �Ϲ����� 1234567�� ���� ������	      
	      return ( (int)Math.round(gnrTerm) ) % 1234567;
	  }
}
