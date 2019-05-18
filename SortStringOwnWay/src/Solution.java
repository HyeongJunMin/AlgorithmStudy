import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
	public String[] solution(String[] strings, int n) {
		
		int size = strings.length;
		String[] answer = new String[size];
		String[][] save = new String[size][2];
		int j = 0;
		
		Map<Integer, Character> hM = new HashMap<Integer, Character>();
		for(int i = 0 ; i < size ; i++) {
			hM.put(i, strings[i].charAt(n));
		}
//		hM.put(0, 'u');
//		hM.put(1, 'e');
//		hM.put(2, 'a');
		
		List<Map.Entry<Integer, Character>> lst = new LinkedList<>(hM.entrySet());
		//	value 내림차순으로 정렬하고, value가 같으면 key 오름차순 정렬
		
		Collections.sort(lst, new Comparator<Map.Entry<Integer, Character>>(){
			@Override
			public int compare(Map.Entry<Integer, Character> o1, Map.Entry<Integer, Character> o2){
				 int com = (o1.getValue() - o2.getValue() ) ;
				return com == 0 ?o1.getKey().compareTo(o2.getKey()) : com;
			}			
		});
		
        // 순서유지를 위해 LinkedHashMap을 사용
        Map<Integer, Character> sortedMap = new LinkedHashMap<>(); 
        for(Iterator<Map.Entry<Integer, Character>> iter = lst.iterator(); iter.hasNext();){
            Map.Entry<Integer, Character> entry = iter.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println(sortedMap);
		
        
        int i = 0;
        for(Iterator<Map.Entry<Integer, Character>> iter = lst.iterator(); iter.hasNext();){
            Map.Entry<Integer, Character> entry = iter.next();
            answer[i++] = strings[entry.getKey()];
        }
		
	
		return answer;
	}
}