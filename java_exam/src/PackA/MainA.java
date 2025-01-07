package PackA;

public class MainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		a.varDefault = 10;       // 같은 패키지이므로 접근가능
		a.varProtected = 10;  // 같은 패키지이므로 접근가능
		a.varPublic = 10;
//		a.varPrivate = 10;      // private 이라 접근불가 (같은 클래스에서만 접근 가능 )
		

	}

}
