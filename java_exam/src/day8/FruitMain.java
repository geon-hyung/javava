package day8;

public class FruitMain {
	
	static void fruitBoxing(Fruit f, int num) { //업캐스팅의 예시 = 하나의 메소드의 여러가지를 담는다 . 
		System.out.println(f.name + "를 담았습니다."); 
	}
	
//	static void Orangeboxing(Orange o,int num) {
//		System.out.println(o.name +num+"개 박스에 담았습니다.");
//	} //클래스명으로 입력해도 된다 .
//	static void Bananaboxing(Banana b,int num) {
//		System.out.println(b.name +num+"개 박스에 담았습니다.");
//		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// orange. print ==부모에게 있는 과일은 맛있다가 출력된다 . 
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 100000;
//		fruitBoxing(orange, 5);
		orange.print();
		
		Banana  banana  = new Banana ();
		banana.name = "바나나";
//		fruitBoxing(banana,8);
		banana.print();
	}

}
