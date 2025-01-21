package day17;

public abstract class  Animal {
	private String name;
	private int age;
	
	
	//생성자로 초기화 
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// 추상메소드는 내용이 구현이 되지 않는다 
	abstract void sound ();
	
	void eat () {
		System.out.println("먹는다");
	}
	
	void sleep() {
		System.out.println("잔다");
	}
	
	
	
}
