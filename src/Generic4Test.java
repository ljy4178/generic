import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generic4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("name", "홍길동");
		hm.put("id", "hong");
		hm.put("age", 30);
		
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "이순신");
		hm.put("id", "lee");
		hm.put("age", 40);
		
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "김유신");
		hm.put("id", "kim");
		hm.put("age", 50);
		
		list.add(hm);
		
		//배열에서 객체 값을 가져올 때 get()메소드를 쓰고 지금 hm은 주소값이지만 hm에 들어간 값 자체가 맵 객체이다.
		//인덱스번호로 구해야 하니까 향상된 for문이 아닌 일반 for문을 쓴다.
		for(int i=0; i <list.size(); i++){ //리스트는 길이(length())가 아닌 크기(Size)를 쓴다.
			System.out.println(list.get(i).get("name") + "," + list.get(i).get("id") + "," + list.get(i).get("age"));
		}
		
		
		
		
		
		
	}

}
