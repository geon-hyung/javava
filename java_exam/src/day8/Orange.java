package day8;

public class Orange extends Fruit{
	
	void print() {
		// TODO Auto-generated method stub
		//super.print(); 내 마음대로 변경이 가능하다 부모의 있는 메소드를 호출하고 싶다면 슈퍼  
 	System.out.println("오렌지는 달다");
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "과일명 :" + name + "색 :" + color + ", 가격 :"+price;
	}

}
