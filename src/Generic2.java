
public class Generic2<K,V> {
	//제네릭 기호 2가지를 한번에 쓰는 법
	
	K name;
	V id;
	
	void set(K name,V id) {
		this.name=name;
		this.id=id;
	}
	
	K getName() {
		return name;
	}
	
	V getId() {
		return id;
	}
	
	
	
}
