package day18;

import java.util.ArrayList;

public class Student extends Human {
	private String num;

	Student(String name, int age, String num) {
		super(name, age);
		this.num = num;

	}

	ArrayList<String> subjectList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("자바");
		list.add("오라클");
		list.add("html");
		return list;
	}

}
