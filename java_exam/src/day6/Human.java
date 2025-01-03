package day6;

public class Human {
	String name;
	int age;
	String addr;

	Human(String name, int age, String addr) {
		this.name = name; // 이전에 name과 비교 되도록 this 를 사용해서 출력
		this.age = age;
		this.addr = addr;
	}

	Human(String name, int age) { // 생성자는 무조건 맨앞으로 와야한다 /this()/
		this(name,age,"알수없음");           
//		this.name = name;     ==위와 같음 
//		this.age = age;          
//		this.addr = "알수없음";
	System.out.println("생성자를 호출했습니다. ");
	}
	// 생성자 이름 특징 클래스이름과 동일하게 만든다, 리턴값을 갖고있지않으므로 ,불가 

	void study() {
		System.out.println("공부를 합니다.");
	}

	String eat(String food) {
		return food + "를(을) 먹습니다.";
	}

}
