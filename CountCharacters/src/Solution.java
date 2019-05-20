
public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        int strLen = str.length;
        int cntP=0, cntY=0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for(int i = 0 ; i < strLen ; i++ ) {
        	switch(str[i]) {
        	case 'p':
        	case 'P':
        		cntP++;
        		break;
        	case 'y':
        	case 'Y':
        		cntY++;
        		break;
        	}        	
        }
        
        if(cntP == cntY) {
        	return true;
        } else {
        	return false;
        }        
    }
}
