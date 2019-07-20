package solution;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		Solution1 s = new Solution1();
		Solution2 s2 = new Solution2();
		
		System.out.println(s2.solution(3));
		System.out.println(s2.solution(5));
		
		int k = 30;
				
		double j = 30.0;
		//�Ϲ��� Fn
		double gnrTerm = ( 1 / (Math.sqrt(5.0)) )
						* ( Math.pow( (( 1+Math.sqrt(5) )/2), j )
								- Math.pow( (( 1-Math.sqrt(5) )/2), j )
								);
		System.out.println(j + "��(�Ϲ���) : " + gnrTerm);
		lst.add(0);
		lst.add(1);
		
		int n = 0;		
		for(int i = 2 ; i < 50 ; i++ ) {
			n = lst.get(i-2) + lst.get(i-1);
			lst.add(n);
		}
		
		//�������� ����
		for(Integer num : lst) {
			System.out.print(num + ", ");
		}
		System.out.println();
		for(Integer num : lst) {
			System.out.print((num%2) + ", ");
		}
		System.out.println();
		for(Integer num : lst) {
			System.out.print((num%3) + ", ");
		}
		System.out.println();
		for(Integer num : lst) {
			System.out.print((num%4) + ", ");
		}
		System.out.println();
		for(Integer num : lst) {
			System.out.print((num%5) + ", ");
		}
		System.out.println();
		for(Integer num : lst) {
			System.out.print((num%1234567) + ", ");
		}
		
		
	}
}
