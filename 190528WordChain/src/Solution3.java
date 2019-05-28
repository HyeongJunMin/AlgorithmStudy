import java.util.HashSet;
import java.util.Set;

public class Solution3 {
	 public int[] solution(int n, String[] words) {
	        int[] answer = new int[2];
	        Set<String> st = new HashSet<>();
	        st.add(words[0]);
	        int w = 1;
	        while(w < 99999) {
	        	System.out.println(w);
	        	if(words[w-1].charAt(words[w-1].length()-1) != words[w].charAt(0)) {
	        		answer[0] = w%n + 1;
	        		answer[1] = w/n + 1;
	        		break;
	        	}
	        	System.out.print("비교ok  ");
	        	if( st.add(words[w])) {
	        		
	        	}else {//add실패하면?
	        		answer[0] = w%n + 1;
	        		answer[1] = w/n + 1;
	        		break;
	        	}
	        	System.out.print("addOK  ");
	        	w++;
	        	if(w == words.length) {//모두 성공하면
	        		answer[0] = 0;
	        		answer[1] = 0;
	        		break;
	        	}
	        	
	        }
	        
	        return answer;
	    }
}
