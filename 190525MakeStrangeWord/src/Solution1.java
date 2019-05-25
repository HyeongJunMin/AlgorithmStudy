
public class Solution1 {
	  public String solution(String s) {
	      String answer = "";
	      String[] answerArr = s.split(" ");
	      int tempLen = answerArr.length;
	      int tempLen2 = 0;
	      
	      
	      for(int i = 0 ; i < tempLen ; i++) {
	    	  tempLen2 = answerArr[i].length();	//length 메소드 중복호출을 막기 위해 int 변수에 저장
	    	  for(int j = 0 ; j < tempLen2 ; j++ ) {	 
	    		  if ( j % 2 == 0) {//짝수번째인 경우
	    			  answer += (char)(answerArr[i].charAt(j)-32);
	    		  }else {
	    			  answer += answerArr[i].charAt(j);
	    		  }
	    	  }
	    	  if( i == tempLen-1) break;	//마지막 단어 뒤에는 공백 없음
	    	  answer += " ";	    	  
	      }
	      
	      return answer;
	  }
}
