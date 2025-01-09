package day10;

public class Animal {
	private String name;
	private int age;
	String sound;
	
		

	
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void info() {
	      System.out.println("이름:");
	}
	void sound() {
	          System.out.println(name + "가 소리를 냅니다.");
	}
	

}
