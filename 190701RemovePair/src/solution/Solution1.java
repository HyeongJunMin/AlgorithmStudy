package solution;

public class Solution1 {
	public int solution(String s) {
		int answer = 0;

		// [����] ��ư�� ������ ��� ���� �� �� �ֽ��ϴ�.
		System.out.println("Hello Java");
		
		int len = s.length();
		int i = -1;
		while(i < len) {
			i++;
			System.out.println(i+"��°�ݺ�, ���ڿ� : " + s + "  ���� : " + len);
			if(s.charAt(i) == s.charAt(i+1) ) {	//���ӵǴ� ���ڰ� ������?
				System.out.println(s.charAt(i) + "" + s.charAt(i));
				s = s.replaceAll(s.charAt(i) + "" + s.charAt(i), "");//�ش� ���� �����ϰ�
				i=-1;//ó������ �ݺ�
				len = s.length();
				if(s.length() <= 0){
					answer=1;
					break;
				}
			}else if( i == (len-2) ){
				System.out.println("�׸�!");
				break;
			}			
		}
		return answer;
	}
}
