package day9;

public class ColorPoint extends Point{
	String color;

	ColorPoint(int x, int y ,String color){
		super(x,y);
		this.color = color;
	
	
	}
	ColorPoint(){
		super(0,0);
	}
	void setXY(int x, int y) {
		move(x,y);
	}
	void setColor(String color) {
		color = "BLACK" ;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return.toString("색의" + getX() +getY());
	}
}
