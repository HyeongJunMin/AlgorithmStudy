import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int wordLen = words.length;

        //중복을 검사할 해시셋 선언
        Set<String> strSet = new HashSet<>();
        
        String[] words2 = new String[wordLen+2];
        words2[words2.length-1] = " ";
        words2[words2.length-2] = " ";
        for(int i = 0 ; i < wordLen ; i++) {
        	words2[i] = words[i];
        }//용을쓰고 ㅇㅣ루어낸 초기화
        
        for ( int i = 0 ; i < wordLen+2 ; i++) {
        	System.out.println("i : " + i + "\t wordLen : " + wordLen);
        	
        	if(wordLen == i ) {	//마지막 요소를 검사하는 경우
        		answer[0] = 0; answer[1] = 0; break;}
        	
        	//끝말잇기에 실패한 경우
        	if( words[i].charAt(words2[i].length()-1) != words2[i+1].charAt(0)) {
        		i++;
        		System.out.println("말이안맞음. 틀린순번:"+i);
        		break;
        	}
        	
        	//중복검사에 걸린 경우
        	if( strSet.add(words[i]) == false ) {
        		System.out.println("틀림");
        		break;
        	}
        	
        }
        

        return answer;
    }
}
