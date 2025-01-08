package day9.sub;

public interface Calculator { // 인터페이스는 설계목적으로 많이 사용함 //인터페이스에서 사용하는건 추상메소드 이다
	// 덧셈
	int sum(int x, int y);

	// 뺄셈
	int sub(int x, int y);

	// 곱셈
	int mul(int x, int y);

	// 나눗셈
	int div(int x, int y);
}
