
public class GenericTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<String> g1 = new Generic<String>();
		//제네릭은 처음부터 타입을 정해놓고 써서 메소드 쓸 때 변수의 타입이 미리 정해져 있고 정해진 타입의 매개변수만 쓸 수 있다.
		
		String[] name = {"Hong","Kim"};
		g1.set(name);
		String[] v = g1.get(); //get의 리턴타입이 오브젝트(노제네릭)에서 스트링(제네릭)으로 바뀌었다.
		System.out.println(v[0]);
		
//		Integer[] it= {1,2,3};
//		g1.set(it);//더 이상 INteger를 받지 않는다.
		
		Generic<Integer> g2 = new Generic<Integer>();// integer타입을 받게 하려면 이렇게 integer객체를 생성한다.
		Integer[] it= {1,2,3};
		g2.set(it);
		
	}

}
