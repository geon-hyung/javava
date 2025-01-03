package day6;

public class Calculator {
//void 리턴값이 없고 한번만 출력한다
	void sum(int x, int y) {
		System.out.println("두 수의 합은" + (x + y));
	}

	// sum2 를 호출 하면 int형 데이터를 돌려준다 = 리턴타입 / 데이터타입을 맞춰 줘야함 int =int double double
	int sum2(int x, int y) {
		return x + y;
	}

    int multiple(int x, int y) {
	return x*y;
}
    double multiple(int x, double y) {
    	return x*y;
    }

	int multiple(int q, int w, int e) { // 메소드를 선언하고 곱해준다 .
		return q * w * e;
	}

}
