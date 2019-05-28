import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		Solution2 s2 = new Solution2();
		String[] strA = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		String[] strC = {"hello", "one", "even", "never", "now", "world", "draw"};
		int[] b = s.solution(3, strA);
		int[] c = s2.solution(3, strC);
		
		System.out.println("틀린자, 반복회차");
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}
}
