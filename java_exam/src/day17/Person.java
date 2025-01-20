package day17;

public class Person {
	
	private String name;
	private int age;
	private String mbti;
	
	Person(String name, int age){
		this.name=name;
		this.age= age;
	}
	
	void eat(String food) {
		System.out.println(food + "먹는다");
	}
	
	@Override
	public String toString() {           //s객체의 주소가 나오지 않게 오버라이딩 한다 
		// TODO Auto-generated method stub
		return name + "의"+ "mbti 는 "+ mbti +"입니다";
	}
	            
	void setMbti(String mbti){
		this.mbti = mbti;
	}
	String getMbti() {
		return mbti;
	}
	
	
	
	
	
}
