package solution;

public class Solution1 {
	public int solution(String s) {
		int answer = 0;

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("Hello Java");
		
		int len = s.length();
		int i = -1;
		while(i < len) {
			i++;
			System.out.println(i+"번째반복, 문자열 : " + s + "  길이 : " + len);
			if(s.charAt(i) == s.charAt(i+1) ) {	//연속되는 문자가 있으면?
				System.out.println(s.charAt(i) + "" + s.charAt(i));
				s = s.replaceAll(s.charAt(i) + "" + s.charAt(i), "");//해당 문자 삭제하고
				i=-1;//처음부터 반복
				len = s.length();
				if(s.length() <= 0){
					answer=1;
					break;
				}
			}else if( i == (len-2) ){
				System.out.println("그만!");
				break;
			}			
		}
		return answer;
	}
}
