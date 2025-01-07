package day8;

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orange orange = new Orange();
		orange.name = "오렌지";
		orange.color = "주황색";
		orange.price = 100000;
		
		System.out.println(orange.toString()); //객체명으로만 출력해도 가능하다==orange 호출 

	}

}
