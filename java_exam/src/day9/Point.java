package day9;

public class Point {
//	lass Point
//	{
	private int x, y; //두개의 변수선언 생성자를 통해 초기화중 

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {         //get 사용을 통해 사용가능
		return x;
	}

	public int getY() {
		return y;
	}

	protected void move(int x, int y) { //move 함수를 사용해서 x,y를 초기화  
		this.x = x;
		this.y = y;
	}

}