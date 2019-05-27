import java.math.BigInteger;

public class Solution {
	public static void main(String[] args) {
//		System.out.println(Math.pow(999999999, 2));
//		long a = 5000000000L;
//		String long1 = "50000000000000";
//		BigInteger bi = BigInteger.valueOf(a);
//		
//		long b = Long.parseUnsignedLong(long1);
//		System.out.println(a*a);
//		System.out.println(Long.parseUnsignedLong(Long.toUnsignedString((a*a))));
//		System.out.println(Long.parseUnsignedLong(long1) * Long.parseUnsignedLong(long1));
//		System.out.println(bi.multiply(bi));
//		
//		System.out.println(b );
		
		long b = 50000000000L;
		long c = 5000000000L;
		System.out.println("b : " + (b*b));
		System.out.println("c : " + (c*c));
		b = Long.parseUnsignedLong("50000000000");
		String str = Long.toUnsignedString( Long.parseUnsignedLong("50000000000") * Long.parseUnsignedLong("50000000000") );
		System.out.println("b : " + str);
		System.out.println("b : " + Long.parseUnsignedLong(str));

	} 
	
	  public long solution(long n) {
	      long sqrt = (long)Math.sqrt(n);
	      
	      if( Math.pow(sqrt, 2) == n){
	    	  return (long)Math.pow( (sqrt + 1), 2);
	      }
	      
	      
	      return -1;
	  }
}

/*

정수 제곱근 판별
문제 설명
임의의 정수 n에 대해, 
n이 어떤 정수 x의 제곱인지 아닌지 판단하려 합니다.
n이 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
n이 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

제한 사항
n은 1이상, 50000000000000 이하인 정수입니다.

입출력 예
n	return
121	144
3	-1

입출력 예 설명
입출력 예#1
121은 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

입출력 예#2
3은 정수의 제곱이 아니므로, -1을 리턴합니다.


*/