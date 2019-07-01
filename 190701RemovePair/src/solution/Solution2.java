package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
	public int solution(String s) {
		int answer = 0;
		int i = 0;
		String[] sArr = s.split("");
		List<String> lst = new LinkedList<String>(Arrays.asList(sArr));
		int len = lst.size();

		while ((len - 1) >= i) {
			System.out.println("문자열 : " + lst.toString() + " ");
			if (lst.get(i).equals(lst.get(i + 1))) {// 앞뒤 문자가 같으면?
				System.out.println(lst.get(i) + "   " + lst.get(i + 1) + " " + i);
				lst.remove(i);
				lst.remove(i);
				i = 0;
				len -= 2;
				if (len <= 1) {
					return 1;
				}
				continue;
			}
			i++;
			if ((i + 1) == len) {
				return 0;
			}
		}
		return answer;
	}
}
