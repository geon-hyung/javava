package day18;

public class Human {

	private String name;
	private int age;

	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = name + " 의 나이는" + age + "입니다";
		return str;
	}

	boolean setPhone(String Phone) {
		if(Phone.length() == 11) {
			return false;
		}else {
			System.out.println("핸드폰번호'-'이거 제거하고 입력 11글자");
			System.out.println("ex)01012341234");
			return true;
		}
		
	}

}
