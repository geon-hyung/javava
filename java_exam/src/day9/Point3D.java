package day9;

public class Point3D extends Point{
	int z; 

	
	Point3D(int x, int y,int z ){
		super(x,y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" +getX() +","+getY()+","+ z+")의 점";
	}
	
	void moveUp() {
		z++;
	}
	void moveDown() {
		z--;
	}
	 //move가 부모클래스에 들어가 있기때문에 초기화를 시켜준다 
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z= z;
	}

}
