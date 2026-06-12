package ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map구조 *****
//Key,Value 의 쌍으로 데이터를 저장하는 구조이다.
//Map의 키는 중복을 허용하지 않는 Set구조이고, Set은 Collection인터페이스를 상속받았다.
public class Ex1_HashMap {
	public static void main(String[] args) {
		// Map<Key,Value> => Key가 Set이다.
		// key는 알파벳문자열 , 값은 점수
		HashMap<String, Integer> map = new HashMap<>();
		@SuppressWarnings("unused")
		HashMap<String, List<String>> map2 = null;
		// map에 값을 저장할 때는 put(key,val)
		map.put("Z", 100);
		map.put("A", 90);
		map.put("D", 80);
		map.put("C", 80);
		map.put("F", 70);
		System.out.println("Map size:" + map.size());
		System.out.println("Map get(Key):" + map.get("F"));
		map.put("B", 80);
		map.put("F", 100); // key가 중복일 때는 갱신된다 ******
		System.out.println("Map size:" + map.size());// 6
		System.out.println("Map get(Key):" + map.get("F")); // 100
		// Set을 사용해서 Entry를 반환받아서 반복자를 출력
		// map.entrySet() => Set을 반환 Set<Map.Entry<String,Integer>>
		
		System.out.println("----------Iterator------------*****");
		Set<Map.Entry<String, Integer>> me = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = me.iterator();
		while (it.hasNext()) {
			Map.Entry<String,Integer> e = it.next();
			System.out.println("Key"+e.getKey()+":"+e.getValue());
		}
		System.out.println("---------foreach-------------*****");
		//for(집합안자료형 e : 집합변수)
		for(Map.Entry<String, Integer> e :map.entrySet()) {
			System.out.println("Key"+e.getKey()+":"+e.getValue());
		}

	}
}




