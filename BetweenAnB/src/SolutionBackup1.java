
public class SolutionBackup1 {

		  public long solution(int a, int b) {
			      long answer = 0;
			      int sml = 0, big = 0, dst = 0, sum = 0;
			      
			      
			      if( a >= b ) {
			    	  big = a;
			    	  sml = b;
			      } else if( a == b){
			    	  return b;
			      } else {
			    	  big = b;
			    	  sml = a;
			      }
			      
			      if( big >= 0 && sml >= 0) {
			    	  dst = big - sml;
			      } else if( big < 0 && sml >= 0 ) {
			    	  dst = (big * -1) + sml;
			      } else if( big >= 0 && sml < 0 ) {
			    	  dst = big + ( sml * -1 );
			      } else {
			    	  dst = (big + sml) * -1 ;
			      }
			      
			      for(int i = 0 ; i < dst + 1 ; i++ ) {
			    	  sum += sml++;
			      }
			    	
			      answer = sum;
			      
			      return answer;
		  }
		
}
