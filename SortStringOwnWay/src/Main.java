import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알고리즘 공부 2019-05-17");
		System.out.println((int)'e');
		System.out.println((int)'u');
		System.out.println((int)'A');
		
		String[] a = {"abce", "abcd", "cdx"};
		int b = 2;
		String[] c;
		
		Solution s = new Solution();
		c = s.solution(a, b);
		
		for(String df : c)
			System.out.println(df);
	}

}
