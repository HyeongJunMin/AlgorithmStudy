
public class Solution1 {
	public String solution(String phone_number) {
		String answer = "";
		int strLen = phone_number.length();
		for (int i = 0; i < strLen; i++) {
			if (i < (strLen - 4)) {
				answer += "*";
			} else {
				answer += phone_number.charAt(i) + "";
			}
		}
		return answer;
	}
}
