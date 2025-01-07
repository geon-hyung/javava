package day7;

public class Frult {
	private String name;
	private int price;
	private int num;
	
	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getPrice() {
		return price;
	}

	public final void setPrice(int price) {
		this.price = price;
	}

	public final int getNum() {
		return num;
	}

	public final void setNum(int num) {
		this.num = num;
	}

	Frult(String name, int price , int num){
		this.name = name;
		this.price = price;
		this.num = num;
	}                                       // 위와 아래는 같은 결과입니다 
//	Fruit(String name ,int price)
//	this(name , price , 0);
//	this.name = name;
//	this.price= price;
//	this.num = 0;
//	
	void toSting2(){
		System.out.println(name+"의 가격은" + price + "입니다.");
	}

}
