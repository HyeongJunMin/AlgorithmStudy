
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start = System.currentTimeMillis();
		
		long b = 1;
		long t = 99999999;
		long sum = 0;
//		for(long i = 0; i < t ; i++) {
//			sum += b++;
//		}
		sum = ( t * (t + 1 ) ) / 2 ;
		System.out.println(sum);
		
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + ( end - start ) / 1000.0 + "초");
	}

}
