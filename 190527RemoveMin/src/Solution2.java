import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2 {
	public static void main(String[] args) {
		
	}
	
	
	public int[] solution(int[] arr) {
		int[] answer = new int[1];
		int arrLen = arr.length;
		int check = 100;
		int chcNum = 0;
		
		if(arrLen == 1) {
			answer[0] = -1;
		} else {
			List<Integer> arrList = new ArrayList<>();
			for(int i = 0 ; i < arrLen ; i++ ) {
				arrList.add(arr[i]);
				if(arr[i] < check) {
					check = arr[i];
					chcNum = i;
				}
			}
			arrList.remove(chcNum);
			arrLen = arrList.size();
			answer = new int[arrLen];
			for(int i = 0 ; i < arrLen ; i++ ) {
				answer[i] = arrList.get(i);
			}
				
		}
		
		return answer;
	}
}
