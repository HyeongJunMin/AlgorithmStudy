
public class Solution {
	  public String solution(String s) {
	      String answer = "";
	      int strLen = s.length();
	      int w1 = 0;
	      int w2 = 0;
	      while( w1 < strLen) {
	    	  if( s.charAt(w1) == ' ' ) {
	    		  w1++;
	    		  //if(w1 == strLen-1) break;	//������ ���鹮�� X	    		  
	    		  //if(w2 > 0 )					//�տ� �̹� ���ڿ��� �߰��Ǿ��ִ� ���¸�? �����߰�
	    		  answer += " ";	//������ ���鹮�ڵ� �־�ߵǰ� �߰� ���鹮�� �״�� �ٳ־�� ����...
	    		  					//������ ��Ȯ�� ���ô� ;; Ǯ�����¾ƾߵ�
	    		  w2 = 0;	    		  
	    	  } else {
	    		  if( w2 % 2 == 0 ) {
	    			  answer += (char)(s.toUpperCase().charAt(w1));
	    		  } else {
	    			  answer += s.toLowerCase().charAt(w1);
	    		  }
	    		  
	    		w2++;
	    		w1++;
	    	  }	    	  
	      }
	      
	      return answer;
	  }
}

/*

�̻��� ���� �����
���� ����
���ڿ� s�� �� �� �̻��� �ܾ�� �����Ǿ� �ֽ��ϴ�. 
�� �ܾ�� �ϳ� �̻��� ���鹮�ڷ� ���еǾ� �ֽ��ϴ�. 
�� �ܾ��� ¦����° ���ĺ��� �빮�ڷ�, 
Ȧ����° ���ĺ��� �ҹ��ڷ� �ٲ� ���ڿ��� �����ϴ� �Լ�, 
solution�� �ϼ��ϼ���.

���� ����
���ڿ� ��ü�� ¦/Ȧ�� �ε����� �ƴ϶�, �ܾ�(������ ����)���� ¦/Ȧ�� �ε����� �Ǵ��ؾ��մϴ�.
ù ��° ���ڴ� 0��° �ε����� ���� ¦����° ���ĺ����� ó���ؾ� �մϴ�.

����� ��
s	return
try hello world	TrY HeLlO WoRlD

����� �� ����
try hello world�� �� �ܾ� try, hello, world�� �����Ǿ� �ֽ��ϴ�. 
�� �ܾ��� ¦����° ���ڸ� �빮�ڷ�, 
Ȧ����° ���ڸ� �ҹ��ڷ� �ٲٸ� TrY, HeLlO, WoRlD�Դϴ�. 
���� TrY HeLlO WoRlD �� �����մϴ�.

*/