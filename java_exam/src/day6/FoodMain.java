package day6;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food beer = new Food("맥주", 3000) ;
		beer.setPrice(3500);      /// 수정시 set
		
		System.out.println(beer.getPrice());

	}

}
