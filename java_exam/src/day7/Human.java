package day7;

public class Human {
	private String name;
	private int age;
	private String addr;
	int money = 50000;
	static int money_708 = 200000;
	
	Human(String name, int age, String addr){
		 this.name =name;
		 this.age = age;
		 this.addr= addr;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getAge() {
		return age;
	}
	public final void setAge(int age) {
		if (age<this.age) {
			System.out.println("현재 나이보다 큰 값을 입력하세요.");
		}else {
			this.age = age;
			System.out.println("나이가"+ age + "가 되었습니다.");
		}
	}
	public final String getAddr() {
		return addr;
	}
	public final void setAddr(String addr) {
		this.addr = addr;
	}
	//intro. 라는 메소드 호출 시 
	//ㅇㅇㅇ 의 나이는 ㅇㅇ, 주소는 ㅇㅇㅇ입니다. 출력
	void intro () {
		System.out.println(name +"의 나이는" + age + ", 주소는 "+ addr + "입니다.");
		
		
	}

}
