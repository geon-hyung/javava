package day10;

public class Dog extends Animal {
	private String breed;
	
	Dog(){
		super("알 수 없음", 0);
	}

	Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	


	}@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	public String getbreed;

}
