
public class Solution1 {
	public String soulution(String[] seoul) {
		String answer = "";
		String kim = "Kim";
		int strLen = seoul.length;
		
		for(int i = 0 ; i < strLen ; i++ ) {
			if( kim.equals(seoul[i]) ) {
				answer = "김서방은 " + i+"에 있다";
				break;
			}
		}
		
		
		return answer;
	}
}
