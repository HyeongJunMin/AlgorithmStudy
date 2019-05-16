package lvl_one;

public class CorrectDayName {
	//2016년 1월 1일은 금요일이다.
	//2016년 a월 b일은 무슨 요일인지 리턴하는 메서드 solution을 작성하세요
	//2016년은 윤년입니다.
	
	public String solution (int a, int b) {
		String answer = "";
		String[] dayName = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		
		int month[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int num = 0;
		if(a > 1) {
			int monthNum=0;
			for(int i = 0; i < a-1; i++)
				monthNum += month[i];
			num = monthNum + b;	
		}else {
			num = b;
		}
		answer = dayName[num%7];
//		금	토	일	월	화	수	목 
//		1	2	3	4	5	6	7
//		금	토	일	월	화	수	목
//		8	9	10	11	12	13	14
//		금	토	일	월	화	수	목
//		15	16	17	18	19	20	21
//		금	토	일	월	화	수	목
//		22	23	24	25	26	27	28
//		금	토	일	월	화	수	목
//		29	30	31	32	33	34	35		
		return answer;
	}
}
