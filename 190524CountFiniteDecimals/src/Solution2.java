import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public int solution(int n) {
		int answer = 0;
		
		//n이 될 때 까지 1씩 증가시키면서 계산한다.
		//증가된 값이 이전에 추가되어있던 값으로 나눠진다면? break
		//나눠지지 않는다면? add
		
		List<Integer> arrFin = new ArrayList<>();
		
		arrFin.add(2);

		for(int i = 2 ; i <= n ; i++ ) {
			for(int j = 0 ; j < arrFin.size(); j++) {
				if( ( i % arrFin.get(j)) == 0) {
//					System.out.println(i);
//					System.out.println(arrFin.get(j));
//					System.out.println(arrFin.toString());
					
					break;
				}else if(j == (arrFin.size()-1) ){
					arrFin.add(i);
//					System.out.println("j반복" + j);
					break;
				}
			}
		}
//		System.out.println(arrFin.toString());
		answer = arrFin.size();
		
		return answer ;
	}
}
