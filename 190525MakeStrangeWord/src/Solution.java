
public class Solution {
	  public String solution(String s) {
	      String answer = "";
	      int strLen = s.length();
	      int w1 = 0;
	      int w2 = 0;
	      while( w1 < strLen) {
	    	  if( s.charAt(w1) == ' ' ) {
	    		  w1++;
	    		  //if(w1 == strLen-1) break;	//마지막 공백문자 X	    		  
	    		  //if(w2 > 0 )					//앞에 이미 문자열이 추가되어있는 상태면? 공백추가
	    		  answer += " ";	//마지막 공백문자도 넣어야되고 중간 공백문자 그대로 다넣어야 맞음...
	    		  					//조건좀 명확히 씁시다 ;; 풀빳따맞아야됨
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

이상한 문자 만들기
문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
각 단어의 짝수번째 알파벳은 대문자로, 
홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, 
solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

입출력 예
s	return
try hello world	TrY HeLlO WoRlD

입출력 예 설명
try hello world는 세 단어 try, hello, world로 구성되어 있습니다. 
각 단어의 짝수번째 문자를 대문자로, 
홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다. 
따라서 TrY HeLlO WoRlD 를 리턴합니다.

*/