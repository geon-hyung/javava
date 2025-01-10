package day11;

public class Human {
		//사람들을 관리 하는 리스트 
	private String name;
	private int age;
	private String addr;
	
	Human(String name, int age , String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
		
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
		this.age = age;
	}

	public final String getAddr() {
		return addr;
	}

	public final void setAddr(String addr) {
		this.addr = addr;
	}

}
