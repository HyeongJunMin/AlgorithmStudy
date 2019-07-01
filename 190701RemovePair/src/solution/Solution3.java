package solution;

import java.util.ArrayList;

public class Solution3 {
	public int solution(String s) {
		//문자열을 문자 배열로 변환
		char[] c = s.toCharArray();
		ArrayList<Character> lst = new ArrayList<>();
		
		for(char cc : c) {	//문자를 하나씩 리스트에 삽입
			//리스트의 길이가 2보다 크고 마지막 두 문자가 같은 값이면 두 문자 제거
			Add(lst, cc);
		}
		
		//리스트가 비었다면 짝 제거 완료
		if(lst.isEmpty()) {
			return 1;
		}else {
			return 0;
		}		
	}
	
	public static void Add(ArrayList l, char cc) {
		l.add(cc);
		if(l.size() > 1 && 
				l.get(l.size()-2) == l.get(l.size()-1)) {
			l.remove(l.size()-1);
			l.remove(l.size()-1);
		}
	}
}
