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

���� ������ �Ǻ�
���� ����
������ ���� n�� ����, 
n�� � ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
n�� ���� x�� �����̶�� x+1�� ������ �����ϰ�, 
n�� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

���� ����
n�� 1�̻�, 50000000000000 ������ �����Դϴ�.

����� ��
n	return
121	144
3	-1

����� �� ����
����� ��#1
121�� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.

����� ��#2
3�� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.


*/