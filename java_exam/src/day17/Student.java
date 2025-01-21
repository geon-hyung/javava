package day17;

import java.util.HashMap;

public class Student extends Person {

	private String stuNo;
	private int grade;

	Student(String name, int age, String stuNo, int grade) {
		super(name, age);
		this.stuNo = stuNo;
		this.grade = grade;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = super.toString() + "\n학번은" + stuNo + "학년은" + grade;
		return str;
	}

	String study(String subject) {
		return subject + "는 재밋다!";
	}

	HashMap<String, Object> getinfo() {
		HashMap<String, Object> map = new HashMap<>();
		map.put(stuNo, stuNo);
		map.put("grade", grade);
		return map;
	}

	void temp() {
		for (int i = 0; i < 100; i++) {
			if(i > 50) {
			return;               //return 이 단독적으로 사용 되면 해당 메소드를 빠져 나간다 . 
			}
			System.out.println(i);
		}
		System.out.println("test");
		System.out.println("test2");
		System.out.println("test3");
	}

}
