import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); //<>안에 기본형 타입은 넣을 수 없다. String은 가능
		list.add("1");
		list.add("2");
		list.add("3");
		
		// 배열이라 향상된 for문을 쓸 수 있다.
		for(String e : list ) { // 배열에 들어가는 값 타입이 스트링이라서 스트링을 써줌
			System.out.println(e);
		}
		
		list.forEach(System.out::println); // 위의 for문을 한 줄로 치면 이렇게 된다.
		
		//list.get(0); 
		
		System.out.println("==================================================");
		
		
		
		
		
		// map에 제네릭 사용하기

		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(4, "a");
		map.put(5, "b");
		map.put(6, "c");
		
		//Iterator쓰는 것보다 향상된 for문을 써서 더 쉽게 나타낼 수도 있다.
		for(Integer key: map.keySet()) {
			System.out.println(key);
		}
		
		
		
		Iterator<Integer> it = map.keySet().iterator();
		
//		Set set = map.keySet();
//		Iterator iterator= 
		
		while(it.hasNext()) {
			Integer key = it.next();//next()가 오브젝트 타입이었는데 인티저로 바뀌었다.
			System.out.println(key);
		}
		
		//밸류값 구하기
		Iterator<String> val = map.values().iterator();
		
		while(val.hasNext()) {
			String v = val.next();
			System.out.println(v);
		}
		
		System.out.println("===================================");
		
		//Map.entry도 향상된 for문으로 키 밸류값을 구할 수 있다.
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
		
		
		
		
		Iterator<Map.Entry<Integer, String>> it3 = map.entrySet().iterator();
		//map.entry에서 제네릭 적용할 때 이중 꺾쇠 조심 entry라는 map에 내부 인터페이스가 있어서
		
		while(it3.hasNext()) {
			Map.Entry<Integer, String> entry = it3.next();
			System.out.println(entry.getKey() + "," + entry.getValue());
			//System.out.println(entry.getValue());
			
		}
		
		
		
		
		
		
		
		
//		<T> Type약자
//
//		<E> Element
//
//		<K> key
//
//		<V> Value
//
//		<N> Number
		
	}

}
