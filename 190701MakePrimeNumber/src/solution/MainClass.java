package solution;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution1 s = new Solution1();
		int[] nums = {1, 2, 3, 4};
		int result = s.solution(nums);
		System.out.println("1,2,3,4 : " + result);
		
		int[] nums2 = {1, 2, 7, 6, 4};
		result = s.solution(nums2);
		System.out.println("1,2,7,6,4 : " + result);
	}

}
