
public class Solution1 {
	  public String solution(String s) {
	      String answer = "";
	      String[] answerArr = s.split(" ");
	      int tempLen = answerArr.length;
	      int tempLen2 = 0;
	      
	      
	      for(int i = 0 ; i < tempLen ; i++) {
	    	  tempLen2 = answerArr[i].length();	//length �޼ҵ� �ߺ�ȣ���� ���� ���� int ������ ����
	    	  for(int j = 0 ; j < tempLen2 ; j++ ) {	 
	    		  if ( j % 2 == 0) {//¦����°�� ���
	    			  answer += (char)(answerArr[i].charAt(j)-32);
	    		  }else {
	    			  answer += answerArr[i].charAt(j);
	    		  }
	    	  }
	    	  if( i == tempLen-1) break;	//������ �ܾ� �ڿ��� ���� ����
	    	  answer += " ";	    	  
	      }
	      
	      return answer;
	  }
}
