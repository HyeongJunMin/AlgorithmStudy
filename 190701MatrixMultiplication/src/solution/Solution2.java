package solution;

public class Solution2 {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		//결과행렬 초기화
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		//행렬 요소 곱셈
		//결과행렬의 행크기 만큼 반복되며, X행렬의 행을 가리킴
		for(int i = 0 ; i < arr1.length ; i++) {
			//결과행렬의 열크기 만큼 반복되며, Y행렬의 열을 가리킴
			for(int j = 0 ; j < arr2[0].length ; j++) {
				//각 요소를 곱하기 위해 반복되며, X행렬의 열과 Y행렬의 행을 가리킴
				for(int k = 0 ; k < arr1[0].length ; k++) {
					answer[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		return answer;
	}

}
