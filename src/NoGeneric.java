
public class NoGeneric {
	Object[] v;  // String[] name= {"Hong","Kim"};
				//	Integer[] integer= {new Integer(1)};//v에 배열 자체가 들어감
	//타입이 뭐가 올지 모르니까 일단 최상위 클래스인 오브젝트 타입으로 받은 것
	
	
	void set(Object[] n) { //다형성 때문에 String이 아니라 Object로 받음--String말고 다른 타입도 받아야 해서 최상위 클래스 타입으로 받음)
		v = n;
	}
	
	Object[] get() {
		return v;
	}
	
	void print() {
		for(Object o: v) {
			System.out.println(o);
		}
	}
	
	
	
	
	
	
	
}
