package day7;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calc = new Calculator();
		calc.intro();
		calc.sum(5, 10);
		int sum = calc.sum(5, 10);  // sum에 결과값을 담고 sum을 출력한다 // 여러번 호출해도 상관없다.
		System.out.println(sum);
		sum =calc.sum(300, 1500);
		System.out.println(sum);
		sum =calc.sum(5.3, 3.1);
		System.out.println(sum);
		sum = calc.sum(10, 20,30.5);
		System.out.println(sum);

	}

}
