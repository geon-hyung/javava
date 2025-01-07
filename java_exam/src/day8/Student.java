package day8;

public class Student extends Person{ // extends 상속 명칭 
	//눈에 보이지는 않지만 클래스는 상속받은 변수와 메소드를 갖고 있다 
	
	String stuNo; // 학번 
	int grade ;// 학년
	
	Student(){
		System.out.println("자식 클래스 생성자 실행!");
	}
	// 지정을 하지 않는 경우 기본생성자를 호출함 
	Student(String name,int age,String addr){
//		super(); //부모의 기본 생성자를 호출함 
	super(name,age,addr);  // 매개변수를 넣어준다 
	} 
	
	Student(String name, int age, String addr, String stuNo){
		super(name,age,addr);     //super 라는 키워드를 첫줄에 넣는다 부모클래스를 먼저 실행 후 자식 실행 
	 this.stuNo = stuNo;
	}  
	
	
	void study() {
		System.out.println(name+"이 공부하고 있습니다."); //펄슨에서 name를 상속을 받았기 때문에 사용이 가능
	}

}
