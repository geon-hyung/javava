package day7;

public class Calculator {
	// intro 메소드를 생성
	// 리턴은 없고 ,호출시  "계산기 객체 입니다." 출력 (리턴이 없을때 void 사용 ) 
	void intro() {
		System.out.println("계산기 객체 입니다.");
	}
	//int형 숫자 2개를 받아서 더한 후 되돌려 주는 메소드 만들기 
	// 무조건 리턴해줘야하는 메소드다 
	int sum(int x, int y) {
		return x+y;
	}
	
	//double 형 숫자 2개를 받아서 더한후 
	//소수점을 제거하고 int 형 데이터로 되돌려주는 메소드 만들기 괄호를 사용하면 억지로 int 형으로 변경가능 
	int sum(double x , double y) {
		return (int)(x+y);
	}
	int sum (int x, int y, double z) {
		return (int) (x + y + z); //  ==  x + y + (int) z; 
	}


}
