
public class Generic2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generic2<String, Integer> g1 = new Generic2<>();
		//뒤쪽의 타입<String, Integer>을 생략가능하되 꺾쇠 기호는 남겨둔다.
		
		g1.set("Hong", 1111);
		
		System.out.println(g1.getName());
		System.out.println(g1.getId());
		
		
	}

}
