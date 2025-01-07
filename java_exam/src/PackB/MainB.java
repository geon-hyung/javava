package PackB;

import PackA.ClassA;   //다른패키지내에 클래스 파일에 접근하려면 임포트를 해줘야한다.

public class MainB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		a.varPublic = 10;
//		a.varDefault = 10; // 다른 패키지이므로 접근 불가
//		a.varProtected = 10; // 다른 패키지이므로 접근 불가
//		a.varPrivate = 10; 
		// private 이라 접근 불가(같은 클래스에서만 접근 가능)

	}

}
