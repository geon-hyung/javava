package day5;

public class Human_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Human hong = new Human();
	   hong.name = "홍길동";
	   hong.age = 30;
	   hong.addr = "인천";
	   hong.height = 170.2;
			   hong.inSingle = true;
	   System.out.println(hong.name);
	   hong.speak("길동");
	   hong.intro2("길동이"); //내부적으로 먼저 선언된 것이 우선순위로 입력된다 
	   //문자열을 입력해야 작동한다. 해당 값이 입력햇던 메소드에 들어감. 
//	   Human kim = new Human();
//	   kim.name= "김철수";
//	   System.out.println(kim.name);
//	   kim.speak("철수");
//	  kim.intro("철수", 25, "제주도");
	   
	}

}
