package solution;

public class Solution1 {
	  public int solution(int n) {
	      
		  //피보나치 수열의 n번째 일반항
	      double gnrTerm = ( 1 / (Math.sqrt(5.0)) )
					* ( Math.pow( (( 1+Math.sqrt(5) )/2), n )
							- Math.pow( (( 1-Math.sqrt(5) )/2), n )
							);	      
	      
	      //형변환
	      
	      
	      //n번째 일반항을 1234567로 나눈 나머지	      
	      return ( (int)Math.round(gnrTerm) ) % 1234567;
	  }
}
