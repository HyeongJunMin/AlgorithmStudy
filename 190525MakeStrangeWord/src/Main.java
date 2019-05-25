import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String str ="hh hhh      hhh";
		
		String[] strArr = str.split(" ");
		System.out.println(Arrays.toString(strArr));
		System.out.println((int)'A' + " " + (int)'a');		
		System.out.println();
		
		Solution s = new Solution();
		System.out.println(s.solution("try hello    world"));
	}
}
