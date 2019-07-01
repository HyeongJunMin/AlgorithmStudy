package solution;

public class Solution1 {
	public int solution(int[] arr) {
		int answer = 1;
		int[] indv = new int[100]; //개별 소인수분해 결과
		int[] result = new int[100];	// 토탈 소인수분해 결과
		
		for(int i = 0 ; i < 100; i++) {
			result[i] = 0;
		}
		
		for(int i : arr) {//각 원소 별 소인수분해
			int n = i;//밑
			int j = 2;//지수
			
			while(n > 1) {
				if( (n%j) == 0) {//i가 j로 나누어 떨어지면
					System.out.println("n:" + n + "  j:" + j);
					indv[j]++;	//j 지수 +1
					System.out.println("indv[" + j + "] : " +indv[j]);
					n /= j;
				}else {//나누어떨어지지 않으면
					j++;
				}
			}
			
			for(int k = 0 ; k < 100 ; k++) {
				System.out.print(k + ": " + indv[k] + "  ");
				if( result[k] < indv[k] ) {//각 밑 별 최대지수 저장
					result[k] = indv[k];
					System.out.print("k: " + indv[k]);
				}
				indv[k] = 0;
			}
		}
		
		for(int i = 0 ; i < 100 ; i++) {
			if(result[i] > 0) {
				System.out.print(result[i] + " ");
				answer *= (int)Math.pow(i, result[i]);
			}
		}
		
		
		return answer;
	}
}
