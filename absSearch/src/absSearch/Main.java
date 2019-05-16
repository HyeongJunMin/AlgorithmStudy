package absSearch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] answers = {1,2,3,4,5};
		
		int[] answer = s.solution(answers);

		for( int i : answer) {
			System.out.println(i);
		}
	}

}
