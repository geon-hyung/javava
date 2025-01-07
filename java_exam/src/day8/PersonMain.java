package day8;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person ("홍길동", 30, "서울");
//		hong.study();// 
		Student kim = new Student("김철수",25,"인천"); // 매게변수 
//		kim.name = "김철수"; // name은 Person에 있는 요소이지만 상속받은 
		kim.eat();      //eat은 Person에 있는 요소이지만 상속받은 
		kim.study();
				//
 		Student park = new Student("박영희",20,"제주도","234242");
 		
 		

	}

}
