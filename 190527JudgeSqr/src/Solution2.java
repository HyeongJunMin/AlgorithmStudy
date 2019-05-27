import java.math.BigInteger;

public class Solution2 {
	// BigInteger È°¿ë

	public BigInteger solution(long n) {
		BigInteger answer = BigInteger.valueOf(-1);

		for (long i = 2; i < BigInteger.valueOf(n).longValue(); i++) {
			if (BigInteger.valueOf(n).equals(BigInteger.valueOf(i).multiply(BigInteger.valueOf(i)))) {
				answer = BigInteger.valueOf(i + 1).multiply(BigInteger.valueOf(i + 1));
				break;
			}
		}

		return answer;
	}
}
