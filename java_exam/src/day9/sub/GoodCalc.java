package day9.sub;

public class GoodCalc implements Calculator{ // 인터페이스의 것을 상속 받으려면 임플리먼츠 사용 해서 상속 받는다 .
  
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	} 
	

}
