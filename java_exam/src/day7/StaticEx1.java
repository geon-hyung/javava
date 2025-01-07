package day7;

public class StaticEx1 {
	int num = 10; //defalt 생략됨  
	static final double PI = 3.141592; // final을 사용 하면 set으로도 수정 불가능
	// static 과 final 은 같이 묶어서 사용 함 
	int money = 50000;
	int sum (int x, int y) {
		return x+y;
	}
	static int staticSum(int x , int y) {
		return x+y;
	}

	
}
