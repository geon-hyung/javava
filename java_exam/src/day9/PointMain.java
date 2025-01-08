package day9;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1 번]Point를 상속받아색을 가진점을 나타내는ColorPoint 클래스를
//		작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW"); //최초엔 5,5 옐로우에서 변경 
		cp.setXY(10, 20); //x 와 y에 10,20이 들어가야한다 
		cp.setColor("RED");
		String str = cp.toString(); //str에는 red색의 10,20점 입니다 가 들어가야한다.
		System.out.println(str + "입니다. ");

//		파라미터 개수를 확인해서 생성자를 호출해준다
//		[2번] Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 
//		다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
		   ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		   System.out.println(zeroPoint.toString() + "입니다.");
//		   BLACK색의 (0,0) 점입니다.
		   ColorPoint cp2 = new ColorPoint(10, 10); 
//		   // (10,10) 위치의 BLACK 색 점
		   cp2.setXY(5,5);
		   cp2.setColor("RED");
		   System.out.println(cp2.toString()+"입니다.");
//		}
//			RED색의 (5,5) 점입니다.
//	}
}
