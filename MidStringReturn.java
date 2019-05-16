package lvl_one;

public class MidStringReturn {
	//단어 s의 가운데 글자를 반환하는 함수 코딩
	//단어의 길이가 짝수라면 가운데 두 글자를 반환
	public String soultion(String s) {
		int sLen = s.length();
		String answer = "";
		if( (sLen%2) == 0)
			answer = String.valueOf(( s.charAt( ( sLen/2 ) -1) )) + String.valueOf(( s.charAt( ( sLen/2 ) ) ));
		else
			answer = String.valueOf(( s.charAt( ( sLen/2 ) ) ));
		
		return answer;
	}
}
