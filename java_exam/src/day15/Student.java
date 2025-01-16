package day15;

public class Student {
	private String name;
	private int id;
	private int kor;
	private int eng;
	private int math;
	
	
	
	public Student (String name ,int id, int kor, int eng, int math) {
		this.name = name;
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAverage() {
		 return getTotal() / 3.0;
	}

	public static void main(String[] args) {
//		목표: 학생의 이름, 학번, 그리고 성적(국어, 영어, 수학)을 입력받고, 
//		학생의 총점과 평균을 계산하여 출력하는 프로그램을 작성하시오. 
//		이 프로그램은 Student라는 클래스를 이용하여 구현해야 합니다.
//		Student 클래스:
//		필드: name (학생 이름), id (학번), kor (국어 성적), eng (영어 성적), math (수학 성적)
//		생성자: 학생의 이름, 학번, 성적을 입력받아 필드를 초기화하는 생성자
//		메소드:
//		getTotal(): 총점 계산 (국어 + 영어 + 수학)
//		getAverage(): 평균 계산 (총점 / 3)
//		printInfo(): 학생의 이름, 학번, 총점, 평균을 출력
//		Main 클래스:
//		Student 객체를 생성하여 학생 정보를 입력받고, 총점과 평균을 출력하는 프로그램을 작성.

	}

}
