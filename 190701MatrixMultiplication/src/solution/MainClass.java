package solution;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][] = { {1,4}, {3,2}, {4,1} };
		int arr2[][] = { {3,3}, {3,3} };
		
		Solution1 s = new Solution1();
		
		int result[][] = s.solution(arr1, arr2);
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

}
