package day7;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천");
//		hong.name = "홍길동";
//		hong.age = 30;
//		hong.addr ="의정부";
		hong.intro();
		hong.setAge(hong.getAge()+1);
		//set 설정 get 리턴 값을 가져온다 // 전체는 31 
		hong.money = 40000;
		System.out.println("홍길동 가진 돈 "+ hong.money);
		
		hong.money_708 = 195000;
		
		
		
		
		
		Human kim = new Human("김철수", 20, "제주도");
		int age = kim.getAge();
		kim.money = 80000;
		System.out.println("철수가 가진 돈 " + kim.money);
		
		System.out.println("철수가 회비 확인 " + kim.money_708);
		
		Human.money_708 = 100000;
		System.out.println("길동이가 회비 확인 "+hong.money_708);

	}

}
