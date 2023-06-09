
public class NoGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoGeneric noGeneric = new NoGeneric();
		
		String[] name= {"Hong","Kim"};
		//Integer[] integer= {new Integer(1),new Integer(2)};
		
		noGeneric.set(name);
		//noGeneric.set(integer); //스트링 타입이 들어갈 때 오브젝트 타입으로 들어가기 때문에 캐스팅을 해줘야 한다.
		
		Object[] v= noGeneric.get(); // 오브젝트에서 스트링 타입으로 다시 돌아옴
		 String[] ss = (String[])v; // 오브젝트의 자식클래스인 스트링 클래스의 값도 쓰기 위해서 타입을 스트링 타입으로 변환
		//String[] ss =(String[])v[0]; //스트링 배열타입으로 캐스팅
		
		System.out.println(v[0]);
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		
		Integer[] integers = {1,2};
		noGeneric.set(integers);
	
		Object[] v2=noGeneric.get();
		Integer[] ii= (Integer[])v2;
		System.out.println(ii[0]);
		System.out.println(ii[1]);

	}

}
