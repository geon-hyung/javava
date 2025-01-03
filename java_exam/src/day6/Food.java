package day6;

public class Food {
	private String name ;
	private int price ;
	//푸드 클래스 안에서만 사용 가능하다 
	Food(String name, int price){ //접근지정자에 프라이
		this.name = name;
		this.price = price;
	}
	//get set 지정 할때 마우스 우클릭 소스 + 재너레이트 올 
	void sell() {
		System.out.println(price + "원에 판매했습니다. ");
	}
//	void setPrice(int price) {
//		if(price < 0) {
//			System.out.println("가격은 다시 확인해주세요.");
//			return;  //조건에 맞아서 리턴을 실행하면 메소드를 바로 빠져나간다.  
//		}
//		System.out.println("정말"+ price + "r가 맞습니까? ");	
//		
//		this.price = price;
//	}
//int getPrice() {
//return price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
