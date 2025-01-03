package day6;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동",30,"인천");// 메소드 //클래스의 이름과 동일한 생성자를 호출하고있다.  
		System.out.println(hong.name);
		Human kim = new Human("김철수",25,"제주도");
		
		System.out.println(kim.name);
		//김철수 , 25 . 제주도 
//		System.out.println();
//		hong.study();
//		hong.eat("사과");

		//박영희, 35 
		Human park = new Human("박영희",35);
		System.out.println(park.addr);
		
		
	}

}
