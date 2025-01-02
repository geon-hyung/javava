package day5;

public class Human {
	String name;
	int age;
	String addr;
	Double height;
	boolean inSingle;

	void speak(String name) {
		// 말한다
		System.out.println(name + "이 말한다.");
	}

	void eat() {
		System.out.println("맛있는걸 먹는다.");
		// 먹는다
	} 
	void intro(String name, int age, String addr) {
		System.out.println(name+"의 나이는" +age + "주소는" + addr + "입니다.");
		//이름 나이 주소 
		// 000의 나이는 00 주소는 00 입니다.
	}
	void intro2(String name) {
		System.out.println(name+"의 나이는" +age + "주소는" + addr + "입니다.");
		
	}


}
