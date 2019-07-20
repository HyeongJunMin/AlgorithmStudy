package solution;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arr1 == 3X2, arr2 == 2X2
		int arr1[][] = { {1,4}, {3,2}, {4,1} };
		int arr2[][] = { {3,3}, {3,3} };
		
		//arrX == 2X3, arrY == 3X4
		int arrX[][] = { {1, 2, 3}, {4, 5, 6} };
		int arrY[][] = { {1, 2, 3, 4}, {5, 6, 7, 8},
						{9, 10, 11, 12}, {13, 14, 15, 16} };
		
		Solution2 s = new Solution2();
		
		//int result[][] = s.solution(arrX, arrY);
		int result[][] = s.solution(arr1, arr2);
		
		System.out.println("결과행렬크기\n행 : " + result.length + ", 열 : " + result[0].length );

	}

}
