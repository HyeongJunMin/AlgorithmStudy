package solution;

import java.util.ArrayList;

public class Solution3 {
	public int solution(String s) {
		//���ڿ��� ���� �迭�� ��ȯ
		char[] c = s.toCharArray();
		ArrayList<Character> lst = new ArrayList<>();
		
		for(char cc : c) {	//���ڸ� �ϳ��� ����Ʈ�� ����
			//����Ʈ�� ���̰� 2���� ũ�� ������ �� ���ڰ� ���� ���̸� �� ���� ����
			Add(lst, cc);
		}
		
		//����Ʈ�� ����ٸ� ¦ ���� �Ϸ�
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
