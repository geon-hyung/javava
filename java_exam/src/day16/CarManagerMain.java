package day16;

public class CarManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car("소나타", 0, "검정");
		System.out.println(c);  // '차 종류는 소나타, 색은 검정 입니다'
		c.SpeedUp(100);
		System.out.println(c.SpeedUp()); // 100
		c.SpeedUp(150);
		System.out.println(c.SpeedDown()); // 200
		c.getSpeedDown(30);
		System.out.println(c.getSpeed); // 170
	}

}
