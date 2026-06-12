package ex2;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

//Key,Value 의 쌍으로 데이터를 저장하는 구조이다.
//Map의 키는 중복을 허용하지 않는 Set구조이고, 
//Set은 Collection인터페이스를 상속받았다.
public class Ex2_TreeMap {
	public static void main(String[] args) {
		// HashMap에서 Key는 Set이고 이 키값을 내림차순 정렬을 하려면
		// 안된다. 그래서 TreeMap이 되어야 하고 descendingMap()을 사용해서
		// 내림차순인 NavigableMap생성하고 정렬할 수 있다.
		// 원리는 TreeSet의 Key값 정렬이라 생각하면 됨!
		TreeMap<String, Integer> map1 = new TreeMap<String, Integer>();
		NavigableMap<String, Integer> map = map1.descendingMap();// 내림차순
		map.put("Z", 100);
		map.put("A", 90);
		map.put("D", 80);
		map.put("C", 80);
		map.put("F", 70);
		System.out.println("Map size:"+map.size());
		System.out.println("Map get(Key):"+map.get("F"));
		map.put("B", 80);
		map.put("F", 100); // key가 중복일 때는 갱신된다 ******
		System.out.println("Map size:"+map.size()); // 6
		System.out.println("Map get(Key):"+map.get("F"));
		System.out.println("----------Iterator------------*****");
		//Set을 사용해서 Entry를 반환받아서 반복자를 출력
		Set<Map.Entry<String, Integer>>  me = map.entrySet();
		java.util.Iterator<Map.Entry<String, Integer>> it = me.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println("Key:"+e.getKey() +":"+e.getValue());
		}
		System.out.println("---------foreach-------------*****");
		for(Map.Entry<String, Integer>  e : map.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
}
