package solution;

public class Solution1 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ ) {
				for( int l = 0 ; l < arr2.length ; l++ ) {
					System.out.println("i:"+i + " j:" + j + " l:" + l);
					answer[i][l] += (arr1[i][j] * arr2[j][l]);
					System.out.println("i:"+i + " j:" + j + " l:" + l);
				}
			}
		}
		
		return answer;
	}
}
