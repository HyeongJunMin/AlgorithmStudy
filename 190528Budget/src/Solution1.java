import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
	public int solution(int[] d, int budget) {
		int answer = 0;
		int sum = 0;
		int index = 1;
		
		List<Integer> lst = Arrays.stream(d).boxed().collect(Collectors.toList());
		Collections.sort(lst);
		Iterator itr = lst.iterator();
		
		while( itr.hasNext() ) {
			sum += (int)itr.next();
			if(sum > budget)
				return index;
			index++;
		}		
		
		return answer;
	}
}
