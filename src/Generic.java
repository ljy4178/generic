
public class Generic<T> {
		T[] v;  // String[] name= {"Hong","Kim"};
		//	Integer[] integer= {new Integer(1)};//v에 배열 자체가 들어감
	// object[] 를 대표 타입인 T[]로 바꿨다.
		
	void set(T[] n) { //다형성 때문에 String이 아니라 Object로 받음--String말고 다른 타입도 받아야 해서 최상위 클래스 타입으로 받음)
	v = n;
	}
	
	T[] get() {
	return v;
	}
	
	void print() {
	for(T o: v) {
	System.out.println(o);
	}
	}

}
