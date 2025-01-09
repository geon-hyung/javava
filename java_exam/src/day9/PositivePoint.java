package day9;

public class PositivePoint extends Point{
	
	PositivePoint(){
		super(0,0);
	}
	PositivePoint(int x, int y){
		super(x,y);
		if((x < 0 || y <0)) { // 둘다 양수일때 이동한다 . 
		super.move(0, 0);
		} 
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" +getX() +","+getY()+","+")의 점";

	}
	
	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if(!(x < 0 || y <0)) { // 둘다 양수일때 이동한다 . 
			super.move(x, y);
		}
	}
}
