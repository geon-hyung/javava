package day8;

public class Person {
	String name ;
	int age ;
	String addr;
	
	Person(){ //실행은 자식클래스가 먼저 실행하지만 부모클래스가 우선으로 실행된다 . 
		System.out.println("부모 클래스 생성자 실행!."); //person (){}//기본생성자를 생성 해줘야 한다 
	}
	
	Person(String name, int age , String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	
	void eat () {
		System.out.println("먹는다.");
	}
	void sleep() {
		System.out.println("잔다");
	}

}
